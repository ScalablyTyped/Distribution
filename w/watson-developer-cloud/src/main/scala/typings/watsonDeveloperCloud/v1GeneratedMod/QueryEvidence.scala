package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Description of evidence location supporting Knoweldge Graph query result. */
trait QueryEvidence extends StObject {
  
  /** The docuemnt ID (as indexed in Discovery) of the evidence location. */
  var document_id: js.UndefOr[String] = js.undefined
  
  /** The end location of the evidence in the identified field. This value is inclusive. */
  var end_offset: js.UndefOr[Double] = js.undefined
  
  /** An array of entity objects that show evidence of the result. */
  var entities: js.UndefOr[js.Array[QueryEvidenceEntity]] = js.undefined
  
  /** The field of the document where the supporting evidence was identified. */
  var field: js.UndefOr[String] = js.undefined
  
  /** The start location of the evidence in the identified field. This value is inclusive. */
  var start_offset: js.UndefOr[Double] = js.undefined
}
object QueryEvidence {
  
  inline def apply(): QueryEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEvidence]
  }
  
  extension [Self <: QueryEvidence](x: Self) {
    
    inline def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    inline def setDocument_idUndefined: Self = StObject.set(x, "document_id", js.undefined)
    
    inline def setEnd_offset(value: Double): Self = StObject.set(x, "end_offset", value.asInstanceOf[js.Any])
    
    inline def setEnd_offsetUndefined: Self = StObject.set(x, "end_offset", js.undefined)
    
    inline def setEntities(value: js.Array[QueryEvidenceEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: QueryEvidenceEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setStart_offset(value: Double): Self = StObject.set(x, "start_offset", value.asInstanceOf[js.Any])
    
    inline def setStart_offsetUndefined: Self = StObject.set(x, "start_offset", js.undefined)
  }
}
