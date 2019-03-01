package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioProcessingEventInit extends EventInit {
  var inputBuffer: AudioBuffer
  var outputBuffer: AudioBuffer
  var playbackTime: scala.Double
}

object AudioProcessingEventInit {
  @scala.inline
  def apply(
    inputBuffer: AudioBuffer,
    outputBuffer: AudioBuffer,
    playbackTime: scala.Double,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): AudioProcessingEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inputBuffer")(inputBuffer)
    __obj.updateDynamic("outputBuffer")(outputBuffer)
    __obj.updateDynamic("playbackTime")(playbackTime)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[AudioProcessingEventInit]
  }
}

