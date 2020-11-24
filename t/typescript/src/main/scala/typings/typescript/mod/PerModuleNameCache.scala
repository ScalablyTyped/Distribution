package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerModuleNameCache extends js.Object {
  
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
  implicit class PerModuleNameCacheOps[Self <: PerModuleNameCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: java.lang.String => js.UndefOr[ResolvedModuleWithFailedLookupLocations]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (java.lang.String, ResolvedModuleWithFailedLookupLocations) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
