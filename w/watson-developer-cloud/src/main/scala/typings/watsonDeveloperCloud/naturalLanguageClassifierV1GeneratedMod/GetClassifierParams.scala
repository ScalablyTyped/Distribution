package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getClassifier` operation. */
trait GetClassifierParams extends StObject {
  
  /** Classifier ID to query. */
  var classifier_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object GetClassifierParams {
  
  @scala.inline
  def apply(classifier_id: String): GetClassifierParams = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClassifierParams]
  }
  
  @scala.inline
  implicit class GetClassifierParamsMutableBuilder[Self <: GetClassifierParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
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
