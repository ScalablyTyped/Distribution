package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxIndenter")
@js.native
class SyntaxIndenter protected () extends SyntaxRewriter {
  def this(indentFirstToken: scala.Boolean, indentationAmount: scala.Double, options: typescriptDashServicesLib.FormattingOptions) = this()
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
  def indentNode(
    node: typescriptDashServicesLib.TypeScriptNs.ISyntaxNode,
    indentFirstToken: scala.Boolean,
    indentAmount: scala.Double,
    options: typescriptDashServicesLib.FormattingOptions
  ): typescriptDashServicesLib.TypeScriptNs.SyntaxNode = js.native
  def indentNodes(
    nodes: js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxNode],
    indentFirstToken: scala.Boolean,
    indentAmount: scala.Double,
    options: typescriptDashServicesLib.FormattingOptions
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxNode] = js.native
}

