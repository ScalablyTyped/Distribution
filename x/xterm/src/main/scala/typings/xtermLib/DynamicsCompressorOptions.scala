package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicsCompressorOptions extends AudioNodeOptions {
  var attack: js.UndefOr[scala.Double] = js.undefined
  var knee: js.UndefOr[scala.Double] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
  var release: js.UndefOr[scala.Double] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object DynamicsCompressorOptions {
  @scala.inline
  def apply(
    attack: scala.Int | scala.Double = null,
    channelCount: scala.Int | scala.Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    knee: scala.Int | scala.Double = null,
    ratio: scala.Int | scala.Double = null,
    release: scala.Int | scala.Double = null,
    threshold: scala.Int | scala.Double = null
  ): DynamicsCompressorOptions = {
    val __obj = js.Dynamic.literal()
    if (attack != null) __obj.updateDynamic("attack")(attack.asInstanceOf[js.Any])
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (knee != null) __obj.updateDynamic("knee")(knee.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicsCompressorOptions]
  }
}

