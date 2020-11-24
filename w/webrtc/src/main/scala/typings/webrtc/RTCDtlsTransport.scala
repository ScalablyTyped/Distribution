package typings.webrtc

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDtlsTransport extends js.Object {
  
  //readonly state: RTCDtlsTransportState;
  def getRemoteCertificates(): js.Array[ArrayBuffer] = js.native
  
  var onstatechange: DtlsTransportEventHandler = js.native
  
  val transport: RTCIceTransport = js.native
}
object RTCDtlsTransport {
  
  @scala.inline
  def apply(getRemoteCertificates: () => js.Array[ArrayBuffer], transport: RTCIceTransport): RTCDtlsTransport = {
    val __obj = js.Dynamic.literal(getRemoteCertificates = js.Any.fromFunction0(getRemoteCertificates), transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsTransport]
  }
  
  @scala.inline
  implicit class RTCDtlsTransportOps[Self <: RTCDtlsTransport] (val x: Self) extends AnyVal {
    
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
    def setGetRemoteCertificates(value: () => js.Array[ArrayBuffer]): Self = this.set("getRemoteCertificates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransport(value: RTCIceTransport): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstatechange(value: DtlsTransportEventHandler): Self = this.set("onstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstatechangeNull: Self = this.set("onstatechange", null)
  }
}
