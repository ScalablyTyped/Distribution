package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpencodingparameters
trait RTCRtpEncodingParameters extends StObject {
  
  //ssrc: number;
  //rtx: RTCRtpRtxParameters;
  //fec: RTCRtpFecParameters;
  // dtx?: RTCDtxStatus;
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
    
    inline def setRid(value: String): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    inline def setScaleResolutionDownBy(value: Double): Self = StObject.set(x, "scaleResolutionDownBy", value.asInstanceOf[js.Any])
    
    inline def setScaleResolutionDownByUndefined: Self = StObject.set(x, "scaleResolutionDownBy", js.undefined)
  }
}
