package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Classifier and score combination. */
trait ClassifierResult extends StObject {
  
  /** Classes within the classifier. */
  var classes: js.Array[ClassResult]
  
  /** ID of a classifier identified in the image. */
  var classifier_id: String
  
  /** Name of the classifier. */
  var name: String
}
object ClassifierResult {
  
  inline def apply(classes: js.Array[ClassResult], classifier_id: String, name: String): ClassifierResult = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], classifier_id = classifier_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierResult]
  }
  
  extension [Self <: ClassifierResult](x: Self) {
    
    inline def setClasses(value: js.Array[ClassResult]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesVarargs(value: ClassResult*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
