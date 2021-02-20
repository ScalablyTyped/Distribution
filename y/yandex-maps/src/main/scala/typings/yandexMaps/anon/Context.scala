package typings.yandexMaps.anon

import typings.yandexMaps.mod.IEventManager
import typings.yandexMaps.mod.IEventWorkflowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends StObject {
  
  var context: js.UndefOr[js.Object] = js.native
  
  var controllers: js.UndefOr[js.Array[IEventWorkflowController]] = js.native
  
  var parent: js.UndefOr[IEventManager[js.Object]] = js.native
}
object Context {
  
  @scala.inline
  def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setControllers(value: js.Array[IEventWorkflowController]): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
    
    @scala.inline
    def setControllersVarargs(value: IEventWorkflowController*): Self = StObject.set(x, "controllers", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: IEventManager[js.Object]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
