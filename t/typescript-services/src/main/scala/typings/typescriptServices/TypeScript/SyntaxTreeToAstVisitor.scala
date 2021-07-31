package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxTreeToAstVisitor
  extends StObject
     with ISyntaxVisitor {
  
  var compilationSettings: js.Any = js.native
  
  /* private */ def convertComment(trivia: js.Any, commentStartPosition: js.Any, hasTrailingNewLine: js.Any): js.Any = js.native
  
  /* private */ def convertComments(triviaList: js.Any, commentStartPosition: js.Any): js.Any = js.native
  
  /* private */ def convertNodeTrailingComments(node: js.Any, lastToken: js.Any, nodeStart: js.Any): js.Any = js.native
  
  /* private */ def convertTokenLeadingComments(token: js.Any, commentStartPosition: js.Any): js.Any = js.native
  
  /* private */ def convertTokenTrailingComments(token: js.Any, commentStartPosition: js.Any): js.Any = js.native
  
  def createTokenSpan(fullStart: Double, element: ISyntaxToken): ASTSpan = js.native
  
  var fileName: js.Any = js.native
  
  var lineMap: LineMap = js.native
  
  /* private */ def mergeComments(comments1: js.Any, comments2: js.Any): js.Any = js.native
  
  def movePast(element: ISyntaxElement): Unit = js.native
  
  /* private */ def moveTo(element1: js.Any, element2: js.Any): js.Any = js.native
  
  var position: Double = js.native
  
  var previousTokenTrailingComments: js.Array[Comment] = js.native
  
  /* private */ def setCommentsAndSpan(ast: js.Any, fullStart: js.Any, node: js.Any): js.Any = js.native
  
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
  
  /* private */ def visitIdentifier(token: js.Any): js.Any = js.native
  
  /* private */ def visitModifiers(modifiers: js.Any): js.Any = js.native
  
  def visitSeparatedSyntaxList(list: ISeparatedSyntaxList): ISeparatedSyntaxList2 = js.native
  
  def visitSyntaxList(node: ISyntaxList): ISyntaxList2 = js.native
  
  def visitTokenWorker(token: ISyntaxToken): IASTToken = js.native
  
  def visitType(`type`: ITypeSyntax): AST = js.native
}
