package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeedOnlyInitializerArgs extends js.Object {
  /** Random number generator seed. */
  var seed: js.UndefOr[Double] = js.undefined
}

object SeedOnlyInitializerArgs {
  @scala.inline
  def apply(seed: js.UndefOr[Double] = js.undefined): SeedOnlyInitializerArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(seed)) __obj.updateDynamic("seed")(seed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeedOnlyInitializerArgs]
  }
}

