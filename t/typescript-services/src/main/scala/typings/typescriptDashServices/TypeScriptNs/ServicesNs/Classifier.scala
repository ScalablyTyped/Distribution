package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Classifier")
@js.native
class Classifier protected () extends js.Object {
  def this(host: IClassifierHost) = this()
  var characterWindow: js.Any = js.native
  var diagnostics: js.Any = js.native
  var host: IClassifierHost = js.native
  var scanner: js.Any = js.native
  /* private */ def addResult(text: js.Any, offset: js.Any, result: js.Any, length: js.Any, kind: js.Any): js.Any = js.native
  /* private */ def classFromKind(kind: js.Any): js.Any = js.native
  def getClassificationsForLine(text: String, lexState: EndOfLineState): ClassificationResult = js.native
  /* private */ def processToken(text: js.Any, offset: js.Any, token: js.Any, result: js.Any): js.Any = js.native
  /* private */ def processTriviaList(text: js.Any, offset: js.Any, triviaList: js.Any, result: js.Any): js.Any = js.native
}

