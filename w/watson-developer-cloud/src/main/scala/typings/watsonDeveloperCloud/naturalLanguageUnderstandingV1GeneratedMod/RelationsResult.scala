package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The relations between entities found in the content. */
trait RelationsResult extends StObject {
  
  /** Entity mentions that are involved in the relation. */
  var arguments: js.UndefOr[js.Array[RelationArgument]] = js.undefined
  
  /** Confidence score for the relation. Higher values indicate greater confidence. */
  var score: js.UndefOr[Double] = js.undefined
  
  /** The sentence that contains the relation. */
  var sentence: js.UndefOr[String] = js.undefined
  
  /** The type of the relation. */
  var `type`: js.UndefOr[String] = js.undefined
}
object RelationsResult {
  
  @scala.inline
  def apply(): RelationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationsResult]
  }
  
  @scala.inline
  implicit class RelationsResultMutableBuilder[Self <: RelationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[RelationArgument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: RelationArgument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setSentence(value: String): Self = StObject.set(x, "sentence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentenceUndefined: Self = StObject.set(x, "sentence", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
