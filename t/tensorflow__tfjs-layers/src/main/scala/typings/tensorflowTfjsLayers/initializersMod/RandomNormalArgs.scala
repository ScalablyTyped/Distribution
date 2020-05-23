package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomNormalArgs extends js.Object {
  /** Mean of the random values to generate. */
  var mean: js.UndefOr[Double] = js.undefined
  /** Used to seed the random generator. */
  var seed: js.UndefOr[Double] = js.undefined
  /** Standard deviation of the random values to generate. */
  var stddev: js.UndefOr[Double] = js.undefined
}

object RandomNormalArgs {
  @scala.inline
  def apply(
    mean: js.UndefOr[Double] = js.undefined,
    seed: js.UndefOr[Double] = js.undefined,
    stddev: js.UndefOr[Double] = js.undefined
  ): RandomNormalArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mean)) __obj.updateDynamic("mean")(mean.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seed)) __obj.updateDynamic("seed")(seed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stddev)) __obj.updateDynamic("stddev")(stddev.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomNormalArgs]
  }
}

