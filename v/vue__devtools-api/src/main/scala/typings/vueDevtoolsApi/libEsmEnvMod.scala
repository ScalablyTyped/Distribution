package typings.vueDevtoolsApi

import typings.vueDevtoolsApi.libEsmApiApiMod.DevtoolsPluginApi
import typings.vueDevtoolsApi.libEsmPluginMod.PluginDescriptor
import typings.vueDevtoolsApi.libEsmProxyMod.ApiProxy
import typings.vueDevtoolsApi.mod.SetupFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmEnvMod {
  
  @JSImport("@vue/devtools-api/lib/esm/env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDevtoolsGlobalHook(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevtoolsGlobalHook")().asInstanceOf[Any]
  
  inline def getTarget(): GlobalTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")().asInstanceOf[GlobalTarget]
  
  @JSImport("@vue/devtools-api/lib/esm/env", "isProxyAvailable")
  @js.native
  val isProxyAvailable: Boolean = js.native
  
  trait GlobalTarget extends StObject {
    
    var __VUE_DEVTOOLS_PLUGINS__ : js.UndefOr[js.Array[PluginQueueItem]] = js.undefined
    
    var __VUE_DEVTOOLS_PLUGIN_API_AVAILABLE__ : js.UndefOr[Boolean] = js.undefined
  }
  object GlobalTarget {
    
    inline def apply(): GlobalTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTarget]
    }
    
    extension [Self <: GlobalTarget](x: Self) {
      
      inline def set__VUE_DEVTOOLS_PLUGINS__(value: js.Array[PluginQueueItem]): Self = StObject.set(x, "__VUE_DEVTOOLS_PLUGINS__", value.asInstanceOf[js.Any])
      
      inline def set__VUE_DEVTOOLS_PLUGINS__Undefined: Self = StObject.set(x, "__VUE_DEVTOOLS_PLUGINS__", js.undefined)
      
      inline def set__VUE_DEVTOOLS_PLUGINS__Varargs(value: PluginQueueItem*): Self = StObject.set(x, "__VUE_DEVTOOLS_PLUGINS__", js.Array(value*))
      
      inline def set__VUE_DEVTOOLS_PLUGIN_API_AVAILABLE__(value: Boolean): Self = StObject.set(x, "__VUE_DEVTOOLS_PLUGIN_API_AVAILABLE__", value.asInstanceOf[js.Any])
      
      inline def set__VUE_DEVTOOLS_PLUGIN_API_AVAILABLE__Undefined: Self = StObject.set(x, "__VUE_DEVTOOLS_PLUGIN_API_AVAILABLE__", js.undefined)
    }
  }
  
  trait PluginQueueItem extends StObject {
    
    var pluginDescriptor: PluginDescriptor
    
    var proxy: js.UndefOr[ApiProxy[DevtoolsPluginApi[Any]]] = js.undefined
    
    def setupFn(api: DevtoolsPluginApi[Any]): Unit
    @JSName("setupFn")
    var setupFn_Original: SetupFunction[Any]
  }
  object PluginQueueItem {
    
    inline def apply(pluginDescriptor: PluginDescriptor, setupFn: /* api */ DevtoolsPluginApi[Any] => Unit): PluginQueueItem = {
      val __obj = js.Dynamic.literal(pluginDescriptor = pluginDescriptor.asInstanceOf[js.Any], setupFn = js.Any.fromFunction1(setupFn))
      __obj.asInstanceOf[PluginQueueItem]
    }
    
    extension [Self <: PluginQueueItem](x: Self) {
      
      inline def setPluginDescriptor(value: PluginDescriptor): Self = StObject.set(x, "pluginDescriptor", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: ApiProxy[DevtoolsPluginApi[Any]]): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setSetupFn(value: /* api */ DevtoolsPluginApi[Any] => Unit): Self = StObject.set(x, "setupFn", js.Any.fromFunction1(value))
    }
  }
}
