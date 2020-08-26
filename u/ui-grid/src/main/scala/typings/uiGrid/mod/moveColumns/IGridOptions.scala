package typings.uiGrid.mod.moveColumns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
  /**
    * If defined, sets the default value for the colMovable flag on each individual colDefs
    * if their individual enableColumnMoving configuration is not defined.
    * Defaults to true.
    * @default true
    */
  var enableColumnMoving: js.UndefOr[Boolean] = js.native
}

object IGridOptions {
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
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
    def setEnableColumnMoving(value: Boolean): Self = this.set("enableColumnMoving", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableColumnMoving: Self = this.set("enableColumnMoving", js.undefined)
  }
  
}

