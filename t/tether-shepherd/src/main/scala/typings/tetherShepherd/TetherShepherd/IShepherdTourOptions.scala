package typings.tetherShepherd.TetherShepherd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShepherdTourOptions extends js.Object {
  var defaults: js.UndefOr[IShepherdTourStepOptions] = js.native
  var steps: js.UndefOr[js.Array[IShepherdTourStep]] = js.native
}

object IShepherdTourOptions {
  @scala.inline
  def apply(): IShepherdTourOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShepherdTourOptions]
  }
  @scala.inline
  implicit class IShepherdTourOptionsOps[Self <: IShepherdTourOptions] (val x: Self) extends AnyVal {
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
    def setDefaults(value: IShepherdTourStepOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    @scala.inline
    def setStepsVarargs(value: IShepherdTourStep*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[IShepherdTourStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
  
}

