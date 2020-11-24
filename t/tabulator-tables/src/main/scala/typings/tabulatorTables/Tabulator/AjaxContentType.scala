package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxContentType extends js.Object {
  
  def body(url: String, config: js.Any, params: js.Any): js.Any = js.native
  
  var headers: JSONRecord = js.native
}
object AjaxContentType {
  
  @scala.inline
  def apply(body: (String, js.Any, js.Any) => js.Any, headers: JSONRecord): AjaxContentType = {
    val __obj = js.Dynamic.literal(body = js.Any.fromFunction3(body), headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxContentType]
  }
  
  @scala.inline
  implicit class AjaxContentTypeOps[Self <: AjaxContentType] (val x: Self) extends AnyVal {
    
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
    def setBody(value: (String, js.Any, js.Any) => js.Any): Self = this.set("body", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHeaders(value: JSONRecord): Self = this.set("headers", value.asInstanceOf[js.Any])
  }
}
