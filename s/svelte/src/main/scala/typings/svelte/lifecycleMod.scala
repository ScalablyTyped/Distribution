package typings.svelte

import typings.std.Extract
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lifecycleMod {
  
  @JSImport("svelte/types/runtime/internal/lifecycle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def afterUpdate(fn: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterUpdate")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def beforeUpdate(fn: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def bubble(component: Any, event: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bubble")(component.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createEventDispatcher[EventMap /* <: js.Object */](): js.Function3[
    /* type */ Extract[/* keyof EventMap */ String, String], 
    /* detail */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[std.Extract<keyof EventMap, string>] */ js.Any
    ], 
    /* options */ js.UndefOr[DispatchOptions], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventDispatcher")().asInstanceOf[js.Function3[
    /* type */ Extract[/* keyof EventMap */ String, String], 
    /* detail */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[std.Extract<keyof EventMap, string>] */ js.Any
    ], 
    /* options */ js.UndefOr[DispatchOptions], 
    Boolean
  ]]
  
  @JSImport("svelte/types/runtime/internal/lifecycle", "current_component")
  @js.native
  def currentComponent: Any = js.native
  
  inline def currentComponent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current_component")(x.asInstanceOf[js.Any])
  
  inline def getAllContexts[T /* <: Map[Any, Any] */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllContexts")().asInstanceOf[T]
  
  inline def getContext[T](key: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(key.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getCurrentComponent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get_current_component")().asInstanceOf[Any]
  
  inline def hasContext(key: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasContext")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def onDestroy(fn: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDestroy")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onMount(fn: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMount")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setContext[T](key: Any, context: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(key.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def setCurrentComponent(component: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set_current_component")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait DispatchOptions extends StObject {
    
    var cancelable: js.UndefOr[Boolean] = js.undefined
  }
  object DispatchOptions {
    
    inline def apply(): DispatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DispatchOptions]
    }
    
    extension [Self <: DispatchOptions](x: Self) {
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    }
  }
}
