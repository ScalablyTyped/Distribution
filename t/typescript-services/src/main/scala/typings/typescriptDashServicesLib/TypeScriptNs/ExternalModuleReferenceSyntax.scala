package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ExternalModuleReferenceSyntax")
@js.native
class ExternalModuleReferenceSyntax protected ()
  extends SyntaxNode
     with IModuleReferenceSyntax {
  def this(requireKeyword: ISyntaxToken, openParenToken: ISyntaxToken, stringLiteral: ISyntaxToken, closeParenToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var closeParenToken: ISyntaxToken = js.native
  var openParenToken: ISyntaxToken = js.native
  var requireKeyword: ISyntaxToken = js.native
  var stringLiteral: ISyntaxToken = js.native
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): js.Any = js.native
  /* CompleteClass */
  override def childAt(index: scala.Double): ISyntaxElement = js.native
  /* CompleteClass */
  override def childCount(): scala.Double = js.native
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[java.lang.String]): scala.Unit = js.native
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def fullText(): java.lang.String = js.native
  /* CompleteClass */
  override def fullWidth(): scala.Double = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): scala.Boolean = js.native
  /* CompleteClass */
  override def isList(): scala.Boolean = js.native
  /* CompleteClass */
  override def isModuleReference(): scala.Boolean = js.native
  /* CompleteClass */
  override def isNode(): scala.Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): scala.Boolean = js.native
  /* CompleteClass */
  override def isToken(): scala.Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): scala.Boolean = js.native
  /* CompleteClass */
  override def kind(): SyntaxKind = js.native
  /* CompleteClass */
  override def lastToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def leadingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def leadingTriviaWidth(): scala.Double = js.native
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): scala.Double = js.native
  def update(
    requireKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    stringLiteral: ISyntaxToken,
    closeParenToken: ISyntaxToken
  ): ExternalModuleReferenceSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): ExternalModuleReferenceSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): ExternalModuleReferenceSyntax = js.native
  def withRequireKeyword(requireKeyword: ISyntaxToken): ExternalModuleReferenceSyntax = js.native
  def withStringLiteral(stringLiteral: ISyntaxToken): ExternalModuleReferenceSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

/* static members */
@JSGlobal("TypeScript.ExternalModuleReferenceSyntax")
@js.native
object ExternalModuleReferenceSyntax extends js.Object {
  def create1(stringLiteral: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.ExternalModuleReferenceSyntax = js.native
}

