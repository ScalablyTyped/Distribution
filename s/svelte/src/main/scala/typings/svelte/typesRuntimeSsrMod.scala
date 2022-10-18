package typings.svelte

import typings.std.Extract
import typings.std.Map
import typings.std.Record
import typings.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typings.svelte.typesRuntimeInternalLifecycleMod.DispatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeSsrMod {
  
  @JSImport("svelte/types/runtime/ssr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("svelte/types/runtime/ssr", "SvelteComponentTyped")
  @js.native
  open class SvelteComponentTyped[Props /* <: Record[String, Any] */, Events /* <: Record[String, Any] */, Slots /* <: Record[String, Any] */] protected ()
    extends typings.svelte.mod.SvelteComponentTyped[Props, Events, Slots] {
    def this(options: ComponentConstructorOptions[Props]) = this()
  }
  
  inline def afterUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterUpdate")().asInstanceOf[Unit]
  
  inline def beforeUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")().asInstanceOf[Unit]
  
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
  
  inline def getAllContexts[T /* <: Map[Any, Any] */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllContexts")().asInstanceOf[T]
  
  inline def getContext[T](key: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(key.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def hasContext(key: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasContext")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def onDestroy(fn: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDestroy")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onMount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMount")().asInstanceOf[Unit]
  
  inline def setContext[T](key: Any, context: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(key.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def tick(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tick")().asInstanceOf[js.Promise[Unit]]
}
