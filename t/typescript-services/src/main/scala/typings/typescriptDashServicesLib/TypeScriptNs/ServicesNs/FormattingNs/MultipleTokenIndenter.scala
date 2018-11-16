package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.MultipleTokenIndenter")
@js.native
class MultipleTokenIndenter protected () extends IndentationTrackingWalker {
  def this(textSpan: typescriptDashServicesLib.TypeScriptNs.TextSpan, sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, snapshot: ITextSnapshot, indentFirstToken: scala.Boolean, options: typescriptDashServicesLib.FormattingOptions) = this()
  var _edits: js.Any = js.native
  def edits(): js.Array[TextEditInfo] = js.native
  def recordEdit(position: scala.Double, length: scala.Double, replaceWith: java.lang.String): scala.Unit = js.native
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

