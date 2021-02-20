package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#dom-rtccertificate
@js.native
trait RTCCertificate extends StObject {
  
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
  implicit class RTCCertificateMutableBuilder[Self <: RTCCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAlgorithm(value: () => String): Self = StObject.set(x, "getAlgorithm", js.Any.fromFunction0(value))
  }
}
