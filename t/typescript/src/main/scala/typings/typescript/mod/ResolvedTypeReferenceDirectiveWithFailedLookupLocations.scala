package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedTypeReferenceDirectiveWithFailedLookupLocations extends StObject {
  
  val resolvedTypeReferenceDirective: js.UndefOr[ResolvedTypeReferenceDirective] = js.undefined
}
object ResolvedTypeReferenceDirectiveWithFailedLookupLocations {
  
  inline def apply(): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedTypeReferenceDirectiveWithFailedLookupLocations] (val x: Self) extends AnyVal {
    
    inline def setResolvedTypeReferenceDirective(value: ResolvedTypeReferenceDirective): Self = StObject.set(x, "resolvedTypeReferenceDirective", value.asInstanceOf[js.Any])
    
    inline def setResolvedTypeReferenceDirectiveUndefined: Self = StObject.set(x, "resolvedTypeReferenceDirective", js.undefined)
  }
}
