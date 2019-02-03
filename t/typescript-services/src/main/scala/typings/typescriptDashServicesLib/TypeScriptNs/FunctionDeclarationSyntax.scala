package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.FunctionDeclarationSyntax")
@js.native
class FunctionDeclarationSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(modifiers: ISyntaxList, functionKeyword: ISyntaxToken, identifier: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax, semicolonToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var block: BlockSyntax = js.native
  var callSignature: CallSignatureSyntax = js.native
  var functionKeyword: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  var modifiers: ISyntaxList = js.native
  var semicolonToken: ISyntaxToken = js.native
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
  override def isNode(): scala.Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def isStatement(): scala.Boolean = js.native
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
    modifiers: ISyntaxList,
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): FunctionDeclarationSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withBlock(block: BlockSyntax): FunctionDeclarationSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): FunctionDeclarationSyntax = js.native
  def withFunctionKeyword(functionKeyword: ISyntaxToken): FunctionDeclarationSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): FunctionDeclarationSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withModifier(modifier: ISyntaxToken): FunctionDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): FunctionDeclarationSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): FunctionDeclarationSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

/* static members */
@JSGlobal("TypeScript.FunctionDeclarationSyntax")
@js.native
object FunctionDeclarationSyntax extends js.Object {
  def create(
    functionKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax
  ): typescriptDashServicesLib.TypeScriptNs.FunctionDeclarationSyntax = js.native
  def create1(identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.FunctionDeclarationSyntax = js.native
}

