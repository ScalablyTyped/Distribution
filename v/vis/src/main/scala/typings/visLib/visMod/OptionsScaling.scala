package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsScaling extends js.Object {
  var customScalingFunction: js.UndefOr[
    js.Function4[
      /* min */ js.UndefOr[scala.Double], 
      /* max */ js.UndefOr[scala.Double], 
      /* total */ js.UndefOr[scala.Double], 
      /* value */ js.UndefOr[scala.Double], 
      scala.Double
    ]
  ] = js.undefined
  var label: js.UndefOr[scala.Boolean | visLib.Anon_DrawThreshold] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

object OptionsScaling {
  @scala.inline
  def apply(
    customScalingFunction: js.Function4[
      /* min */ js.UndefOr[scala.Double], 
      /* max */ js.UndefOr[scala.Double], 
      /* total */ js.UndefOr[scala.Double], 
      /* value */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    label: scala.Boolean | visLib.Anon_DrawThreshold = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): OptionsScaling = {
    val __obj = js.Dynamic.literal()
    if (customScalingFunction != null) __obj.updateDynamic("customScalingFunction")(customScalingFunction)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsScaling]
  }
}

