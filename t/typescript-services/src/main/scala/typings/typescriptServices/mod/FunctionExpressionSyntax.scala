package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxElement
import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import typings.typescriptServices.TypeScript.ISyntaxVisitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "FunctionExpressionSyntax")
@js.native
class FunctionExpressionSyntax protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.FunctionExpressionSyntax {
  def this(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): js.Any = js.native
  
  /* CompleteClass */
  override def childAt(index: Double): ISyntaxElement = js.native
  
  /* CompleteClass */
  override def childCount(): Double = js.native
  
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[String]): Unit = js.native
  
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  
  /* CompleteClass */
  override def fullText(): String = js.native
  
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  
  /* InferMemberOverrides */
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
  override def kind(): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  override def lastToken(): ISyntaxToken = js.native
  
  /* CompleteClass */
  override def leadingTrivia(): ISyntaxTriviaList = js.native
  
  /* CompleteClass */
  override def leadingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  override def width(): Double = js.native
  
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}
object FunctionExpressionSyntax {
  
  @JSImport("typescript-services", "FunctionExpressionSyntax")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def create(
    functionKeyword: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax
  ): typings.typescriptServices.TypeScript.FunctionExpressionSyntax = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(functionKeyword.asInstanceOf[js.Any], callSignature.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.FunctionExpressionSyntax]
  
  /* static member */
  @scala.inline
  def create1(): typings.typescriptServices.TypeScript.FunctionExpressionSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("create1")().asInstanceOf[typings.typescriptServices.TypeScript.FunctionExpressionSyntax]
}
