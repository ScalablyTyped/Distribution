package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncatedNormalArgs extends js.Object {
  /** Mean of the random values to generate. */
  var mean: js.UndefOr[Double] = js.undefined
  /** Used to seed the random generator. */
  var seed: js.UndefOr[Double] = js.undefined
  /** Standard deviation of the random values to generate. */
  var stddev: js.UndefOr[Double] = js.undefined
}

object TruncatedNormalArgs {
  @scala.inline
  def apply(mean: Int | Double = null, seed: Int | Double = null, stddev: Int | Double = null): TruncatedNormalArgs = {
    val __obj = js.Dynamic.literal()
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (stddev != null) __obj.updateDynamic("stddev")(stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncatedNormalArgs]
  }
}

