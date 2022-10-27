package typings.vite.mod

import typings.rollup.mod.RollupOptions
import typings.vite.viteStrings.es
import typings.vite.viteStrings.iife
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveWorkerOptions
  extends StObject
     with PluginHookUtils {
  
  var format: es | iife = js.native
  
  var plugins: js.Array[Plugin2] = js.native
  
  var rollupOptions: RollupOptions = js.native
}
