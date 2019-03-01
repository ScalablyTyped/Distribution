package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcofferoptions
trait RTCOfferOptions extends RTCOfferAnswerOptions {
  var iceRestart: js.UndefOr[scala.Boolean] = js.undefined
}

object RTCOfferOptions {
  @scala.inline
  def apply(
    iceRestart: js.UndefOr[scala.Boolean] = js.undefined,
    voiceActivityDetection: js.UndefOr[scala.Boolean] = js.undefined
  ): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iceRestart)) __obj.updateDynamic("iceRestart")(iceRestart)
    if (!js.isUndefined(voiceActivityDetection)) __obj.updateDynamic("voiceActivityDetection")(voiceActivityDetection)
    __obj.asInstanceOf[RTCOfferOptions]
  }
}

