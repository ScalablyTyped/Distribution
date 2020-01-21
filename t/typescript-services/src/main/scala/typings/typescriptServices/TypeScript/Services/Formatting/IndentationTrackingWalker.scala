package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.FormattingOptions
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.SourceUnitSyntax
import typings.typescriptServices.TypeScript.SyntaxWalker
import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.IndentationTrackingWalker")
@js.native
class IndentationTrackingWalker protected () extends SyntaxWalker {
  def this(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    indentFirstToken: Boolean,
    options: FormattingOptions
  ) = this()
  var _indentationNodeContextPool: js.Any = js.native
  var _lastTriviaWasNewLine: js.Any = js.native
  var _parent: js.Any = js.native
  var _position: js.Any = js.native
  var _snapshot: js.Any = js.native
  var _textSpan: js.Any = js.native
  var options: FormattingOptions = js.native
  def forceIndentNextToken(tokenStart: Double): Unit = js.native
  /* private */ def forceRecomputeIndentationOfParent(tokenStart: js.Any, newLineAdded: js.Any): js.Any = js.native
  def forceSkipIndentingNextToken(tokenStart: Double): Unit = js.native
  /* private */ def getCommentIndentationAmount(token: js.Any): js.Any = js.native
  /* private */ def getNodeIndentation(node: js.Any): js.Any = js.native
  /* private */ def getNodeIndentation(node: js.Any, newLineInsertedByFormatting: js.Any): js.Any = js.native
  /* private */ def getTokenIndentationAmount(token: js.Any): js.Any = js.native
  def indentToken(token: ISyntaxToken, indentationAmount: Double, commentIndentationAmount: Double): Unit = js.native
  def indentationNodeContextPool(): IndentationNodeContextPool = js.native
  def parent(): IndentationNodeContext = js.native
  def position(): Double = js.native
  /* private */ def shouldIndentBlockInParent(parent: js.Any): js.Any = js.native
  def snapshot(): ITextSnapshot = js.native
  def textSpan(): TextSpan = js.native
  def visitTokenInSpan(token: ISyntaxToken): Unit = js.native
}

