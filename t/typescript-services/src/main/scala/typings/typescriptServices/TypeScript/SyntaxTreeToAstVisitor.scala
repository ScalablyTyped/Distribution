package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxTreeToAstVisitor
  extends StObject
     with ISyntaxVisitor {
  
  /* private */ var compilationSettings: Any = js.native
  
  /* private */ def convertComment(trivia: Any, commentStartPosition: Any, hasTrailingNewLine: Any): Any = js.native
  
  /* private */ def convertComments(triviaList: Any, commentStartPosition: Any): Any = js.native
  
  /* private */ def convertNodeTrailingComments(node: Any, lastToken: Any, nodeStart: Any): Any = js.native
  
  /* private */ def convertTokenLeadingComments(token: Any, commentStartPosition: Any): Any = js.native
  
  /* private */ def convertTokenTrailingComments(token: Any, commentStartPosition: Any): Any = js.native
  
  def createTokenSpan(fullStart: Double, element: ISyntaxToken): ASTSpan = js.native
  
  /* private */ var fileName: Any = js.native
  
  var lineMap: LineMap = js.native
  
  /* private */ def mergeComments(comments1: Any, comments2: Any): Any = js.native
  
  def movePast(element: ISyntaxElement): Unit = js.native
  
  /* private */ def moveTo(element1: Any, element2: Any): Any = js.native
  
  var position: Double = js.native
  
  var previousTokenTrailingComments: js.Array[Comment] = js.native
  
  /* private */ def setCommentsAndSpan(ast: Any, fullStart: Any, node: Any): Any = js.native
  
  def setSpan(span: AST, fullStart: Double, element: ISyntaxElement): Unit = js.native
  def setSpan(span: AST, fullStart: Double, element: ISyntaxElement, firstToken: Unit, lastToken: ISyntaxToken): Unit = js.native
  def setSpan(span: AST, fullStart: Double, element: ISyntaxElement, firstToken: ISyntaxToken): Unit = js.native
  def setSpan(
    span: AST,
    fullStart: Double,
    element: ISyntaxElement,
    firstToken: ISyntaxToken,
    lastToken: ISyntaxToken
  ): Unit = js.native
  
  def setSpanExplicit(span: IASTSpan, start: Double, end: Double): Unit = js.native
  
  /* private */ def visitIdentifier(token: Any): Any = js.native
  
  /* private */ def visitModifiers(modifiers: Any): Any = js.native
  
  def visitSeparatedSyntaxList(list: ISeparatedSyntaxList): ISeparatedSyntaxList2 = js.native
  
  def visitSyntaxList(node: ISyntaxList): ISyntaxList2 = js.native
  
  def visitTokenWorker(token: ISyntaxToken): IASTToken = js.native
  
  def visitType(`type`: ITypeSyntax): AST = js.native
}
