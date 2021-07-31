package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Result of a class within a classifier. */
trait ClassResult extends StObject {
  
  /** Name of the class. Class names are translated in the language defined by the **Accept-Language** request header for the build-in classifier IDs (`default`, `food`, and `explicit`). Class names of custom classifiers are not translated. The response might not be in the specified language when the requested language is not supported or when there is no translation for the class name. */
  var class_name: String
  
  /** Confidence score for the property in the range of 0 to 1. A higher score indicates greater likelihood that the class is depicted in the image. The default threshold for returning scores from a classifier is 0.5. */
  var score: Double
  
  /** Knowledge graph of the property. For example, `/fruit/pome/apple/eating apple/Granny Smith`. Included only if identified. */
  var type_hierarchy: js.UndefOr[String] = js.undefined
}
object ClassResult {
  
  @scala.inline
  def apply(class_name: String, score: Double): ClassResult = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassResult]
  }
  
  @scala.inline
  implicit class ClassResultMutableBuilder[Self <: ClassResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass_name(value: String): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType_hierarchy(value: String): Self = StObject.set(x, "type_hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType_hierarchyUndefined: Self = StObject.set(x, "type_hierarchy", js.undefined)
  }
}
