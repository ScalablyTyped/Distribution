package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** Response from the classifier for a phrase. */
@js.native
trait Classification extends StObject {
  
  /** An array of up to ten class-confidence pairs sorted in descending order of confidence. */
  var classes: js.UndefOr[js.Array[ClassifiedClass]] = js.native
  
  /** Unique identifier for this classifier. */
  var classifier_id: js.UndefOr[String] = js.native
  
  /** The submitted phrase. */
  var text: js.UndefOr[String] = js.native
  
  /** The class with the highest confidence. */
  var top_class: js.UndefOr[String] = js.native
  
  /** Link to the classifier. */
  var url: js.UndefOr[String] = js.native
}
object Classification {
  
  @scala.inline
  def apply(): Classification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classification]
  }
  
  @scala.inline
  implicit class ClassificationMutableBuilder[Self <: Classification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Array[ClassifiedClass]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: ClassifiedClass*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    @scala.inline
    def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassifier_idUndefined: Self = StObject.set(x, "classifier_id", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTop_class(value: String): Self = StObject.set(x, "top_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_classUndefined: Self = StObject.set(x, "top_class", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
