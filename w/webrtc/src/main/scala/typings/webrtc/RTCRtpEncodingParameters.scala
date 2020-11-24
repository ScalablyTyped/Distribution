package typings.webrtc

import typings.std.RTCDtxStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpencodingparameters
@js.native
trait RTCRtpEncodingParameters extends js.Object {
  
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
  implicit class RTCRtpEncodingParametersOps[Self <: RTCRtpEncodingParameters] (val x: Self) extends AnyVal {
    
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
    def setRid(value: String): Self = this.set("rid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtx(value: RTCDtxStatus): Self = this.set("dtx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDtx: Self = this.set("dtx", js.undefined)
    
    @scala.inline
    def setScaleResolutionDownBy(value: Double): Self = this.set("scaleResolutionDownBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleResolutionDownBy: Self = this.set("scaleResolutionDownBy", js.undefined)
  }
}
