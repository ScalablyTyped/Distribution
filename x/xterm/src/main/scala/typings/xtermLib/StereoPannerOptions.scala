package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StereoPannerOptions extends AudioNodeOptions {
  var pan: js.UndefOr[scala.Double] = js.undefined
}

object StereoPannerOptions {
  @scala.inline
  def apply(
    channelCount: scala.Int | scala.Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    pan: scala.Int | scala.Double = null
  ): StereoPannerOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    __obj.asInstanceOf[StereoPannerOptions]
  }
}

