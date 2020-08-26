package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkParams extends _FormatterParams {
  var download: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String | (js.Function1[/* cell */ CellComponent, String])] = js.native
  // Link
  var labelField: js.UndefOr[String] = js.native
  var target: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var urlField: js.UndefOr[String] = js.native
  var urlPrefix: js.UndefOr[String] = js.native
}

object LinkParams {
  @scala.inline
  def apply(): LinkParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkParams]
  }
  @scala.inline
  implicit class LinkParamsOps[Self <: LinkParams] (val x: Self) extends AnyVal {
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
    def setDownload(value: Boolean): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setLabelFunction1(value: /* cell */ CellComponent => String): Self = this.set("label", js.Any.fromFunction1(value))
    @scala.inline
    def setLabel(value: String | (js.Function1[/* cell */ CellComponent, String])): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelField(value: String): Self = this.set("labelField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelField: Self = this.set("labelField", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUrlField(value: String): Self = this.set("urlField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlField: Self = this.set("urlField", js.undefined)
    @scala.inline
    def setUrlPrefix(value: String): Self = this.set("urlPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlPrefix: Self = this.set("urlPrefix", js.undefined)
  }
  
}

