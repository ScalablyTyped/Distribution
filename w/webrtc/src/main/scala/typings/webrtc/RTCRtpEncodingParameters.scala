package typings.webrtc

import typings.std.RTCDtxStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpencodingparameters
@js.native
trait RTCRtpEncodingParameters extends StObject {
  
  //ssrc: number;
  //rtx: RTCRtpRtxParameters;
  //fec: RTCRtpFecParameters;
  var dtx: js.UndefOr[RTCDtxStatus] = js.native
  
  //active: boolean;
  //priority: RTCPriorityType;
  //maxBitrate: number;
  var rid: String = js.native
  
  var scaleResolutionDownBy: js.UndefOr[Double] = js.native
}
object RTCRtpEncodingParameters {
  
  @scala.inline
  def apply(rid: String): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal(rid = rid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
  
  @scala.inline
  implicit class RTCRtpEncodingParametersMutableBuilder[Self <: RTCRtpEncodingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDtx(value: RTCDtxStatus): Self = StObject.set(x, "dtx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtxUndefined: Self = StObject.set(x, "dtx", js.undefined)
    
    @scala.inline
    def setRid(value: String): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleResolutionDownBy(value: Double): Self = StObject.set(x, "scaleResolutionDownBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleResolutionDownByUndefined: Self = StObject.set(x, "scaleResolutionDownBy", js.undefined)
  }
}
