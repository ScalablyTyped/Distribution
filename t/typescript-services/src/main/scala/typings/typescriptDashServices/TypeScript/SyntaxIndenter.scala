package typings.typescriptDashServices.TypeScript

import typings.typescriptDashServices.FormattingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxIndenter")
@js.native
class SyntaxIndenter protected () extends SyntaxRewriter {
  def this(indentFirstToken: Boolean, indentationAmount: Double, options: FormattingOptions) = this()
  var indentationAmount: js.Any = js.native
  var indentationTrivia: js.Any = js.native
  var lastTriviaWasNewLine: js.Any = js.native
  var options: js.Any = js.native
  /* private */ def indentMultiLineComment(trivia: js.Any, indentThisTrivia: js.Any, result: js.Any): js.Any = js.native
  /* private */ def indentSegment(segment: js.Any): js.Any = js.native
  /* private */ def indentSingleLineOrSkippedText(trivia: js.Any, indentThisTrivia: js.Any, result: js.Any): js.Any = js.native
  def indentTriviaList(triviaList: ISyntaxTriviaList): ISyntaxTriviaList = js.native
  /* private */ def indentWhitespace(trivia: js.Any, indentThisTrivia: js.Any, result: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.SyntaxIndenter")
@js.native
object SyntaxIndenter extends js.Object {
  def indentNode(node: ISyntaxNode, indentFirstToken: Boolean, indentAmount: Double, options: FormattingOptions): SyntaxNode = js.native
  def indentNodes(
    nodes: js.Array[SyntaxNode],
    indentFirstToken: Boolean,
    indentAmount: Double,
    options: FormattingOptions
  ): js.Array[SyntaxNode] = js.native
}

