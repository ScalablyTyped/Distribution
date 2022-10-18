package typings.vueDevtoolsApi

import typings.std.Record
import typings.vueDevtoolsApi.libEsmApiApiMod.DevtoolsPluginApi
import typings.vueDevtoolsApi.libEsmApiContextMod.Context
import typings.vueDevtoolsApi.libEsmApiHooksMod.Hookable
import typings.vueDevtoolsApi.libEsmPluginMod.PluginDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmProxyMod {
  
  @JSImport("@vue/devtools-api/lib/esm/proxy", "ApiProxy")
  @js.native
  open class ApiProxy[TTarget /* <: DevtoolsPluginApi[Any] */] protected () extends StObject {
    def this(plugin: PluginDescriptor, hook: Any) = this()
    
    var fallbacks: Record[String, Any] = js.native
    
    var hook: Any = js.native
    
    var onQueue: js.Array[QueueItem] = js.native
    
    var plugin: PluginDescriptor = js.native
    
    var proxiedOn: Hookable[Context] = js.native
    
    var proxiedTarget: TTarget = js.native
    
    def setRealTarget(target: TTarget): js.Promise[Unit] = js.native
    
    var target: TTarget | Null = js.native
    
    var targetQueue: js.Array[QueueItem] = js.native
  }
  
  trait QueueItem extends StObject {
    
    var args: js.Array[Any]
    
    var method: String
    
    var resolve: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object QueueItem {
    
    inline def apply(args: js.Array[Any], method: String): QueueItem = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueItem]
    }
    
    extension [Self <: QueueItem](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
}
