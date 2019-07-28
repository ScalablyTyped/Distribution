package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs

import typings.typescriptDashServices.FormattingOptions
import typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax
import typings.typescriptDashServices.TypeScriptNs.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.MultipleTokenIndenter")
@js.native
class MultipleTokenIndenter protected () extends IndentationTrackingWalker {
  def this(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    indentFirstToken: Boolean,
    options: FormattingOptions
  ) = this()
  var _edits: js.Any = js.native
  def edits(): js.Array[TextEditInfo] = js.native
  def recordEdit(position: Double, length: Double, replaceWith: String): Unit = js.native
  /* private */ def recordIndentationEditsForMultiLineComment(
    trivia: js.Any,
    fullStart: js.Any,
    indentationString: js.Any,
    leadingWhiteSpace: js.Any,
    firstLineAlreadyIndented: js.Any
  ): js.Any = js.native
  /* private */ def recordIndentationEditsForSegment(
    segment: js.Any,
    fullStart: js.Any,
    indentationColumns: js.Any,
    whiteSpaceColumnsInFirstSegment: js.Any
  ): js.Any = js.native
  /* private */ def recordIndentationEditsForSingleLineOrSkippedText(trivia: js.Any, fullStart: js.Any, indentationString: js.Any): js.Any = js.native
  /* private */ def recordIndentationEditsForToken(token: js.Any, indentationString: js.Any, commentIndentationString: js.Any): js.Any = js.native
  /* private */ def recordIndentationEditsForWhitespace(trivia: js.Any, fullStart: js.Any, indentationString: js.Any): js.Any = js.native
}

