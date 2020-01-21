package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxContentType extends js.Object {
  var headers: JSONRecord
  def body(url: String, config: js.Any, params: js.Any): js.Any
}

object AjaxContentType {
  @scala.inline
  def apply(body: (String, js.Any, js.Any) => js.Any, headers: JSONRecord): AjaxContentType = {
    val __obj = js.Dynamic.literal(body = js.Any.fromFunction3(body), headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AjaxContentType]
  }
}

