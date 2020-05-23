package typings.vis.mod

import typings.vis.anon.DrawThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsScaling extends js.Object {
  var customScalingFunction: js.UndefOr[
    js.Function4[
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      /* total */ js.UndefOr[Double], 
      /* value */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
  var label: js.UndefOr[Boolean | DrawThreshold] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object OptionsScaling {
  @scala.inline
  def apply(
    customScalingFunction: (/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* total */ js.UndefOr[Double], /* value */ js.UndefOr[Double]) => Double = null,
    label: Boolean | DrawThreshold = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): OptionsScaling = {
    val __obj = js.Dynamic.literal()
    if (customScalingFunction != null) __obj.updateDynamic("customScalingFunction")(js.Any.fromFunction4(customScalingFunction))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsScaling]
  }
}

