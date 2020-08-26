package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeedOnlyInitializerArgs extends js.Object {
  /** Random number generator seed. */
  var seed: js.UndefOr[Double] = js.native
}

object SeedOnlyInitializerArgs {
  @scala.inline
  def apply(): SeedOnlyInitializerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeedOnlyInitializerArgs]
  }
  @scala.inline
  implicit class SeedOnlyInitializerArgsOps[Self <: SeedOnlyInitializerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
  
}

