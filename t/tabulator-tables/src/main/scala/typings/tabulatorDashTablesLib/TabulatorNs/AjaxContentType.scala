package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxContentType extends js.Object {
  var headers: JSONRecord
  def body(url: java.lang.String, config: js.Any, params: js.Any): js.Any
}

object AjaxContentType {
  @scala.inline
  def apply(body: (java.lang.String, js.Any, js.Any) => js.Any, headers: JSONRecord): AjaxContentType = {
    val __obj = js.Dynamic.literal(body = js.Any.fromFunction3(body), headers = headers)
  
    __obj.asInstanceOf[AjaxContentType]
  }
}

