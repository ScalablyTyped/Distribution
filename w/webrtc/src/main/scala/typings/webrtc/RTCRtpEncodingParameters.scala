package typings.webrtc

import typings.std.RTCDtxStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpencodingparameters
trait RTCRtpEncodingParameters extends js.Object {
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
  @scala.inline
  def apply(rid: String, dtx: RTCDtxStatus = null, scaleResolutionDownBy: js.UndefOr[Double] = js.undefined): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal(rid = rid.asInstanceOf[js.Any])
    if (dtx != null) __obj.updateDynamic("dtx")(dtx.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleResolutionDownBy)) __obj.updateDynamic("scaleResolutionDownBy")(scaleResolutionDownBy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
}

