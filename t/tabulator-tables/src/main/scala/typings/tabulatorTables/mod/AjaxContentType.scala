package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AjaxContentType extends StObject {
  
  def body(url: String, config: Any, params: Any): Any
  
  var headers: JSONRecord
}
object AjaxContentType {
  
  inline def apply(body: (String, Any, Any) => Any, headers: JSONRecord): AjaxContentType = {
    val __obj = js.Dynamic.literal(body = js.Any.fromFunction3(body), headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxContentType]
  }
  
  extension [Self <: AjaxContentType](x: Self) {
    
    inline def setBody(value: (String, Any, Any) => Any): Self = StObject.set(x, "body", js.Any.fromFunction3(value))
    
    inline def setHeaders(value: JSONRecord): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
