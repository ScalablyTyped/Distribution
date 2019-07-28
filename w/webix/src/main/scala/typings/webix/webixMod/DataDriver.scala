package typings.webix.webixMod

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
    val __obj = js.Dynamic.literal(csv = csv, excel = excel, html = html, htmltable = htmltable, jsarray = jsarray, json = json, xml = xml)
  
    __obj.asInstanceOf[DataDriver]
  }
}

