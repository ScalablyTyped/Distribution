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
  
  inline def apply(
    classifier: Classifier,
    dispose: Any => Unit,
    factory: Any,
    getClassificationsForLine: (String, EndOfLineState) => String,
    host: IClassifierHost
  ): ClassifierShim = {
    val __obj = js.Dynamic.literal(classifier = classifier.asInstanceOf[js.Any], dispose = js.Any.fromFunction1(dispose), factory = factory.asInstanceOf[js.Any], getClassificationsForLine = js.Any.fromFunction2(getClassificationsForLine), host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierShim]
  }
  
  extension [Self <: ClassifierShim](x: Self) {
    
    inline def setClassifier(value: Classifier): Self = StObject.set(x, "classifier", value.asInstanceOf[js.Any])
    
    inline def setGetClassificationsForLine(value: (String, EndOfLineState) => String): Self = StObject.set(x, "getClassificationsForLine", js.Any.fromFunction2(value))
    
    inline def setHost(value: IClassifierHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
  }
}
