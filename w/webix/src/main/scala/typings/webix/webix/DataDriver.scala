package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataDriver extends js.Object {
  var csv: js.Any
  var excel: String
  var html: js.Any
  var htmltable: js.Any
  var jsarray: js.Any
  var json: js.Any
  var xml: js.Any
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
}

