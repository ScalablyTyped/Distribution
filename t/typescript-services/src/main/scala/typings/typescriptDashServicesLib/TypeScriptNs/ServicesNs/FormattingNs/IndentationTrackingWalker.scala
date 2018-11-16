package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.IndentationTrackingWalker")
@js.native
class IndentationTrackingWalker protected ()
  extends typescriptDashServicesLib.TypeScriptNs.SyntaxWalker {
  def this(textSpan: typescriptDashServicesLib.TypeScriptNs.TextSpan, sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, snapshot: ITextSnapshot, indentFirstToken: scala.Boolean, options: typescriptDashServicesLib.FormattingOptions) = this()
  var _indentationNodeContextPool: js.Any = js.native
  var _lastTriviaWasNewLine: js.Any = js.native
  var _parent: js.Any = js.native
  var _position: js.Any = js.native
  var _snapshot: js.Any = js.native
  var _textSpan: js.Any = js.native
  var options: typescriptDashServicesLib.FormattingOptions = js.native
  def forceIndentNextToken(tokenStart: scala.Double): scala.Unit = js.native
  /* private */ def forceRecomputeIndentationOfParent(tokenStart: js.Any, newLineAdded: js.Any): js.Any = js.native
  def forceSkipIndentingNextToken(tokenStart: scala.Double): scala.Unit = js.native
  /* private */ def getCommentIndentationAmount(token: js.Any): js.Any = js.native
  /* private */ def getNodeIndentation(node: js.Any): js.Any = js.native
  /* private */ def getNodeIndentation(node: js.Any, newLineInsertedByFormatting: js.Any): js.Any = js.native
  /* private */ def getTokenIndentationAmount(token: js.Any): js.Any = js.native
  def indentToken(
    token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    indentationAmount: scala.Double,
    commentIndentationAmount: scala.Double
  ): scala.Unit = js.native
  def indentationNodeContextPool(): IndentationNodeContextPool = js.native
  def parent(): IndentationNodeContext = js.native
  def position(): scala.Double = js.native
  /* private */ def shouldIndentBlockInParent(parent: js.Any): js.Any = js.native
  def snapshot(): ITextSnapshot = js.native
  def textSpan(): typescriptDashServicesLib.TypeScriptNs.TextSpan = js.native
  def visitTokenInSpan(token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): scala.Unit = js.native
}

