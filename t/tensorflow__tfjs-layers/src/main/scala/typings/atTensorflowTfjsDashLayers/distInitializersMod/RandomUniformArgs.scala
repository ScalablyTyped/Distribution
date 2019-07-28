package typings.atTensorflowTfjsDashLayers.distInitializersMod

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
  def apply(maxval: Int | Double = null, minval: Int | Double = null, seed: Int | Double = null): RandomUniformArgs = {
    val __obj = js.Dynamic.literal()
    if (maxval != null) __obj.updateDynamic("maxval")(maxval.asInstanceOf[js.Any])
    if (minval != null) __obj.updateDynamic("minval")(minval.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomUniformArgs]
  }
}

