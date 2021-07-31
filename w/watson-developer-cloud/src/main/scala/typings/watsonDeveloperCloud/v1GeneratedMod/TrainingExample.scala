package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TrainingExample. */
trait TrainingExample extends StObject {
  
  /** The cross reference associated with this training example. */
  var cross_reference: js.UndefOr[String] = js.undefined
  
  /** The document ID associated with this training example. */
  var document_id: js.UndefOr[String] = js.undefined
  
  /** The relevance of the training example. */
  var relevance: js.UndefOr[Double] = js.undefined
}
object TrainingExample {
  
  @scala.inline
  def apply(): TrainingExample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingExample]
  }
  
  @scala.inline
  implicit class TrainingExampleMutableBuilder[Self <: TrainingExample] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCross_reference(value: String): Self = StObject.set(x, "cross_reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCross_referenceUndefined: Self = StObject.set(x, "cross_reference", js.undefined)
    
    @scala.inline
    def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_idUndefined: Self = StObject.set(x, "document_id", js.undefined)
    
    @scala.inline
    def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
  }
}
