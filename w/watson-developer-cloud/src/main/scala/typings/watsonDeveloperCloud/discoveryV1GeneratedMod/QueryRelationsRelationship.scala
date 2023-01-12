package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryRelationsRelationship. */
trait QueryRelationsRelationship extends StObject {
  
  /** Information about the relationship. */
  var arguments: js.UndefOr[js.Array[QueryRelationsArgument]] = js.undefined
  
  /** List of different evidentiary items to support the result. */
  var evidence: js.UndefOr[js.Array[QueryEvidence]] = js.undefined
  
  /** The number of times the relationship is mentioned. */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /** The identified relationship type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object QueryRelationsRelationship {
  
  inline def apply(): QueryRelationsRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsRelationship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRelationsRelationship] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[QueryRelationsArgument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: QueryRelationsArgument*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setEvidence(value: js.Array[QueryEvidence]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setEvidenceVarargs(value: QueryEvidence*): Self = StObject.set(x, "evidence", js.Array(value*))
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
