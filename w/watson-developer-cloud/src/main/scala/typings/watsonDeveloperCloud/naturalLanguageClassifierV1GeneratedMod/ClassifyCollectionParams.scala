package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `classifyCollection` operation. */
@js.native
trait ClassifyCollectionParams extends js.Object {
  
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
  implicit class ClassifyCollectionParamsOps[Self <: ClassifyCollectionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassifier_id(value: String): Self = this.set("classifier_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionVarargs(value: ClassifyInput*): Self = this.set("collection", js.Array(value :_*))
    
    @scala.inline
    def setCollection(value: js.Array[ClassifyInput]): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
}
