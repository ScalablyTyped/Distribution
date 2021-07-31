package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** List of available classifiers. */
trait ClassifierList extends StObject {
  
  /** The classifiers available to the user. Returns an empty array if no classifiers are available. */
  var classifiers: js.Array[Classifier]
}
object ClassifierList {
  
  @scala.inline
  def apply(classifiers: js.Array[Classifier]): ClassifierList = {
    val __obj = js.Dynamic.literal(classifiers = classifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierList]
  }
  
  @scala.inline
  implicit class ClassifierListMutableBuilder[Self <: ClassifierList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifiers(value: js.Array[Classifier]): Self = StObject.set(x, "classifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassifiersVarargs(value: Classifier*): Self = StObject.set(x, "classifiers", js.Array(value :_*))
  }
}
