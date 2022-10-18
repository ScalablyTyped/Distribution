package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A container for the list of classifiers. */
trait Classifiers extends StObject {
  
  /** List of classifiers. */
  var classifiers: js.Array[Classifier]
}
object Classifiers {
  
  inline def apply(classifiers: js.Array[Classifier]): Classifiers = {
    val __obj = js.Dynamic.literal(classifiers = classifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifiers]
  }
  
  extension [Self <: Classifiers](x: Self) {
    
    inline def setClassifiers(value: js.Array[Classifier]): Self = StObject.set(x, "classifiers", value.asInstanceOf[js.Any])
    
    inline def setClassifiersVarargs(value: Classifier*): Self = StObject.set(x, "classifiers", js.Array(value*))
  }
}
