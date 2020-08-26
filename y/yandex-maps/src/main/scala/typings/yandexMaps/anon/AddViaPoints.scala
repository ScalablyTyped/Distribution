package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddViaPoints extends js.Object {
  var addViaPoints: js.UndefOr[Boolean] = js.native
  var addWayPoints: js.UndefOr[Boolean] = js.native
  var editViaPoints: js.UndefOr[Boolean] = js.native
  var editWayPoints: js.UndefOr[Boolean] = js.native
  var removeViaPoints: js.UndefOr[Boolean] = js.native
  var removeWayPoints: js.UndefOr[Boolean] = js.native
}

object AddViaPoints {
  @scala.inline
  def apply(): AddViaPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddViaPoints]
  }
  @scala.inline
  implicit class AddViaPointsOps[Self <: AddViaPoints] (val x: Self) extends AnyVal {
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
    def setAddViaPoints(value: Boolean): Self = this.set("addViaPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddViaPoints: Self = this.set("addViaPoints", js.undefined)
    @scala.inline
    def setAddWayPoints(value: Boolean): Self = this.set("addWayPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddWayPoints: Self = this.set("addWayPoints", js.undefined)
    @scala.inline
    def setEditViaPoints(value: Boolean): Self = this.set("editViaPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditViaPoints: Self = this.set("editViaPoints", js.undefined)
    @scala.inline
    def setEditWayPoints(value: Boolean): Self = this.set("editWayPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditWayPoints: Self = this.set("editWayPoints", js.undefined)
    @scala.inline
    def setRemoveViaPoints(value: Boolean): Self = this.set("removeViaPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveViaPoints: Self = this.set("removeViaPoints", js.undefined)
    @scala.inline
    def setRemoveWayPoints(value: Boolean): Self = this.set("removeWayPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveWayPoints: Self = this.set("removeWayPoints", js.undefined)
  }
  
}

