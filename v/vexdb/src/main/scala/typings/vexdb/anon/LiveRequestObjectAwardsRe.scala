package typings.vexdb.anon

import typings.vexdb.requestObjectsMod.Filter
import typings.vexdb.requestObjectsMod.Seasons
import typings.vexdb.responseObjectsMod.AwardsResponseObject
import typings.vexdb.vexdbStrings.name
import typings.vexdb.vexdbStrings.order
import typings.vexdb.vexdbStrings.sku
import typings.vexdb.vexdbStrings.team
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.AwardsRequestObject> */
@js.native
trait LiveRequestObjectAwardsRe extends js.Object {
  var limit_number: js.UndefOr[Double] = js.native
  var limit_start: js.UndefOr[Double] = js.native
  var name: js.UndefOr[Filter[AwardsResponseObject, typings.vexdb.vexdbStrings.name, String]] = js.native
  var order: js.UndefOr[Filter[AwardsResponseObject, typings.vexdb.vexdbStrings.order, Double]] = js.native
  var prefetch: js.UndefOr[Boolean] = js.native
  var season: js.UndefOr[Seasons] = js.native
  var sku: js.UndefOr[Filter[AwardsResponseObject, typings.vexdb.vexdbStrings.sku, String]] = js.native
  var team: js.UndefOr[Filter[AwardsResponseObject, typings.vexdb.vexdbStrings.team, String]] = js.native
}

object LiveRequestObjectAwardsRe {
  @scala.inline
  def apply(): LiveRequestObjectAwardsRe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveRequestObjectAwardsRe]
  }
  @scala.inline
  implicit class LiveRequestObjectAwardsReOps[Self <: LiveRequestObjectAwardsRe] (val x: Self) extends AnyVal {
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
    def setLimit_number(value: Double): Self = this.set("limit_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit_number: Self = this.set("limit_number", js.undefined)
    @scala.inline
    def setLimit_start(value: Double): Self = this.set("limit_start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit_start: Self = this.set("limit_start", js.undefined)
    @scala.inline
    def setNameFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, AwardsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("name", js.Any.fromFunction2(value))
    @scala.inline
    def setName(value: Filter[AwardsResponseObject, name, String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrderFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, AwardsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("order", js.Any.fromFunction2(value))
    @scala.inline
    def setOrder(value: Filter[AwardsResponseObject, order, Double]): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPrefetch(value: Boolean): Self = this.set("prefetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefetch: Self = this.set("prefetch", js.undefined)
    @scala.inline
    def setSeason(value: Seasons): Self = this.set("season", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeason: Self = this.set("season", js.undefined)
    @scala.inline
    def setSkuFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, AwardsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("sku", js.Any.fromFunction2(value))
    @scala.inline
    def setSku(value: Filter[AwardsResponseObject, sku, String]): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSku: Self = this.set("sku", js.undefined)
    @scala.inline
    def setTeamFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, AwardsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("team", js.Any.fromFunction2(value))
    @scala.inline
    def setTeam(value: Filter[AwardsResponseObject, team, String]): Self = this.set("team", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
  }
  
}

