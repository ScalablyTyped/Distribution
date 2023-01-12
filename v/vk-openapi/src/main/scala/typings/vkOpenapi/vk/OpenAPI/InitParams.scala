package typings.vkOpenapi.vk.OpenAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitParams extends StObject {
  
  var apiId: Double
  
  var onlyWidgets: js.UndefOr[Boolean] = js.undefined
  
  var status: js.UndefOr[Boolean] = js.undefined
}
object InitParams {
  
  inline def apply(apiId: Double): InitParams = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitParams] (val x: Self) extends AnyVal {
    
    inline def setApiId(value: Double): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setOnlyWidgets(value: Boolean): Self = StObject.set(x, "onlyWidgets", value.asInstanceOf[js.Any])
    
    inline def setOnlyWidgetsUndefined: Self = StObject.set(x, "onlyWidgets", js.undefined)
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
