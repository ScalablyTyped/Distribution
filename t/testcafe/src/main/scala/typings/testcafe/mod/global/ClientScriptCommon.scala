package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientScriptCommon extends StObject {
  
  var page: js.UndefOr[Any] = js.undefined
}
object ClientScriptCommon {
  
  inline def apply(): ClientScriptCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientScriptCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientScriptCommon] (val x: Self) extends AnyVal {
    
    inline def setPage(value: Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
