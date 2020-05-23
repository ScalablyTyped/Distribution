package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#dom-rtcrtpcontributingsource
trait RTCRtpContributingSource extends js.Object {
  //readonly timestamp: number;
  var source: Double
  //readonly audioLevel: number | null;
  val voiceActivityFlag: js.UndefOr[Boolean] = js.undefined
}

object RTCRtpContributingSource {
  @scala.inline
  def apply(source: Double, voiceActivityFlag: js.UndefOr[Boolean] = js.undefined): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceActivityFlag)) __obj.updateDynamic("voiceActivityFlag")(voiceActivityFlag.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
}

