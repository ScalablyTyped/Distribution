package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataDriver extends js.Object {
  var csv: js.Any
  var excel: java.lang.String
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
    excel: java.lang.String,
    html: js.Any,
    htmltable: js.Any,
    jsarray: js.Any,
    json: js.Any,
    xml: js.Any
  ): DataDriver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("csv")(csv)
    __obj.updateDynamic("excel")(excel)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("htmltable")(htmltable)
    __obj.updateDynamic("jsarray")(jsarray)
    __obj.updateDynamic("json")(json)
    __obj.updateDynamic("xml")(xml)
    __obj.asInstanceOf[DataDriver]
  }
}

