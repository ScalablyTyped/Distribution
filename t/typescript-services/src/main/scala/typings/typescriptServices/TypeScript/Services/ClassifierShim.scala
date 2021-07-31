package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifierShim
  extends StObject
     with ShimBase {
  
  var classifier: Classifier
  
  def getClassificationsForLine(text: String, lexState: EndOfLineState): String
  
  var host: IClassifierHost
}
object ClassifierShim {
  
  @scala.inline
  def apply(
    classifier: Classifier,
    dispose: js.Any => Unit,
    factory: js.Any,
    getClassificationsForLine: (String, EndOfLineState) => String,
    host: IClassifierHost
  ): ClassifierShim = {
    val __obj = js.Dynamic.literal(classifier = classifier.asInstanceOf[js.Any], dispose = js.Any.fromFunction1(dispose), factory = factory.asInstanceOf[js.Any], getClassificationsForLine = js.Any.fromFunction2(getClassificationsForLine), host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierShim]
  }
  
  @scala.inline
  implicit class ClassifierShimMutableBuilder[Self <: ClassifierShim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifier(value: Classifier): Self = StObject.set(x, "classifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClassificationsForLine(value: (String, EndOfLineState) => String): Self = StObject.set(x, "getClassificationsForLine", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHost(value: IClassifierHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
  }
}
