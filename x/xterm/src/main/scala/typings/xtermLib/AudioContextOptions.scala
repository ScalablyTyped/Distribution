package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioContextOptions extends js.Object {
  var latencyHint: js.UndefOr[AudioContextLatencyCategory | scala.Double] = js.undefined
  var sampleRate: js.UndefOr[scala.Double] = js.undefined
}

object AudioContextOptions {
  @scala.inline
  def apply(
    latencyHint: AudioContextLatencyCategory | scala.Double = null,
    sampleRate: scala.Int | scala.Double = null
  ): AudioContextOptions = {
    val __obj = js.Dynamic.literal()
    if (latencyHint != null) __obj.updateDynamic("latencyHint")(latencyHint.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioContextOptions]
  }
}

