package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrthogonalArgs extends SeedOnlyInitializerArgs {
  /**
    * Multiplicative factor to apply to the orthogonal matrix. Defaults to 1.
    */
  var gain: js.UndefOr[Double] = js.native
}

object OrthogonalArgs {
  @scala.inline
  def apply(): OrthogonalArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrthogonalArgs]
  }
  @scala.inline
  implicit class OrthogonalArgsOps[Self <: OrthogonalArgs] (val x: Self) extends AnyVal {
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
    def setGain(value: Double): Self = this.set("gain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGain: Self = this.set("gain", js.undefined)
  }
  
}

