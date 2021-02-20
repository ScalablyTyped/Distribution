package typings.webrtc

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDtlsTransport extends StObject {
  
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
  implicit class RTCDtlsTransportMutableBuilder[Self <: RTCDtlsTransport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRemoteCertificates(value: () => js.Array[ArrayBuffer]): Self = StObject.set(x, "getRemoteCertificates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnstatechange(value: DtlsTransportEventHandler): Self = StObject.set(x, "onstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstatechangeNull: Self = StObject.set(x, "onstatechange", null)
    
    @scala.inline
    def setTransport(value: RTCIceTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
  }
}
