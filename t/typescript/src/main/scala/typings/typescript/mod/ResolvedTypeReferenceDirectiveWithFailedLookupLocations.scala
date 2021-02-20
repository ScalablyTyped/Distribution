package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedTypeReferenceDirectiveWithFailedLookupLocations extends StObject {
  
  val failedLookupLocations: js.Array[java.lang.String] = js.native
  
  val resolvedTypeReferenceDirective: js.UndefOr[ResolvedTypeReferenceDirective] = js.native
}
object ResolvedTypeReferenceDirectiveWithFailedLookupLocations {
  
  @scala.inline
  def apply(failedLookupLocations: js.Array[java.lang.String]): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = {
    val __obj = js.Dynamic.literal(failedLookupLocations = failedLookupLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
  }
  
  @scala.inline
  implicit class ResolvedTypeReferenceDirectiveWithFailedLookupLocationsMutableBuilder[Self <: ResolvedTypeReferenceDirectiveWithFailedLookupLocations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedLookupLocations(value: js.Array[java.lang.String]): Self = StObject.set(x, "failedLookupLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedLookupLocationsVarargs(value: java.lang.String*): Self = StObject.set(x, "failedLookupLocations", js.Array(value :_*))
    
    @scala.inline
    def setResolvedTypeReferenceDirective(value: ResolvedTypeReferenceDirective): Self = StObject.set(x, "resolvedTypeReferenceDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedTypeReferenceDirectiveUndefined: Self = StObject.set(x, "resolvedTypeReferenceDirective", js.undefined)
  }
}
