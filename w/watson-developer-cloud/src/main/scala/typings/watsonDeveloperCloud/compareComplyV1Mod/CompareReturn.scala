package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The comparison of the two submitted documents. */
trait CompareReturn extends StObject {
  
  /** A list of pairs of elements that semantically align between the compared documents. */
  var aligned_elements: js.UndefOr[js.Array[AlignedElement]] = js.undefined
  
  /** Information about the documents being compared. */
  var documents: js.UndefOr[js.Array[Document]] = js.undefined
  
  /** The analysis model used to compare the input documents. For the **Compare two documents** method, the only valid value is `contracts`. */
  var model_id: js.UndefOr[String] = js.undefined
  
  /** The version of the analysis model identified by the value of the `model_id` key. */
  var model_version: js.UndefOr[String] = js.undefined
  
  /** A list of elements that do not semantically align between the compared documents. */
  var unaligned_elements: js.UndefOr[js.Array[UnalignedElement]] = js.undefined
}
object CompareReturn {
  
  inline def apply(): CompareReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareReturn]
  }
  
  extension [Self <: CompareReturn](x: Self) {
    
    inline def setAligned_elements(value: js.Array[AlignedElement]): Self = StObject.set(x, "aligned_elements", value.asInstanceOf[js.Any])
    
    inline def setAligned_elementsUndefined: Self = StObject.set(x, "aligned_elements", js.undefined)
    
    inline def setAligned_elementsVarargs(value: AlignedElement*): Self = StObject.set(x, "aligned_elements", js.Array(value*))
    
    inline def setDocuments(value: js.Array[Document]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: Document*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    inline def setModel_version(value: String): Self = StObject.set(x, "model_version", value.asInstanceOf[js.Any])
    
    inline def setModel_versionUndefined: Self = StObject.set(x, "model_version", js.undefined)
    
    inline def setUnaligned_elements(value: js.Array[UnalignedElement]): Self = StObject.set(x, "unaligned_elements", value.asInstanceOf[js.Any])
    
    inline def setUnaligned_elementsUndefined: Self = StObject.set(x, "unaligned_elements", js.undefined)
    
    inline def setUnaligned_elementsVarargs(value: UnalignedElement*): Self = StObject.set(x, "unaligned_elements", js.Array(value*))
  }
}
