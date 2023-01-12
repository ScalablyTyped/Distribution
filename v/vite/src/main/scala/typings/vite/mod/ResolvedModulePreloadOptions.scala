package typings.vite.mod

import typings.vite.anon.HostType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedModulePreloadOptions extends StObject {
  
  var polyfill: Boolean
  
  var resolveDependencies: js.UndefOr[ResolveModulePreloadDependenciesFn] = js.undefined
}
object ResolvedModulePreloadOptions {
  
  inline def apply(polyfill: Boolean): ResolvedModulePreloadOptions = {
    val __obj = js.Dynamic.literal(polyfill = polyfill.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModulePreloadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedModulePreloadOptions] (val x: Self) extends AnyVal {
    
    inline def setPolyfill(value: Boolean): Self = StObject.set(x, "polyfill", value.asInstanceOf[js.Any])
    
    inline def setResolveDependencies(
      value: (/* filename */ String, /* deps */ js.Array[String], /* context */ HostType) => js.Array[String]
    ): Self = StObject.set(x, "resolveDependencies", js.Any.fromFunction3(value))
    
    inline def setResolveDependenciesUndefined: Self = StObject.set(x, "resolveDependencies", js.undefined)
  }
}
