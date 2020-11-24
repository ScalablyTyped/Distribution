package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response from the classifier for multiple phrases. */
@js.native
trait ClassificationCollection extends js.Object {
  
  /** Unique identifier for this classifier. */
  var classifier_id: js.UndefOr[String] = js.native
  
  /** An array of classifier responses for each submitted phrase. */
  var collection: js.UndefOr[js.Array[CollectionItem]] = js.native
  
  /** Link to the classifier. */
  var url: js.UndefOr[String] = js.native
}
object ClassificationCollection {
  
  @scala.inline
  def apply(): ClassificationCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationCollection]
  }
  
  @scala.inline
  implicit class ClassificationCollectionOps[Self <: ClassificationCollection] (val x: Self) extends AnyVal {
    
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
    def deleteClassifier_id: Self = this.set("classifier_id", js.undefined)
    
    @scala.inline
    def setCollectionVarargs(value: CollectionItem*): Self = this.set("collection", js.Array(value :_*))
    
    @scala.inline
    def setCollection(value: js.Array[CollectionItem]): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
