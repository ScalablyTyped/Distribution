package typings.uiGrid.mod.pinning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnDef extends js.Object {
  /**
    * Enable pinning for the individual column.  Defaults to true
    * @default true
    */
  var enablePinning: js.UndefOr[Boolean] = js.native
  /**
    * Column is pinned left when grid is rendered.  Defaults to false
    * @default false
    */
  var pinnedLeft: js.UndefOr[Boolean] = js.native
  /**
    * Column is pinned right when grid is rendered.  Defaults to false
    * @default false
    */
  var pinnedRight: js.UndefOr[Boolean] = js.native
}

object IColumnDef {
  @scala.inline
  def apply(): IColumnDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDef]
  }
  @scala.inline
  implicit class IColumnDefOps[Self <: IColumnDef] (val x: Self) extends AnyVal {
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
    def setEnablePinning(value: Boolean): Self = this.set("enablePinning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePinning: Self = this.set("enablePinning", js.undefined)
    @scala.inline
    def setPinnedLeft(value: Boolean): Self = this.set("pinnedLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinnedLeft: Self = this.set("pinnedLeft", js.undefined)
    @scala.inline
    def setPinnedRight(value: Boolean): Self = this.set("pinnedRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinnedRight: Self = this.set("pinnedRight", js.undefined)
  }
  
}

