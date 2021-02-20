package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A container for the list of classifiers. */
@js.native
trait Classifiers extends StObject {
  
  /** List of classifiers. */
  var classifiers: js.Array[Classifier] = js.native
}
object Classifiers {
  
  @scala.inline
  def apply(classifiers: js.Array[Classifier]): Classifiers = {
    val __obj = js.Dynamic.literal(classifiers = classifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifiers]
  }
  
  @scala.inline
  implicit class ClassifiersMutableBuilder[Self <: Classifiers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifiers(value: js.Array[Classifier]): Self = StObject.set(x, "classifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassifiersVarargs(value: Classifier*): Self = StObject.set(x, "classifiers", js.Array(value :_*))
  }
}
