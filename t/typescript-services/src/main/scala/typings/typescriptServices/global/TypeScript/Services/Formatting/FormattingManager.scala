package typings.typescriptServices.global.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.EditorOptions
import typings.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typings.typescriptServices.TypeScript.Services.TextEdit
import typings.typescriptServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.FormattingManager")
@js.native
class FormattingManager protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.FormattingManager {
  def this(
    syntaxTree: SyntaxTree,
    snapshot: ITextSnapshot,
    rulesProvider: typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
    editorOptions: EditorOptions
  ) = this()
  /* CompleteClass */
  override var options: js.Any = js.native
  /* CompleteClass */
  override var rulesProvider: js.Any = js.native
  /* CompleteClass */
  override var snapshot: js.Any = js.native
  /* CompleteClass */
  override var syntaxTree: js.Any = js.native
  /* CompleteClass */
  override def formatDocument(minChar: Double, limChar: Double): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def formatOnClosingCurlyBrace(caretPosition: Double): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def formatOnEnter(caretPosition: Double): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def formatOnPaste(minChar: Double, limChar: Double): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def formatOnSemicolon(caretPosition: Double): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def formatSelection(minChar: Double, limChar: Double): js.Array[TextEdit] = js.native
  /* CompleteClass */
  /* private */ override def formatSpan(span: js.Any, formattingRequestKind: js.Any): js.Any = js.native
}

