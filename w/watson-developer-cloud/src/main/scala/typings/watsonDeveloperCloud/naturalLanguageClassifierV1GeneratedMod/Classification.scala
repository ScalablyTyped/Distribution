package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** Response from the classifier for a phrase. */
trait Classification extends StObject {
  
  /** An array of up to ten class-confidence pairs sorted in descending order of confidence. */
  var classes: js.UndefOr[js.Array[ClassifiedClass]] = js.undefined
  
  /** Unique identifier for this classifier. */
  var classifier_id: js.UndefOr[String] = js.undefined
  
  /** The submitted phrase. */
  var text: js.UndefOr[String] = js.undefined
  
  /** The class with the highest confidence. */
  var top_class: js.UndefOr[String] = js.undefined
  
  /** Link to the classifier. */
  var url: js.UndefOr[String] = js.undefined
}
object Classification {
  
  inline def apply(): Classification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classification]
  }
  
  extension [Self <: Classification](x: Self) {
    
    inline def setClasses(value: js.Array[ClassifiedClass]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: ClassifiedClass*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
    inline def setClassifier_idUndefined: Self = StObject.set(x, "classifier_id", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTop_class(value: String): Self = StObject.set(x, "top_class", value.asInstanceOf[js.Any])
    
    inline def setTop_classUndefined: Self = StObject.set(x, "top_class", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
