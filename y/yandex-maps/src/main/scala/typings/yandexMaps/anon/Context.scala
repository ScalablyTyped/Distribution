package typings.yandexMaps.anon

import typings.yandexMaps.mod.IEventManager
import typings.yandexMaps.mod.IEventWorkflowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var context: js.UndefOr[js.Object] = js.undefined
  
  var controllers: js.UndefOr[js.Array[IEventWorkflowController]] = js.undefined
  
  var parent: js.UndefOr[IEventManager[js.Object]] = js.undefined
}
object Context {
  
  inline def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setControllers(value: js.Array[IEventWorkflowController]): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
    
    inline def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
    
    inline def setControllersVarargs(value: IEventWorkflowController*): Self = StObject.set(x, "controllers", js.Array(value*))
    
    inline def setParent(value: IEventManager[js.Object]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
