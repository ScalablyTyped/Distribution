package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classifier extends js.Object {
  var characterWindow: js.Any
  var diagnostics: js.Any
  var host: IClassifierHost
  var scanner: js.Any
  /* private */ def addResult(text: js.Any, offset: js.Any, result: js.Any, length: js.Any, kind: js.Any): js.Any
  /* private */ def classFromKind(kind: js.Any): js.Any
  def getClassificationsForLine(text: String, lexState: EndOfLineState): ClassificationResult
  /* private */ def processToken(text: js.Any, offset: js.Any, token: js.Any, result: js.Any): js.Any
  /* private */ def processTriviaList(text: js.Any, offset: js.Any, triviaList: js.Any, result: js.Any): js.Any
}

object Classifier {
  @scala.inline
  def apply(
    addResult: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    characterWindow: js.Any,
    classFromKind: js.Any => js.Any,
    diagnostics: js.Any,
    getClassificationsForLine: (String, EndOfLineState) => ClassificationResult,
    host: IClassifierHost,
    processToken: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    processTriviaList: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    scanner: js.Any
  ): Classifier = {
    val __obj = js.Dynamic.literal(addResult = js.Any.fromFunction5(addResult), characterWindow = characterWindow.asInstanceOf[js.Any], classFromKind = js.Any.fromFunction1(classFromKind), diagnostics = diagnostics.asInstanceOf[js.Any], getClassificationsForLine = js.Any.fromFunction2(getClassificationsForLine), host = host.asInstanceOf[js.Any], processToken = js.Any.fromFunction4(processToken), processTriviaList = js.Any.fromFunction4(processTriviaList), scanner = scanner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifier]
  }
}

