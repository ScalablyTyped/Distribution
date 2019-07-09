package typings
package atTensorflowTfjsDashLayersLib.distInitializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VarianceScalingArgs extends js.Object {
  /** Probabilistic distribution of the values. */
  var distribution: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.Distribution
  ] = js.undefined
  /** Fanning mode for inputs and outputs. */
  var mode: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.FanMode
  ] = js.undefined
  /** Scaling factor (positive float). */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /** Random number generator seed. */
  var seed: js.UndefOr[scala.Double] = js.undefined
}

object VarianceScalingArgs {
  @scala.inline
  def apply(
    distribution: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.Distribution = null,
    mode: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatInitializerUnderscoreConfigMod.FanMode = null,
    scale: scala.Int | scala.Double = null,
    seed: scala.Int | scala.Double = null
  ): VarianceScalingArgs = {
    val __obj = js.Dynamic.literal()
    if (distribution != null) __obj.updateDynamic("distribution")(distribution)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[VarianceScalingArgs]
  }
}

