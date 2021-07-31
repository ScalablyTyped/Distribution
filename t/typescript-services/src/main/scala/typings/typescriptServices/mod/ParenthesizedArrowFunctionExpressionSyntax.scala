package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxElement
import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import typings.typescriptServices.TypeScript.ISyntaxVisitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ParenthesizedArrowFunctionExpressionSyntax")
@js.native
class ParenthesizedArrowFunctionExpressionSyntax protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax {
  def this(
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): js.Any = js.native
  
  /* CompleteClass */
  var block: typings.typescriptServices.TypeScript.BlockSyntax = js.native
  
  /* CompleteClass */
  override def childAt(index: Double): ISyntaxElement = js.native
  
  /* CompleteClass */
  override def childCount(): Double = js.native
  
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[String]): Unit = js.native
  
  /* CompleteClass */
  var equalsGreaterThanToken: ISyntaxToken = js.native
  
  /* CompleteClass */
  var expression: IExpressionSyntax = js.native
  
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  
  /* CompleteClass */
  override def fullText(): String = js.native
  
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  
  /* CompleteClass */
  override def isArrowFunctionExpression(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  /* CompleteClass */
  override def isIncrementallyUnusable(): Boolean = js.native
  
  /* CompleteClass */
  override def isList(): Boolean = js.native
  
  /* CompleteClass */
  override def isNode(): Boolean = js.native
  
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
object ParenthesizedArrowFunctionExpressionSyntax {
  
  @JSImport("typescript-services", "ParenthesizedArrowFunctionExpressionSyntax")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def create(
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callSignature.asInstanceOf[js.Any], equalsGreaterThanToken.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax]
  
  /* static member */
  @scala.inline
  def create1(): typings.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("create1")().asInstanceOf[typings.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax]
}
