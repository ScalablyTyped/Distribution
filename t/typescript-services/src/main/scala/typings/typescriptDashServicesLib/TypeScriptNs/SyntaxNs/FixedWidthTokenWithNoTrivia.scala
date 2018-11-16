package typings
package typescriptDashServicesLib.TypeScriptNs.SyntaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Syntax.FixedWidthTokenWithNoTrivia")
@js.native
class FixedWidthTokenWithNoTrivia protected ()
  extends typescriptDashServicesLib.TypeScriptNs.ISyntaxToken {
  def this(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind) = this()
  /* CompleteClass */
  override var tokenKind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind = js.native
  /* CompleteClass */
  override def accept(visitor: typescriptDashServicesLib.TypeScriptNs.ISyntaxVisitor): js.Any = js.native
  /* CompleteClass */
  override def childAt(index: scala.Double): typescriptDashServicesLib.TypeScriptNs.ISyntaxElement = js.native
  /* CompleteClass */
  override def childCount(): scala.Double = js.native
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[java.lang.String]): scala.Unit = js.native
  /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
  /* CompleteClass */
  override def firstToken(): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  /* CompleteClass */
  override def fullText(): java.lang.String = js.native
  /* CompleteClass */
  override def fullWidth(): scala.Double = js.native
  /* CompleteClass */
  override def hasLeadingComment(): scala.Boolean = js.native
  /* CompleteClass */
  override def hasLeadingNewLine(): scala.Boolean = js.native
  /* CompleteClass */
  override def hasLeadingSkippedText(): scala.Boolean = js.native
  /* CompleteClass */
  override def hasLeadingTrivia(): scala.Boolean = js.native
  /* CompleteClass */
  override def hasSkippedToken(): scala.Boolean = js.native
  /* CompleteClass */
  override def hasTrailingComment(): scala.Boolean = js.native
  /* CompleteClass */
  override def hasTrailingNewLine(): scala.Boolean = js.native
  /* CompleteClass */
  override def hasTrailingSkippedText(): scala.Boolean = js.native
  /* CompleteClass */
  override def hasTrailingTrivia(): scala.Boolean = js.native
  /* CompleteClass */
  override def isExpression(): scala.Boolean = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): scala.Boolean = js.native
  /* CompleteClass */
  override def isList(): scala.Boolean = js.native
  /* CompleteClass */
  override def isMemberExpression(): scala.Boolean = js.native
  /* CompleteClass */
  override def isNode(): scala.Boolean = js.native
  /* CompleteClass */
  override def isPostfixExpression(): scala.Boolean = js.native
  /* CompleteClass */
  override def isPrimaryExpression(): scala.Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): scala.Boolean = js.native
  /* CompleteClass */
  override def isToken(): scala.Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): scala.Boolean = js.native
  /* CompleteClass */
  override def isUnaryExpression(): scala.Boolean = js.native
  /* CompleteClass */
  override def kind(): typescriptDashServicesLib.TypeScriptNs.SyntaxKind = js.native
  /* CompleteClass */
  override def lastToken(): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  /* CompleteClass */
  override def leadingTrivia(): typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def leadingTriviaWidth(): scala.Double = js.native
  /* private */ def realize(): js.Any = js.native
  /* CompleteClass */
  override def text(): java.lang.String = js.native
  def toJSON(key: js.Any): js.Any = js.native
  /* CompleteClass */
  override def trailingTrivia(): typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): scala.Double = js.native
  /* CompleteClass */
  override def value(): js.Any = js.native
  /* CompleteClass */
  override def valueText(): java.lang.String = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList): typescriptDashServicesLib.TypeScriptNs.ISyntaxNodeOrToken = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList): typescriptDashServicesLib.TypeScriptNs.ISyntaxNodeOrToken = js.native
}

