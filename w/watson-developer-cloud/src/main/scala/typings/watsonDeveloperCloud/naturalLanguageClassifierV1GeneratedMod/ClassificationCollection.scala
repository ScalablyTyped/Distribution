package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response from the classifier for multiple phrases. */
@js.native
trait ClassificationCollection extends StObject {
  
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
  implicit class ClassificationCollectionMutableBuilder[Self <: ClassificationCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassifier_idUndefined: Self = StObject.set(x, "classifier_id", js.undefined)
    
    @scala.inline
    def setCollection(value: js.Array[CollectionItem]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    @scala.inline
    def setCollectionVarargs(value: CollectionItem*): Self = StObject.set(x, "collection", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
