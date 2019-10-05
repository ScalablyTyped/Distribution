package typings.typescriptDashServices.TypeScript

import typings.typescriptDashServices.FormattingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxDedenter")
@js.native
class SyntaxDedenter protected () extends SyntaxRewriter {
  def this(
    dedentFirstToken: Boolean,
    dedentationAmount: Double,
    minimumIndent: Double,
    options: FormattingOptions
  ) = this()
  var dedentationAmount: js.Any = js.native
  var lastTriviaWasNewLine: js.Any = js.native
  var minimumIndent: js.Any = js.native
  var options: js.Any = js.native
  /* private */ def abort(): js.Any = js.native
  /* private */ def dedentMultiLineComment(trivia: js.Any): js.Any = js.native
  /* private */ def dedentSegment(segment: js.Any, hasFollowingNewLineTrivia: js.Any): js.Any = js.native
  /* private */ def dedentTriviaList(triviaList: js.Any): js.Any = js.native
  /* private */ def dedentWhitespace(trivia: js.Any, hasFollowingNewLineTrivia: js.Any): js.Any = js.native
  /* private */ def isAborted(): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.SyntaxDedenter")
@js.native
object SyntaxDedenter extends js.Object {
  def dedentNode(
    node: ISyntaxNode,
    dedentFirstToken: Boolean,
    dedentAmount: Double,
    minimumIndent: Double,
    options: FormattingOptions
  ): ISyntaxNode = js.native
}

