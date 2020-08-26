package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.DataCollection
import typings.webix.mod.EventHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait querybuilderConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.native
  var borderless: js.UndefOr[Boolean] = js.native
  var columnMode: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String | HTMLElement] = js.native
  var css: js.UndefOr[js.Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fields: js.UndefOr[js.Array[_]] = js.native
  var filtering: js.UndefOr[Boolean] = js.native
  var filters: js.UndefOr[js.Array[_] | DataCollection] = js.native
  var glue: js.UndefOr[String] = js.native
  var gravity: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String | Double] = js.native
  var inputMaxWidth: js.UndefOr[Double] = js.native
  var inputWidth: js.UndefOr[Double] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxLevel: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var on: js.UndefOr[EventHash] = js.native
  var padding: js.UndefOr[js.Any] = js.native
  var paddingX: js.UndefOr[Double] = js.native
  var paddingY: js.UndefOr[Double] = js.native
  var sorting: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var view: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object querybuilderConfig {
  @scala.inline
  def apply(): querybuilderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[querybuilderConfig]
  }
  @scala.inline
  implicit class querybuilderConfigOps[Self <: querybuilderConfig] (val x: Self) extends AnyVal {
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
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    @scala.inline
    def setColumnMode(value: Boolean): Self = this.set("columnMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnMode: Self = this.set("columnMode", js.undefined)
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCss(value: js.Any): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: js.Any*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[_]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFiltering(value: Boolean): Self = this.set("filtering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiltering: Self = this.set("filtering", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: js.Any*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[_] | DataCollection): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setGlue(value: String): Self = this.set("glue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlue: Self = this.set("glue", js.undefined)
    @scala.inline
    def setGravity(value: Double): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputMaxWidth(value: Double): Self = this.set("inputMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMaxWidth: Self = this.set("inputMaxWidth", js.undefined)
    @scala.inline
    def setInputWidth(value: Double): Self = this.set("inputWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputWidth: Self = this.set("inputWidth", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxLevel(value: Double): Self = this.set("maxLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLevel: Self = this.set("maxLevel", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOn(value: EventHash): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaddingX(value: Double): Self = this.set("paddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingX: Self = this.set("paddingX", js.undefined)
    @scala.inline
    def setPaddingY(value: Double): Self = this.set("paddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingY: Self = this.set("paddingY", js.undefined)
    @scala.inline
    def setSorting(value: Boolean): Self = this.set("sorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

