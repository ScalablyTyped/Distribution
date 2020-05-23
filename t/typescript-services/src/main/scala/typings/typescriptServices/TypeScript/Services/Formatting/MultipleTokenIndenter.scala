package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleTokenIndenter extends IndentationTrackingWalker {
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

