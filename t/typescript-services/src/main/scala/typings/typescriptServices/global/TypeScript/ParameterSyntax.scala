package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxElement
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import typings.typescriptServices.TypeScript.ISyntaxVisitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ParameterSyntax")
@js.native
open class ParameterSyntax protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.ParameterSyntax {
  def this(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
    equalsValueClause: typings.typescriptServices.TypeScript.EqualsValueClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): Any = js.native
  
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
object ParameterSyntax {
  
  @JSGlobal("TypeScript.ParameterSyntax")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.ParameterSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(identifier.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.ParameterSyntax]
  
  /* static member */
  inline def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.ParameterSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("create1")(identifier.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.ParameterSyntax]
}
