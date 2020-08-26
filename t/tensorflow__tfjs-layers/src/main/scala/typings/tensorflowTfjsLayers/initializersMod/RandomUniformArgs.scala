package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomUniformArgs extends js.Object {
  /** Upper bound of the range of random values to generate. */
  var maxval: js.UndefOr[Double] = js.native
  /** Lower bound of the range of random values to generate. */
  var minval: js.UndefOr[Double] = js.native
  /** Used to seed the random generator. */
  var seed: js.UndefOr[Double] = js.native
}

object RandomUniformArgs {
  @scala.inline
  def apply(): RandomUniformArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomUniformArgs]
  }
  @scala.inline
  implicit class RandomUniformArgsOps[Self <: RandomUniformArgs] (val x: Self) extends AnyVal {
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
    def setMaxval(value: Double): Self = this.set("maxval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxval: Self = this.set("maxval", js.undefined)
    @scala.inline
    def setMinval(value: Double): Self = this.set("minval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinval: Self = this.set("minval", js.undefined)
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
  
}

