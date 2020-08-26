package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierShim extends ShimBase {
  var classifier: Classifier = js.native
  var host: IClassifierHost = js.native
  def getClassificationsForLine(text: String, lexState: EndOfLineState): String = js.native
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
  implicit class ClassifierShimOps[Self <: ClassifierShim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassifier(value: Classifier): Self = this.set("classifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetClassificationsForLine(value: (String, EndOfLineState) => String): Self = this.set("getClassificationsForLine", js.Any.fromFunction2(value))
    @scala.inline
    def setHost(value: IClassifierHost): Self = this.set("host", value.asInstanceOf[js.Any])
  }
  
}

