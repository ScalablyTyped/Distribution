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
  def apply(gain: Int | Double = null, seed: Int | Double = null): OrthogonalArgs = {
    val __obj = js.Dynamic.literal()
    if (gain != null) __obj.updateDynamic("gain")(gain.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrthogonalArgs]
  }
}

