package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrthogonalArgs extends SeedOnlyInitializerArgs {
  /**
    * Multiplicative factor to apply to the orthogonal matrix. Defaults to 1.
    */
  var gain: js.UndefOr[Double] = js.undefined
}

object OrthogonalArgs {
  @scala.inline
  def apply(gain: js.UndefOr[Double] = js.undefined, seed: js.UndefOr[Double] = js.undefined): OrthogonalArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gain)) __obj.updateDynamic("gain")(gain.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seed)) __obj.updateDynamic("seed")(seed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrthogonalArgs]
  }
}

