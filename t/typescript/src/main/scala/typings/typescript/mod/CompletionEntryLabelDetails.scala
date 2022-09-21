package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionEntryLabelDetails extends StObject {
  
  var description: js.UndefOr[java.lang.String] = js.undefined
  
  var detail: js.UndefOr[java.lang.String] = js.undefined
}
object CompletionEntryLabelDetails {
  
  inline def apply(): CompletionEntryLabelDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletionEntryLabelDetails]
  }
  
  extension [Self <: CompletionEntryLabelDetails](x: Self) {
    
    inline def setDescription(value: java.lang.String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetail(value: java.lang.String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
  }
}
