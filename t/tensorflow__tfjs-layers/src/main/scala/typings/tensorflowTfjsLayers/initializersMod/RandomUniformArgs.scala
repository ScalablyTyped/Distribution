package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomUniformArgs extends js.Object {
  /** Upper bound of the range of random values to generate. */
  var maxval: js.UndefOr[Double] = js.undefined
  /** Lower bound of the range of random values to generate. */
  var minval: js.UndefOr[Double] = js.undefined
  /** Used to seed the random generator. */
  var seed: js.UndefOr[Double] = js.undefined
}

object RandomUniformArgs {
  @scala.inline
  def apply(
    maxval: js.UndefOr[Double] = js.undefined,
    minval: js.UndefOr[Double] = js.undefined,
    seed: js.UndefOr[Double] = js.undefined
  ): RandomUniformArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxval)) __obj.updateDynamic("maxval")(maxval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minval)) __obj.updateDynamic("minval")(minval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seed)) __obj.updateDynamic("seed")(seed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomUniformArgs]
  }
}

