package typings.vite.mod

import typings.vite.anon.HostType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModulePreloadOptions extends StObject {
  
  /**
    * Whether to inject a module preload polyfill.
    * Note: does not apply to library mode.
    * @default true
    */
  var polyfill: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Resolve the list of dependencies to preload for a given dynamic import
    * @experimental
    */
  var resolveDependencies: js.UndefOr[ResolveModulePreloadDependenciesFn] = js.undefined
}
object ModulePreloadOptions {
  
  inline def apply(): ModulePreloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModulePreloadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModulePreloadOptions] (val x: Self) extends AnyVal {
    
    inline def setPolyfill(value: Boolean): Self = StObject.set(x, "polyfill", value.asInstanceOf[js.Any])
    
    inline def setPolyfillUndefined: Self = StObject.set(x, "polyfill", js.undefined)
    
    inline def setResolveDependencies(
      value: (/* filename */ String, /* deps */ js.Array[String], /* context */ HostType) => js.Array[String]
    ): Self = StObject.set(x, "resolveDependencies", js.Any.fromFunction3(value))
    
    inline def setResolveDependenciesUndefined: Self = StObject.set(x, "resolveDependencies", js.undefined)
  }
}
