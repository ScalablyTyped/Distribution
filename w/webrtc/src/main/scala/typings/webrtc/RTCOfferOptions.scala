package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcofferoptions
trait RTCOfferOptions extends RTCOfferAnswerOptions {
  var iceRestart: js.UndefOr[Boolean] = js.undefined
}

object RTCOfferOptions {
  @scala.inline
  def apply(
    iceRestart: js.UndefOr[Boolean] = js.undefined,
    voiceActivityDetection: js.UndefOr[Boolean] = js.undefined
  ): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iceRestart)) __obj.updateDynamic("iceRestart")(iceRestart.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceActivityDetection)) __obj.updateDynamic("voiceActivityDetection")(voiceActivityDetection.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOfferOptions]
  }
}

