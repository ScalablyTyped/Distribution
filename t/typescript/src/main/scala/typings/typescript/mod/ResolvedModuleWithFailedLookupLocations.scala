package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedModuleWithFailedLookupLocations extends StObject {
  
  val resolvedModule: js.UndefOr[ResolvedModuleFull] = js.native
}
object ResolvedModuleWithFailedLookupLocations {
  
  @scala.inline
  def apply(): ResolvedModuleWithFailedLookupLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedModuleWithFailedLookupLocations]
  }
  
  @scala.inline
  implicit class ResolvedModuleWithFailedLookupLocationsMutableBuilder[Self <: ResolvedModuleWithFailedLookupLocations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolvedModule(value: ResolvedModuleFull): Self = StObject.set(x, "resolvedModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedModuleUndefined: Self = StObject.set(x, "resolvedModule", js.undefined)
  }
}
