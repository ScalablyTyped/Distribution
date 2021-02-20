package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerModuleNameCache extends StObject {
  
  def get(directory: java.lang.String): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = js.native
  
  def set(directory: java.lang.String, result: ResolvedModuleWithFailedLookupLocations): Unit = js.native
}
object PerModuleNameCache {
  
  @scala.inline
  def apply(
    get: java.lang.String => js.UndefOr[ResolvedModuleWithFailedLookupLocations],
    set: (java.lang.String, ResolvedModuleWithFailedLookupLocations) => Unit
  ): PerModuleNameCache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[PerModuleNameCache]
  }
  
  @scala.inline
  implicit class PerModuleNameCacheMutableBuilder[Self <: PerModuleNameCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: java.lang.String => js.UndefOr[ResolvedModuleWithFailedLookupLocations]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (java.lang.String, ResolvedModuleWithFailedLookupLocations) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
