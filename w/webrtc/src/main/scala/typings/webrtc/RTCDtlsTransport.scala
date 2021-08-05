package typings.webrtc

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDtlsTransport extends StObject {
  
  //readonly state: RTCDtlsTransportState;
  def getRemoteCertificates(): js.Array[ArrayBuffer]
  
  var onstatechange: DtlsTransportEventHandler
  
  val transport: RTCIceTransport
}
object RTCDtlsTransport {
  
  inline def apply(getRemoteCertificates: () => js.Array[ArrayBuffer], transport: RTCIceTransport): RTCDtlsTransport = {
    val __obj = js.Dynamic.literal(getRemoteCertificates = js.Any.fromFunction0(getRemoteCertificates), transport = transport.asInstanceOf[js.Any], onstatechange = null)
    __obj.asInstanceOf[RTCDtlsTransport]
  }
  
  extension [Self <: RTCDtlsTransport](x: Self) {
    
    inline def setGetRemoteCertificates(value: () => js.Array[ArrayBuffer]): Self = StObject.set(x, "getRemoteCertificates", js.Any.fromFunction0(value))
    
    inline def setOnstatechange(value: DtlsTransportEventHandler): Self = StObject.set(x, "onstatechange", value.asInstanceOf[js.Any])
    
    inline def setOnstatechangeNull: Self = StObject.set(x, "onstatechange", null)
    
    inline def setTransport(value: RTCIceTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
  }
}
