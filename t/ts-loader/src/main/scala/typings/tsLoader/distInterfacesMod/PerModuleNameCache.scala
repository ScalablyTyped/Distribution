package typings.tsLoader.distInterfacesMod

import typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerModuleNameCache extends StObject {
  
  def get(directory: String): js.UndefOr[ResolvedModuleWithFailedLookupLocations]
  
  def set(directory: String, result: ResolvedModuleWithFailedLookupLocations): Unit
}
object PerModuleNameCache {
  
  inline def apply(
    get: String => js.UndefOr[ResolvedModuleWithFailedLookupLocations],
    set: (String, ResolvedModuleWithFailedLookupLocations) => Unit
  ): PerModuleNameCache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[PerModuleNameCache]
  }
  
  extension [Self <: PerModuleNameCache](x: Self) {
    
    inline def setGet(value: String => js.UndefOr[ResolvedModuleWithFailedLookupLocations]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, ResolvedModuleWithFailedLookupLocations) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
