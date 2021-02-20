package typings.vkOpenapi.vk.OpenAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitParams extends StObject {
  
  var apiId: Double = js.native
  
  var onlyWidgets: js.UndefOr[Boolean] = js.native
  
  var status: js.UndefOr[Boolean] = js.native
}
object InitParams {
  
  @scala.inline
  def apply(apiId: Double): InitParams = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitParams]
  }
  
  @scala.inline
  implicit class InitParamsMutableBuilder[Self <: InitParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: Double): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyWidgets(value: Boolean): Self = StObject.set(x, "onlyWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyWidgetsUndefined: Self = StObject.set(x, "onlyWidgets", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
