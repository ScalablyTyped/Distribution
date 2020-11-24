package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#dom-rtccertificate
@js.native
trait RTCCertificate extends js.Object {
  
  val expires: Double = js.native
  
  def getAlgorithm(): String = js.native
}
object RTCCertificate {
  
  @scala.inline
  def apply(expires: Double, getAlgorithm: () => String): RTCCertificate = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], getAlgorithm = js.Any.fromFunction0(getAlgorithm))
    __obj.asInstanceOf[RTCCertificate]
  }
  
  @scala.inline
  implicit class RTCCertificateOps[Self <: RTCCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAlgorithm(value: () => String): Self = this.set("getAlgorithm", js.Any.fromFunction0(value))
  }
}
