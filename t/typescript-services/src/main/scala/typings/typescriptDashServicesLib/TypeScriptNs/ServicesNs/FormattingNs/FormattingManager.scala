package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.FormattingManager")
@js.native
class FormattingManager protected () extends js.Object {
  def this(syntaxTree: typescriptDashServicesLib.TypeScriptNs.SyntaxTree, snapshot: ITextSnapshot, rulesProvider: RulesProvider, editorOptions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.EditorOptions) = this()
  var options: js.Any = js.native
  var rulesProvider: js.Any = js.native
  var snapshot: js.Any = js.native
  var syntaxTree: js.Any = js.native
  def formatDocument(minChar: scala.Double, limChar: scala.Double): js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit] = js.native
  def formatOnClosingCurlyBrace(caretPosition: scala.Double): js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit] = js.native
  def formatOnEnter(caretPosition: scala.Double): js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit] = js.native
  def formatOnPaste(minChar: scala.Double, limChar: scala.Double): js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit] = js.native
  def formatOnSemicolon(caretPosition: scala.Double): js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit] = js.native
  def formatSelection(minChar: scala.Double, limChar: scala.Double): js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit] = js.native
  /* private */ def formatSpan(span: js.Any, formattingRequestKind: js.Any): js.Any = js.native
}

