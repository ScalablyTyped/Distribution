package typings
package typescriptDashServicesLib.TypeScriptNs.SyntaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Syntax")
@js.native
object ^ extends js.Object {
  var carriageReturnLineFeedTrivia: typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia = js.native
  var carriageReturnTrivia: typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia = js.native
  var emptyList: typescriptDashServicesLib.TypeScriptNs.ISyntaxList = js.native
  var emptySeparatedList: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList = js.native
  var emptyTriviaList: typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList = js.native
  var lineFeedTrivia: typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia = js.native
  var normalModeFactory: typescriptDashServicesLib.TypeScriptNs.SyntaxNs.IFactory = js.native
  var spaceTrivia: typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia = js.native
  var spaceTriviaList: typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList = js.native
  var strictModeFactory: typescriptDashServicesLib.TypeScriptNs.SyntaxNs.IFactory = js.native
  def assignmentExpression(
    left: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    right: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.BinaryExpressionSyntax = js.native
  def childIndex(
    parent: typescriptDashServicesLib.TypeScriptNs.ISyntaxElement,
    child: typescriptDashServicesLib.TypeScriptNs.ISyntaxElement
  ): scala.Double = js.native
  def childOffset(
    parent: typescriptDashServicesLib.TypeScriptNs.ISyntaxElement,
    child: typescriptDashServicesLib.TypeScriptNs.ISyntaxElement
  ): scala.Double = js.native
  def childOffsetAt(parent: typescriptDashServicesLib.TypeScriptNs.ISyntaxElement, index: scala.Double): scala.Double = js.native
  def convertToIdentifierName(token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  def deferredTrivia(
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    text: typescriptDashServicesLib.TypeScriptNs.ISimpleText,
    fullStart: scala.Double,
    fullWidth: scala.Double
  ): typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia = js.native
  def elementStructuralEquals(
    element1: typescriptDashServicesLib.TypeScriptNs.ISyntaxElement,
    element2: typescriptDashServicesLib.TypeScriptNs.ISyntaxElement
  ): scala.Boolean = js.native
  def emptySourceUnit(): typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax = js.native
  def emptyToken(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  def falseExpression(): typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax = js.native
  def findSkippedTokenInLeadingTriviaList(positionedToken: typescriptDashServicesLib.TypeScriptNs.PositionedToken, position: scala.Double): typescriptDashServicesLib.TypeScriptNs.PositionedSkippedToken = js.native
  def findSkippedTokenInPositionedToken(positionedToken: typescriptDashServicesLib.TypeScriptNs.PositionedToken, position: scala.Double): typescriptDashServicesLib.TypeScriptNs.PositionedSkippedToken = js.native
  def findSkippedTokenInTrailingTriviaList(positionedToken: typescriptDashServicesLib.TypeScriptNs.PositionedToken, position: scala.Double): typescriptDashServicesLib.TypeScriptNs.PositionedSkippedToken = js.native
  def findSkippedTokenOnLeft(positionedToken: typescriptDashServicesLib.TypeScriptNs.PositionedToken, position: scala.Double): typescriptDashServicesLib.TypeScriptNs.PositionedSkippedToken = js.native
  def getAncestorOfKind(
    positionedToken: typescriptDashServicesLib.TypeScriptNs.PositionedElement,
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind
  ): typescriptDashServicesLib.TypeScriptNs.PositionedElement = js.native
  def getStandaloneExpression(positionedToken: typescriptDashServicesLib.TypeScriptNs.PositionedToken): typescriptDashServicesLib.TypeScriptNs.PositionedNodeOrToken = js.native
  def hasAncestorOfKind(
    positionedToken: typescriptDashServicesLib.TypeScriptNs.PositionedElement,
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind
  ): scala.Boolean = js.native
  def identifier(text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  def identifier(text: java.lang.String, info: typescriptDashServicesLib.TypeScriptNs.ITokenInfo): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  def identifierName(text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  def identifierName(text: java.lang.String, info: typescriptDashServicesLib.TypeScriptNs.ITokenInfo): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  def isEntirelyInStringOrRegularExpressionLiteral(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): scala.Boolean = js.native
  def isEntirelyInsideComment(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): scala.Boolean = js.native
  def isEntirelyInsideCommentTrivia(
    trivia: typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia,
    fullStart: scala.Double,
    position: scala.Double
  ): scala.Boolean = js.native
  def isExpression(token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): scala.Boolean = js.native
  def isInModuleOrTypeContext(positionedToken: typescriptDashServicesLib.TypeScriptNs.PositionedToken): scala.Boolean = js.native
  def isInTypeOnlyContext(positionedToken: typescriptDashServicesLib.TypeScriptNs.PositionedToken): scala.Boolean = js.native
  def isIntegerLiteral(expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax): scala.Boolean = js.native
  def isSuperInvocationExpression(node: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax): scala.Boolean = js.native
  def isSuperInvocationExpressionStatement(node: typescriptDashServicesLib.TypeScriptNs.SyntaxNode): scala.Boolean = js.native
  def isSuperMemberAccessExpression(node: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax): scala.Boolean = js.native
  def isSuperMemberAccessInvocationExpression(node: typescriptDashServicesLib.TypeScriptNs.SyntaxNode): scala.Boolean = js.native
  def isUnterminatedMultilineCommentTrivia(trivia: typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia): scala.Boolean = js.native
  def isUnterminatedStringLiteral(token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): scala.Boolean = js.native
  def list(nodes: js.Array[typescriptDashServicesLib.TypeScriptNs.ISyntaxNodeOrToken]): typescriptDashServicesLib.TypeScriptNs.ISyntaxList = js.native
  def listStructuralEquals(
    list1: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    list2: typescriptDashServicesLib.TypeScriptNs.ISyntaxList
  ): scala.Boolean = js.native
  def massageEscapes(text: java.lang.String): java.lang.String = js.native
  def multiLineComment(text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia = js.native
  def nodeHasSkippedOrMissingTokens(node: typescriptDashServicesLib.TypeScriptNs.SyntaxNode): scala.Boolean = js.native
  def nodeOrTokenStructuralEquals(
    node1: typescriptDashServicesLib.TypeScriptNs.ISyntaxNodeOrToken,
    node2: typescriptDashServicesLib.TypeScriptNs.ISyntaxNodeOrToken
  ): scala.Boolean = js.native
  def nodeStructuralEquals(
    node1: typescriptDashServicesLib.TypeScriptNs.SyntaxNode,
    node2: typescriptDashServicesLib.TypeScriptNs.SyntaxNode
  ): scala.Boolean = js.native
  def numericLiteralExpression(text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax = js.native
  def realizeToken(token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  def separatedList(nodes: js.Array[typescriptDashServicesLib.TypeScriptNs.ISyntaxNodeOrToken]): typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList = js.native
  def separatedListStructuralEquals(
    list1: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    list2: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList
  ): scala.Boolean = js.native
  def singleLineComment(text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia = js.native
  def skippedTokenTrivia(token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia = js.native
  def spaces(count: scala.Double): typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia = js.native
  def splitMultiLineCommentTriviaIntoMultipleLines(trivia: typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia): js.Array[java.lang.String] = js.native
  def stringLiteralExpression(text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax = js.native
  def token(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  def token(
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    info: typescriptDashServicesLib.TypeScriptNs.ITokenInfo
  ): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  def tokenStructuralEquals(
    token1: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    token2: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): scala.Boolean = js.native
  def tokenToJSON(token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): js.Any = js.native
  def trivia(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind, text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia = js.native
  def triviaList(trivia: js.Array[typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia]): typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList = js.native
  def triviaListStructuralEquals(
    triviaList1: typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList,
    triviaList2: typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList
  ): scala.Boolean = js.native
  def triviaStructuralEquals(
    trivia1: typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia,
    trivia2: typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia
  ): scala.Boolean = js.native
  def trueExpression(): typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax = js.native
  def value(token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): js.Any = js.native
  def valueText(token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): java.lang.String = js.native
  def whitespace(text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.ISyntaxTrivia = js.native
}

