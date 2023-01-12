package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AjaxConfig extends StObject {
  
  var credentials: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[JSONRecord] = js.undefined
  
  var method: js.UndefOr[HttpMethod] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
}
object AjaxConfig {
  
  inline def apply(): AjaxConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AjaxConfig] (val x: Self) extends AnyVal {
    
    inline def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setHeaders(value: JSONRecord): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
