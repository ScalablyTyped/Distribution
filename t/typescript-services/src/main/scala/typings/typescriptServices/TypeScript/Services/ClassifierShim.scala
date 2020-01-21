package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.ClassifierShim")
@js.native
class ClassifierShim protected () extends ShimBase {
  def this(factory: IShimFactory, host: IClassifierHost) = this()
  var classifier: Classifier = js.native
  var host: IClassifierHost = js.native
  def getClassificationsForLine(text: String, lexState: EndOfLineState): String = js.native
}

