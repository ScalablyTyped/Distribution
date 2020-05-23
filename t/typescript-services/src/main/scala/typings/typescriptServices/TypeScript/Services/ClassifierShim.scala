package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassifierShim extends ShimBase {
  var classifier: Classifier
  var host: IClassifierHost
  def getClassificationsForLine(text: String, lexState: EndOfLineState): String
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
}

