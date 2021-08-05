package typings.webrtc

import typings.std.RTCDtxStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpencodingparameters
trait RTCRtpEncodingParameters extends StObject {
  
  //ssrc: number;
  //rtx: RTCRtpRtxParameters;
  //fec: RTCRtpFecParameters;
  var dtx: js.UndefOr[RTCDtxStatus] = js.undefined
  
  //active: boolean;
  //priority: RTCPriorityType;
  //maxBitrate: number;
  var rid: String
  
  var scaleResolutionDownBy: js.UndefOr[Double] = js.undefined
}
object RTCRtpEncodingParameters {
  
  inline def apply(rid: String): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal(rid = rid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
  
  extension [Self <: RTCRtpEncodingParameters](x: Self) {
    
    inline def setDtx(value: RTCDtxStatus): Self = StObject.set(x, "dtx", value.asInstanceOf[js.Any])
    
    inline def setDtxUndefined: Self = StObject.set(x, "dtx", js.undefined)
    
    inline def setRid(value: String): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    inline def setScaleResolutionDownBy(value: Double): Self = StObject.set(x, "scaleResolutionDownBy", value.asInstanceOf[js.Any])
    
    inline def setScaleResolutionDownByUndefined: Self = StObject.set(x, "scaleResolutionDownBy", js.undefined)
  }
}
