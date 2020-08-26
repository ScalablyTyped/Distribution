package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataDriver extends js.Object {
  var csv: js.Any = js.native
  var excel: String = js.native
  var html: js.Any = js.native
  var htmltable: js.Any = js.native
  var jsarray: js.Any = js.native
  var json: js.Any = js.native
  var xml: js.Any = js.native
}

object DataDriver {
  @scala.inline
  def apply(
    csv: js.Any,
    excel: String,
    html: js.Any,
    htmltable: js.Any,
    jsarray: js.Any,
    json: js.Any,
    xml: js.Any
  ): DataDriver = {
    val __obj = js.Dynamic.literal(csv = csv.asInstanceOf[js.Any], excel = excel.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], htmltable = htmltable.asInstanceOf[js.Any], jsarray = jsarray.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDriver]
  }
  @scala.inline
  implicit class DataDriverOps[Self <: DataDriver] (val x: Self) extends AnyVal {
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
    def setCsv(value: js.Any): Self = this.set("csv", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcel(value: String): Self = this.set("excel", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: js.Any): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmltable(value: js.Any): Self = this.set("htmltable", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsarray(value: js.Any): Self = this.set("jsarray", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: js.Any): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setXml(value: js.Any): Self = this.set("xml", value.asInstanceOf[js.Any])
  }
  
}

