package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.TextEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattingManager extends js.Object {
  var options: js.Any
  var rulesProvider: js.Any
  var snapshot: js.Any
  var syntaxTree: js.Any
  def formatDocument(minChar: Double, limChar: Double): js.Array[TextEdit]
  def formatOnClosingCurlyBrace(caretPosition: Double): js.Array[TextEdit]
  def formatOnEnter(caretPosition: Double): js.Array[TextEdit]
  def formatOnPaste(minChar: Double, limChar: Double): js.Array[TextEdit]
  def formatOnSemicolon(caretPosition: Double): js.Array[TextEdit]
  def formatSelection(minChar: Double, limChar: Double): js.Array[TextEdit]
  /* private */ def formatSpan(span: js.Any, formattingRequestKind: js.Any): js.Any
}

object FormattingManager {
  @scala.inline
  def apply(
    formatDocument: (Double, Double) => js.Array[TextEdit],
    formatOnClosingCurlyBrace: Double => js.Array[TextEdit],
    formatOnEnter: Double => js.Array[TextEdit],
    formatOnPaste: (Double, Double) => js.Array[TextEdit],
    formatOnSemicolon: Double => js.Array[TextEdit],
    formatSelection: (Double, Double) => js.Array[TextEdit],
    formatSpan: (js.Any, js.Any) => js.Any,
    options: js.Any,
    rulesProvider: js.Any,
    snapshot: js.Any,
    syntaxTree: js.Any
  ): FormattingManager = {
    val __obj = js.Dynamic.literal(formatDocument = js.Any.fromFunction2(formatDocument), formatOnClosingCurlyBrace = js.Any.fromFunction1(formatOnClosingCurlyBrace), formatOnEnter = js.Any.fromFunction1(formatOnEnter), formatOnPaste = js.Any.fromFunction2(formatOnPaste), formatOnSemicolon = js.Any.fromFunction1(formatOnSemicolon), formatSelection = js.Any.fromFunction2(formatSelection), formatSpan = js.Any.fromFunction2(formatSpan), options = options.asInstanceOf[js.Any], rulesProvider = rulesProvider.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], syntaxTree = syntaxTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingManager]
  }
}

