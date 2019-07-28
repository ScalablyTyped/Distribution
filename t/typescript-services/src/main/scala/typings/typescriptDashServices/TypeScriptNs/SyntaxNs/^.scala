package typings.typescriptDashServices.TypeScriptNs.SyntaxNs

import typings.typescriptDashServices.TypeScriptNs.BinaryExpressionSyntax
import typings.typescriptDashServices.TypeScriptNs.IExpressionSyntax
import typings.typescriptDashServices.TypeScriptNs.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISimpleText
import typings.typescriptDashServices.TypeScriptNs.ISyntaxElement
import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxNodeOrToken
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import typings.typescriptDashServices.TypeScriptNs.ISyntaxTrivia
import typings.typescriptDashServices.TypeScriptNs.ISyntaxTriviaList
import typings.typescriptDashServices.TypeScriptNs.ITokenInfo
import typings.typescriptDashServices.TypeScriptNs.IUnaryExpressionSyntax
import typings.typescriptDashServices.TypeScriptNs.PositionedElement
import typings.typescriptDashServices.TypeScriptNs.PositionedNodeOrToken
import typings.typescriptDashServices.TypeScriptNs.PositionedSkippedToken
import typings.typescriptDashServices.TypeScriptNs.PositionedToken
import typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax
import typings.typescriptDashServices.TypeScriptNs.SyntaxKind
import typings.typescriptDashServices.TypeScriptNs.SyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Syntax")
@js.native
object ^ extends js.Object {
  var carriageReturnLineFeedTrivia: ISyntaxTrivia = js.native
  var carriageReturnTrivia: ISyntaxTrivia = js.native
  var emptyList: ISyntaxList = js.native
  var emptySeparatedList: ISeparatedSyntaxList = js.native
  var emptyTriviaList: ISyntaxTriviaList = js.native
  var lineFeedTrivia: ISyntaxTrivia = js.native
  var normalModeFactory: IFactory = js.native
  var spaceTrivia: ISyntaxTrivia = js.native
  var spaceTriviaList: ISyntaxTriviaList = js.native
  var strictModeFactory: IFactory = js.native
  def assignmentExpression(left: IExpressionSyntax, token: ISyntaxToken, right: IExpressionSyntax): BinaryExpressionSyntax = js.native
  def childIndex(parent: ISyntaxElement, child: ISyntaxElement): Double = js.native
  def childOffset(parent: ISyntaxElement, child: ISyntaxElement): Double = js.native
  def childOffsetAt(parent: ISyntaxElement, index: Double): Double = js.native
  def convertToIdentifierName(token: ISyntaxToken): ISyntaxToken = js.native
  def deferredTrivia(kind: SyntaxKind, text: ISimpleText, fullStart: Double, fullWidth: Double): ISyntaxTrivia = js.native
  def elementStructuralEquals(element1: ISyntaxElement, element2: ISyntaxElement): Boolean = js.native
  def emptySourceUnit(): SourceUnitSyntax = js.native
  def emptyToken(kind: SyntaxKind): ISyntaxToken = js.native
  def falseExpression(): IUnaryExpressionSyntax = js.native
  def findSkippedTokenInLeadingTriviaList(positionedToken: PositionedToken, position: Double): PositionedSkippedToken = js.native
  def findSkippedTokenInPositionedToken(positionedToken: PositionedToken, position: Double): PositionedSkippedToken = js.native
  def findSkippedTokenInTrailingTriviaList(positionedToken: PositionedToken, position: Double): PositionedSkippedToken = js.native
  def findSkippedTokenOnLeft(positionedToken: PositionedToken, position: Double): PositionedSkippedToken = js.native
  def getAncestorOfKind(positionedToken: PositionedElement, kind: SyntaxKind): PositionedElement = js.native
  def getStandaloneExpression(positionedToken: PositionedToken): PositionedNodeOrToken = js.native
  def hasAncestorOfKind(positionedToken: PositionedElement, kind: SyntaxKind): Boolean = js.native
  def identifier(text: String): ISyntaxToken = js.native
  def identifier(text: String, info: ITokenInfo): ISyntaxToken = js.native
  def identifierName(text: String): ISyntaxToken = js.native
  def identifierName(text: String, info: ITokenInfo): ISyntaxToken = js.native
  def isEntirelyInStringOrRegularExpressionLiteral(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  def isEntirelyInsideComment(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  def isEntirelyInsideCommentTrivia(trivia: ISyntaxTrivia, fullStart: Double, position: Double): Boolean = js.native
  def isExpression(token: ISyntaxToken): Boolean = js.native
  def isInModuleOrTypeContext(positionedToken: PositionedToken): Boolean = js.native
  def isInTypeOnlyContext(positionedToken: PositionedToken): Boolean = js.native
  def isIntegerLiteral(expression: IExpressionSyntax): Boolean = js.native
  def isSuperInvocationExpression(node: IExpressionSyntax): Boolean = js.native
  def isSuperInvocationExpressionStatement(node: SyntaxNode): Boolean = js.native
  def isSuperMemberAccessExpression(node: IExpressionSyntax): Boolean = js.native
  def isSuperMemberAccessInvocationExpression(node: SyntaxNode): Boolean = js.native
  def isUnterminatedMultilineCommentTrivia(trivia: ISyntaxTrivia): Boolean = js.native
  def isUnterminatedStringLiteral(token: ISyntaxToken): Boolean = js.native
  def list(nodes: js.Array[ISyntaxNodeOrToken]): ISyntaxList = js.native
  def listStructuralEquals(list1: ISyntaxList, list2: ISyntaxList): Boolean = js.native
  def massageEscapes(text: String): String = js.native
  def multiLineComment(text: String): ISyntaxTrivia = js.native
  def nodeHasSkippedOrMissingTokens(node: SyntaxNode): Boolean = js.native
  def nodeOrTokenStructuralEquals(node1: ISyntaxNodeOrToken, node2: ISyntaxNodeOrToken): Boolean = js.native
  def nodeStructuralEquals(node1: SyntaxNode, node2: SyntaxNode): Boolean = js.native
  def numericLiteralExpression(text: String): IUnaryExpressionSyntax = js.native
  def realizeToken(token: ISyntaxToken): ISyntaxToken = js.native
  def separatedList(nodes: js.Array[ISyntaxNodeOrToken]): ISeparatedSyntaxList = js.native
  def separatedListStructuralEquals(list1: ISeparatedSyntaxList, list2: ISeparatedSyntaxList): Boolean = js.native
  def singleLineComment(text: String): ISyntaxTrivia = js.native
  def skippedTokenTrivia(token: ISyntaxToken): ISyntaxTrivia = js.native
  def spaces(count: Double): ISyntaxTrivia = js.native
  def splitMultiLineCommentTriviaIntoMultipleLines(trivia: ISyntaxTrivia): js.Array[String] = js.native
  def stringLiteralExpression(text: String): IUnaryExpressionSyntax = js.native
  def token(kind: SyntaxKind): ISyntaxToken = js.native
  def token(kind: SyntaxKind, info: ITokenInfo): ISyntaxToken = js.native
  def tokenStructuralEquals(token1: ISyntaxToken, token2: ISyntaxToken): Boolean = js.native
  def tokenToJSON(token: ISyntaxToken): js.Any = js.native
  def trivia(kind: SyntaxKind, text: String): ISyntaxTrivia = js.native
  def triviaList(trivia: js.Array[ISyntaxTrivia]): ISyntaxTriviaList = js.native
  def triviaListStructuralEquals(triviaList1: ISyntaxTriviaList, triviaList2: ISyntaxTriviaList): Boolean = js.native
  def triviaStructuralEquals(trivia1: ISyntaxTrivia, trivia2: ISyntaxTrivia): Boolean = js.native
  def trueExpression(): IUnaryExpressionSyntax = js.native
  def value(token: ISyntaxToken): js.Any = js.native
  def valueText(token: ISyntaxToken): String = js.native
  def whitespace(text: String): ISyntaxTrivia = js.native
}

