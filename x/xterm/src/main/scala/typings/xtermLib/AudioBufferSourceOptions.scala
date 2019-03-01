package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioBufferSourceOptions extends js.Object {
  var buffer: js.UndefOr[AudioBuffer | scala.Null] = js.undefined
  var detune: js.UndefOr[scala.Double] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var loopEnd: js.UndefOr[scala.Double] = js.undefined
  var loopStart: js.UndefOr[scala.Double] = js.undefined
  var playbackRate: js.UndefOr[scala.Double] = js.undefined
}

object AudioBufferSourceOptions {
  @scala.inline
  def apply(
    buffer: AudioBuffer = null,
    detune: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    loopEnd: scala.Int | scala.Double = null,
    loopStart: scala.Int | scala.Double = null,
    playbackRate: scala.Int | scala.Double = null
  ): AudioBufferSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (detune != null) __obj.updateDynamic("detune")(detune.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (loopEnd != null) __obj.updateDynamic("loopEnd")(loopEnd.asInstanceOf[js.Any])
    if (loopStart != null) __obj.updateDynamic("loopStart")(loopStart.asInstanceOf[js.Any])
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBufferSourceOptions]
  }
}

