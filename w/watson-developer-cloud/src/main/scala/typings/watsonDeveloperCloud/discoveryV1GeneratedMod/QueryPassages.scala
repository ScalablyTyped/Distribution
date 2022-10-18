package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryPassages. */
trait QueryPassages extends StObject {
  
  /** The unique identifier of the document from which the passage has been extracted. */
  var document_id: js.UndefOr[String] = js.undefined
  
  /** The position of the last character of the extracted passage in the originating field. */
  var end_offset: js.UndefOr[Double] = js.undefined
  
  /** The label of the field from which the passage has been extracted. */
  var field: js.UndefOr[String] = js.undefined
  
  /** The confidence score of the passages's analysis. A higher score indicates greater confidence. */
  var passage_score: js.UndefOr[Double] = js.undefined
  
  /** The content of the extracted passage. */
  var passage_text: js.UndefOr[String] = js.undefined
  
  /** The position of the first character of the extracted passage in the originating field. */
  var start_offset: js.UndefOr[Double] = js.undefined
}
object QueryPassages {
  
  inline def apply(): QueryPassages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryPassages]
  }
  
  extension [Self <: QueryPassages](x: Self) {
    
    inline def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    inline def setDocument_idUndefined: Self = StObject.set(x, "document_id", js.undefined)
    
    inline def setEnd_offset(value: Double): Self = StObject.set(x, "end_offset", value.asInstanceOf[js.Any])
    
    inline def setEnd_offsetUndefined: Self = StObject.set(x, "end_offset", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setPassage_score(value: Double): Self = StObject.set(x, "passage_score", value.asInstanceOf[js.Any])
    
    inline def setPassage_scoreUndefined: Self = StObject.set(x, "passage_score", js.undefined)
    
    inline def setPassage_text(value: String): Self = StObject.set(x, "passage_text", value.asInstanceOf[js.Any])
    
    inline def setPassage_textUndefined: Self = StObject.set(x, "passage_text", js.undefined)
    
    inline def setStart_offset(value: Double): Self = StObject.set(x, "start_offset", value.asInstanceOf[js.Any])
    
    inline def setStart_offsetUndefined: Self = StObject.set(x, "start_offset", js.undefined)
  }
}
