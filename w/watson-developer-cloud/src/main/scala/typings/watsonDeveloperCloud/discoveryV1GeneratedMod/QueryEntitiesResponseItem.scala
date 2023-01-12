package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing Entity query response information. */
trait QueryEntitiesResponseItem extends StObject {
  
  /** List of different evidentiary items to support the result. */
  var evidence: js.UndefOr[js.Array[QueryEvidence]] = js.undefined
  
  /** Entity text content. */
  var text: js.UndefOr[String] = js.undefined
  
  /** The type of the result entity. */
  var `type`: js.UndefOr[String] = js.undefined
}
object QueryEntitiesResponseItem {
  
  inline def apply(): QueryEntitiesResponseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEntitiesResponseItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryEntitiesResponseItem] (val x: Self) extends AnyVal {
    
    inline def setEvidence(value: js.Array[QueryEvidence]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setEvidenceVarargs(value: QueryEvidence*): Self = StObject.set(x, "evidence", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
