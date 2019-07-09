package typings
package atTensorflowTfjsDashLayersLib.distInitializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncatedNormalArgs extends js.Object {
  /** Mean of the random values to generate. */
  var mean: js.UndefOr[scala.Double] = js.undefined
  /** Used to seed the random generator. */
  var seed: js.UndefOr[scala.Double] = js.undefined
  /** Standard deviation of the random values to generate. */
  var stddev: js.UndefOr[scala.Double] = js.undefined
}

object TruncatedNormalArgs {
  @scala.inline
  def apply(
    mean: scala.Int | scala.Double = null,
    seed: scala.Int | scala.Double = null,
    stddev: scala.Int | scala.Double = null
  ): TruncatedNormalArgs = {
    val __obj = js.Dynamic.literal()
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (stddev != null) __obj.updateDynamic("stddev")(stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncatedNormalArgs]
  }
}

