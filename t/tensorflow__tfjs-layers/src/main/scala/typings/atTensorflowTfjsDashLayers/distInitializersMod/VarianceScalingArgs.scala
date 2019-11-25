package typings.atTensorflowTfjsDashLayers.distInitializersMod

import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.Distribution
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.FanMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VarianceScalingArgs extends js.Object {
  /** Probabilistic distribution of the values. */
  var distribution: js.UndefOr[Distribution] = js.undefined
  /** Fanning mode for inputs and outputs. */
  var mode: js.UndefOr[FanMode] = js.undefined
  /** Scaling factor (positive float). */
  var scale: js.UndefOr[Double] = js.undefined
  /** Random number generator seed. */
  var seed: js.UndefOr[Double] = js.undefined
}

object VarianceScalingArgs {
  @scala.inline
  def apply(
    distribution: Distribution = null,
    mode: FanMode = null,
    scale: Int | Double = null,
    seed: Int | Double = null
  ): VarianceScalingArgs = {
    val __obj = js.Dynamic.literal()
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[VarianceScalingArgs]
  }
}

