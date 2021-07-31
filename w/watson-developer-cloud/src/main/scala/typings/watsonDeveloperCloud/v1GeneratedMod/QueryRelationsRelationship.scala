package typings.watsonDeveloperCloud.v1GeneratedMod

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
  
  @scala.inline
  def apply(): QueryRelationsRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsRelationship]
  }
  
  @scala.inline
  implicit class QueryRelationsRelationshipMutableBuilder[Self <: QueryRelationsRelationship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[QueryRelationsArgument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: QueryRelationsArgument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setEvidence(value: js.Array[QueryEvidence]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    @scala.inline
    def setEvidenceVarargs(value: QueryEvidence*): Self = StObject.set(x, "evidence", js.Array(value :_*))
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
