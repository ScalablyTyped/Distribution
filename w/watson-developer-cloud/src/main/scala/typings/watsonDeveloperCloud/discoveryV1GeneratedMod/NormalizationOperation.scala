package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NormalizationOperation. */
trait NormalizationOperation extends StObject {
  
  /** The destination field for the operation. */
  var destination_field: js.UndefOr[String] = js.undefined
  
  /** Identifies what type of operation to perform. **copy** - Copies the value of the **source_field** to the **destination_field** field. If the **destination_field** already exists, then the value of the **source_field** overwrites the original value of the **destination_field**. **move** - Renames (moves) the **source_field** to the **destination_field**. If the **destination_field** already exists, then the value of the **source_field** overwrites the original value of the **destination_field**. Rename is identical to copy, except that the **source_field** is removed after the value has been copied to the **destination_field** (it is the same as a _copy_ followed by a _remove_). **merge** - Merges the value of the **source_field** with the value of the **destination_field**. The **destination_field** is converted into an array if it is not already an array, and the value of the **source_field** is appended to the array. This operation removes the **source_field** after the merge. If the **source_field** does not exist in the current document, then the **destination_field** is still converted into an array (if it is not an array already). This conversion ensures the type for **destination_field** is consistent across all documents. **remove** - Deletes the **source_field** field. The **destination_field** is ignored for this operation. **remove_nulls** - Removes all nested null (blank) field values from the ingested document. **source_field** and **destination_field** are ignored by this operation because _remove_nulls_ operates on the entire ingested document. Typically, **remove_nulls** is invoked as the last normalization operation (if it is invoked at all, it can be time-expensive). */
  var operation: js.UndefOr[String] = js.undefined
  
  /** The source field for the operation. */
  var source_field: js.UndefOr[String] = js.undefined
}
object NormalizationOperation {
  
  inline def apply(): NormalizationOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizationOperation]
  }
  
  extension [Self <: NormalizationOperation](x: Self) {
    
    inline def setDestination_field(value: String): Self = StObject.set(x, "destination_field", value.asInstanceOf[js.Any])
    
    inline def setDestination_fieldUndefined: Self = StObject.set(x, "destination_field", js.undefined)
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setSource_field(value: String): Self = StObject.set(x, "source_field", value.asInstanceOf[js.Any])
    
    inline def setSource_fieldUndefined: Self = StObject.set(x, "source_field", js.undefined)
  }
}
