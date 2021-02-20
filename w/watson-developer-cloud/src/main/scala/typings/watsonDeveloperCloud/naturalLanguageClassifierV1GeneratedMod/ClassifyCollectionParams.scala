package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `classifyCollection` operation. */
@js.native
trait ClassifyCollectionParams extends StObject {
  
  /** Classifier ID to use. */
  var classifier_id: String = js.native
  
  /** The submitted phrases. */
  var collection: js.Array[ClassifyInput] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object ClassifyCollectionParams {
  
  @scala.inline
  def apply(classifier_id: String, collection: js.Array[ClassifyInput]): ClassifyCollectionParams = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyCollectionParams]
  }
  
  @scala.inline
  implicit class ClassifyCollectionParamsMutableBuilder[Self <: ClassifyCollectionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection(value: js.Array[ClassifyInput]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionVarargs(value: ClassifyInput*): Self = StObject.set(x, "collection", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
