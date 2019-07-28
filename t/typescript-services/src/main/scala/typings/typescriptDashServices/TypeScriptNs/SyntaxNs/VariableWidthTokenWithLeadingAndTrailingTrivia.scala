package typings.typescriptDashServices.TypeScriptNs.SyntaxNs

import typings.typescriptDashServices.TypeScriptNs.ISyntaxElement
import typings.typescriptDashServices.TypeScriptNs.ISyntaxNodeOrToken
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import typings.typescriptDashServices.TypeScriptNs.ISyntaxTriviaList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxVisitor
import typings.typescriptDashServices.TypeScriptNs.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Syntax.VariableWidthTokenWithLeadingAndTrailingTrivia")
@js.native
class VariableWidthTokenWithLeadingAndTrailingTrivia protected () extends ISyntaxToken {
  def this(fullText: String, kind: SyntaxKind, leadingTriviaInfo: Double, trailingTriviaInfo: Double) = this()
  var _fullText: js.Any = js.native
  var _leadingTriviaInfo: js.Any = js.native
  var _trailingTriviaInfo: js.Any = js.native
  /* CompleteClass */
  override var tokenKind: SyntaxKind = js.native
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): js.Any = js.native
  /* CompleteClass */
  override def childAt(index: Double): ISyntaxElement = js.native
  /* CompleteClass */
  override def childCount(): Double = js.native
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[String]): Unit = js.native
  /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def fullText(): String = js.native
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  /* CompleteClass */
  override def hasLeadingComment(): Boolean = js.native
  /* CompleteClass */
  override def hasLeadingNewLine(): Boolean = js.native
  /* CompleteClass */
  override def hasLeadingSkippedText(): Boolean = js.native
  /* CompleteClass */
  override def hasLeadingTrivia(): Boolean = js.native
  /* CompleteClass */
  override def hasSkippedToken(): Boolean = js.native
  /* CompleteClass */
  override def hasTrailingComment(): Boolean = js.native
  /* CompleteClass */
  override def hasTrailingNewLine(): Boolean = js.native
  /* CompleteClass */
  override def hasTrailingSkippedText(): Boolean = js.native
  /* CompleteClass */
  override def hasTrailingTrivia(): Boolean = js.native
  /* CompleteClass */
  override def isExpression(): Boolean = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): Boolean = js.native
  /* CompleteClass */
  override def isList(): Boolean = js.native
  /* CompleteClass */
  override def isMemberExpression(): Boolean = js.native
  /* CompleteClass */
  override def isNode(): Boolean = js.native
  /* CompleteClass */
  override def isPostfixExpression(): Boolean = js.native
  /* CompleteClass */
  override def isPrimaryExpression(): Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): Boolean = js.native
  /* CompleteClass */
  override def isToken(): Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): Boolean = js.native
  /* CompleteClass */
  override def isUnaryExpression(): Boolean = js.native
  /* CompleteClass */
  override def kind(): SyntaxKind = js.native
  /* CompleteClass */
  override def lastToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def leadingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def leadingTriviaWidth(): Double = js.native
  /* private */ def realize(): js.Any = js.native
  /* CompleteClass */
  override def text(): String = js.native
  def toJSON(key: js.Any): js.Any = js.native
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  /* CompleteClass */
  override def value(): js.Any = js.native
  /* CompleteClass */
  override def valueText(): String = js.native
  /* CompleteClass */
  override def width(): Double = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

