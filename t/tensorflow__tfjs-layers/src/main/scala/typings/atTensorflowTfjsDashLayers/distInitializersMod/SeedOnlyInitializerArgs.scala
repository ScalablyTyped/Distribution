package typings.atTensorflowTfjsDashLayers.distInitializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeedOnlyInitializerArgs extends js.Object {
  /** Random number generator seed. */
  var seed: js.UndefOr[Double] = js.undefined
}

object SeedOnlyInitializerArgs {
  @scala.inline
  def apply(seed: Int | Double = null): SeedOnlyInitializerArgs = {
    val __obj = js.Dynamic.literal()
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeedOnlyInitializerArgs]
  }
}

