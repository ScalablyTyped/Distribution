package typings.svelte

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeSsrMod {
  
  @JSImport("svelte/types/runtime/ssr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def afterUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterUpdate")().asInstanceOf[Unit]
  
  inline def beforeUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeUpdate")().asInstanceOf[Unit]
  
  inline def onMount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMount")().asInstanceOf[Unit]
}
