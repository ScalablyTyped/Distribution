package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCollectionConfig extends js.Object {
  var data: js.UndefOr[String | js.Array[_]] = js.native
  var dataFeed: js.UndefOr[String | WebixCallback] = js.native
  var datathrottle: js.UndefOr[Double] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultData: js.UndefOr[js.Any] = js.native
  var externalData: js.UndefOr[WebixCallback] = js.native
  var id: js.UndefOr[String | Double] = js.native
  var map: js.UndefOr[js.Any] = js.native
  var on: js.UndefOr[EventHash] = js.native
  var ready: js.UndefOr[WebixCallback] = js.native
  var removeMissed: js.UndefOr[Boolean] = js.native
  var rules: js.UndefOr[js.Any] = js.native
  var save: js.UndefOr[js.Any] = js.native
  var scheme: js.UndefOr[js.Any] = js.native
  var url: js.UndefOr[js.Any] = js.native
  var view: js.UndefOr[String] = js.native
}

object DataCollectionConfig {
  @scala.inline
  def apply(): DataCollectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCollectionConfig]
  }
  @scala.inline
  implicit class DataCollectionConfigOps[Self <: DataCollectionConfig] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: String | js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataFeedFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("dataFeed", js.Any.fromFunction1(value))
    @scala.inline
    def setDataFeed(value: String | WebixCallback): Self = this.set("dataFeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFeed: Self = this.set("dataFeed", js.undefined)
    @scala.inline
    def setDatathrottle(value: Double): Self = this.set("datathrottle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatathrottle: Self = this.set("datathrottle", js.undefined)
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDefaultData(value: js.Any): Self = this.set("defaultData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultData: Self = this.set("defaultData", js.undefined)
    @scala.inline
    def setExternalData(value: /* repeated */ js.Any => js.Any): Self = this.set("externalData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExternalData: Self = this.set("externalData", js.undefined)
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMap(value: js.Any): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setOn(value: EventHash): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setReady(value: /* repeated */ js.Any => js.Any): Self = this.set("ready", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    @scala.inline
    def setRemoveMissed(value: Boolean): Self = this.set("removeMissed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveMissed: Self = this.set("removeMissed", js.undefined)
    @scala.inline
    def setRules(value: js.Any): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setSave(value: js.Any): Self = this.set("save", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setScheme(value: js.Any): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    @scala.inline
    def setUrl(value: js.Any): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

