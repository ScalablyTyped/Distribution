package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions> */
trait PartialValidationOptions extends StObject {
  
  var invalidLink: js.UndefOr[Boolean] = js.undefined
  
  var notDocumented: js.UndefOr[Boolean] = js.undefined
  
  var notExported: js.UndefOr[Boolean] = js.undefined
}
object PartialValidationOptions {
  
  inline def apply(): PartialValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialValidationOptions]
  }
  
  extension [Self <: PartialValidationOptions](x: Self) {
    
    inline def setInvalidLink(value: Boolean): Self = StObject.set(x, "invalidLink", value.asInstanceOf[js.Any])
    
    inline def setInvalidLinkUndefined: Self = StObject.set(x, "invalidLink", js.undefined)
    
    inline def setNotDocumented(value: Boolean): Self = StObject.set(x, "notDocumented", value.asInstanceOf[js.Any])
    
    inline def setNotDocumentedUndefined: Self = StObject.set(x, "notDocumented", js.undefined)
    
    inline def setNotExported(value: Boolean): Self = StObject.set(x, "notExported", value.asInstanceOf[js.Any])
    
    inline def setNotExportedUndefined: Self = StObject.set(x, "notExported", js.undefined)
  }
}
