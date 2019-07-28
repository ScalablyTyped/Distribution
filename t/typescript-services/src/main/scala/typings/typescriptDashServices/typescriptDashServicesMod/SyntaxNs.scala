package typings.typescriptDashServices.typescriptDashServicesMod

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
import typings.typescriptDashServices.TypeScriptNs.SyntaxNs.IFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Syntax")
@js.native
object SyntaxNs extends js.Object {
  @js.native
  class EmptySyntaxList ()
    extends typings.typescriptDashServices.TypeScriptNs.SyntaxNs.EmptySyntaxList
  
  @js.native
  class FixedWidthTokenWithLeadingAndTrailingTrivia protected ()
    extends typings.typescriptDashServices.TypeScriptNs.SyntaxNs.FixedWidthTokenWithLeadingAndTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
      leadingTriviaInfo: Double,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  @js.native
  class FixedWidthTokenWithLeadingTrivia protected ()
    extends typings.typescriptDashServices.TypeScriptNs.SyntaxNs.FixedWidthTokenWithLeadingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
      leadingTriviaInfo: Double
    ) = this()
  }
  
  @js.native
  class FixedWidthTokenWithNoTrivia protected ()
    extends typings.typescriptDashServices.TypeScriptNs.SyntaxNs.FixedWidthTokenWithNoTrivia {
    def this(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind) = this()
  }
  
  @js.native
  class FixedWidthTokenWithTrailingTrivia protected ()
    extends typings.typescriptDashServices.TypeScriptNs.SyntaxNs.FixedWidthTokenWithTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  @js.native
  class NormalModeFactory ()
    extends typings.typescriptDashServices.TypeScriptNs.SyntaxNs.NormalModeFactory
  
  @js.native
  class StrictModeFactory ()
    extends typings.typescriptDashServices.TypeScriptNs.SyntaxNs.StrictModeFactory
  
  @js.native
  class VariableWidthTokenWithLeadingAndTrailingTrivia protected ()
    extends typings.typescriptDashServices.TypeScriptNs.SyntaxNs.VariableWidthTokenWithLeadingAndTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
      leadingTriviaInfo: Double,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  @js.native
  class VariableWidthTokenWithLeadingTrivia protected ()
    extends typings.typescriptDashServices.TypeScriptNs.SyntaxNs.VariableWidthTokenWithLeadingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
      leadingTriviaInfo: Double
    ) = this()
  }
  
  @js.native
  class VariableWidthTokenWithNoTrivia protected ()
    extends typings.typescriptDashServices.TypeScriptNs.SyntaxNs.VariableWidthTokenWithNoTrivia {
    def this(fullText: String, kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind) = this()
  }
  
  @js.native
  class VariableWidthTokenWithTrailingTrivia protected ()
    extends typings.typescriptDashServices.TypeScriptNs.SyntaxNs.VariableWidthTokenWithTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
      trailingTriviaInfo: Double
    ) = this()
  }
  
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
  def assignmentExpression(left: IExpressionSyntax, token: ISyntaxToken, right: IExpressionSyntax): typings.typescriptDashServices.TypeScriptNs.BinaryExpressionSyntax = js.native
  def childIndex(parent: ISyntaxElement, child: ISyntaxElement): Double = js.native
  def childOffset(parent: ISyntaxElement, child: ISyntaxElement): Double = js.native
  def childOffsetAt(parent: ISyntaxElement, index: Double): Double = js.native
  def convertToIdentifierName(token: ISyntaxToken): ISyntaxToken = js.native
  def deferredTrivia(
    kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
    text: ISimpleText,
    fullStart: Double,
    fullWidth: Double
  ): ISyntaxTrivia = js.native
  def elementStructuralEquals(element1: ISyntaxElement, element2: ISyntaxElement): Boolean = js.native
  def emptySourceUnit(): typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax = js.native
  def emptyToken(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): ISyntaxToken = js.native
  def falseExpression(): IUnaryExpressionSyntax = js.native
  def findSkippedTokenInLeadingTriviaList(positionedToken: typings.typescriptDashServices.TypeScriptNs.PositionedToken, position: Double): typings.typescriptDashServices.TypeScriptNs.PositionedSkippedToken = js.native
  def findSkippedTokenInPositionedToken(positionedToken: typings.typescriptDashServices.TypeScriptNs.PositionedToken, position: Double): typings.typescriptDashServices.TypeScriptNs.PositionedSkippedToken = js.native
  def findSkippedTokenInTrailingTriviaList(positionedToken: typings.typescriptDashServices.TypeScriptNs.PositionedToken, position: Double): typings.typescriptDashServices.TypeScriptNs.PositionedSkippedToken = js.native
  def findSkippedTokenOnLeft(positionedToken: typings.typescriptDashServices.TypeScriptNs.PositionedToken, position: Double): typings.typescriptDashServices.TypeScriptNs.PositionedSkippedToken = js.native
  def getAncestorOfKind(
    positionedToken: typings.typescriptDashServices.TypeScriptNs.PositionedElement,
    kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind
  ): typings.typescriptDashServices.TypeScriptNs.PositionedElement = js.native
  def getStandaloneExpression(positionedToken: typings.typescriptDashServices.TypeScriptNs.PositionedToken): typings.typescriptDashServices.TypeScriptNs.PositionedNodeOrToken = js.native
  def hasAncestorOfKind(
    positionedToken: typings.typescriptDashServices.TypeScriptNs.PositionedElement,
    kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind
  ): Boolean = js.native
  def identifier(text: String): ISyntaxToken = js.native
  def identifier(text: String, info: ITokenInfo): ISyntaxToken = js.native
  def identifierName(text: String): ISyntaxToken = js.native
  def identifierName(text: String, info: ITokenInfo): ISyntaxToken = js.native
  def isEntirelyInStringOrRegularExpressionLiteral(sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax, position: Double): Boolean = js.native
  def isEntirelyInsideComment(sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax, position: Double): Boolean = js.native
  def isEntirelyInsideCommentTrivia(trivia: ISyntaxTrivia, fullStart: Double, position: Double): Boolean = js.native
  def isExpression(token: ISyntaxToken): Boolean = js.native
  def isInModuleOrTypeContext(positionedToken: typings.typescriptDashServices.TypeScriptNs.PositionedToken): Boolean = js.native
  def isInTypeOnlyContext(positionedToken: typings.typescriptDashServices.TypeScriptNs.PositionedToken): Boolean = js.native
  def isIntegerLiteral(expression: IExpressionSyntax): Boolean = js.native
  def isSuperInvocationExpression(node: IExpressionSyntax): Boolean = js.native
  def isSuperInvocationExpressionStatement(node: typings.typescriptDashServices.TypeScriptNs.SyntaxNode): Boolean = js.native
  def isSuperMemberAccessExpression(node: IExpressionSyntax): Boolean = js.native
  def isSuperMemberAccessInvocationExpression(node: typings.typescriptDashServices.TypeScriptNs.SyntaxNode): Boolean = js.native
  def isUnterminatedMultilineCommentTrivia(trivia: ISyntaxTrivia): Boolean = js.native
  def isUnterminatedStringLiteral(token: ISyntaxToken): Boolean = js.native
  def list(nodes: js.Array[ISyntaxNodeOrToken]): ISyntaxList = js.native
  def listStructuralEquals(list1: ISyntaxList, list2: ISyntaxList): Boolean = js.native
  def massageEscapes(text: String): String = js.native
  def multiLineComment(text: String): ISyntaxTrivia = js.native
  def nodeHasSkippedOrMissingTokens(node: typings.typescriptDashServices.TypeScriptNs.SyntaxNode): Boolean = js.native
  def nodeOrTokenStructuralEquals(node1: ISyntaxNodeOrToken, node2: ISyntaxNodeOrToken): Boolean = js.native
  def nodeStructuralEquals(
    node1: typings.typescriptDashServices.TypeScriptNs.SyntaxNode,
    node2: typings.typescriptDashServices.TypeScriptNs.SyntaxNode
  ): Boolean = js.native
  def numericLiteralExpression(text: String): IUnaryExpressionSyntax = js.native
  def realizeToken(token: ISyntaxToken): ISyntaxToken = js.native
  def separatedList(nodes: js.Array[ISyntaxNodeOrToken]): ISeparatedSyntaxList = js.native
  def separatedListStructuralEquals(list1: ISeparatedSyntaxList, list2: ISeparatedSyntaxList): Boolean = js.native
  def singleLineComment(text: String): ISyntaxTrivia = js.native
  def skippedTokenTrivia(token: ISyntaxToken): ISyntaxTrivia = js.native
  def spaces(count: Double): ISyntaxTrivia = js.native
  def splitMultiLineCommentTriviaIntoMultipleLines(trivia: ISyntaxTrivia): js.Array[String] = js.native
  def stringLiteralExpression(text: String): IUnaryExpressionSyntax = js.native
  def token(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): ISyntaxToken = js.native
  def token(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind, info: ITokenInfo): ISyntaxToken = js.native
  def tokenStructuralEquals(token1: ISyntaxToken, token2: ISyntaxToken): Boolean = js.native
  def tokenToJSON(token: ISyntaxToken): js.Any = js.native
  def trivia(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind, text: String): ISyntaxTrivia = js.native
  def triviaList(trivia: js.Array[ISyntaxTrivia]): ISyntaxTriviaList = js.native
  def triviaListStructuralEquals(triviaList1: ISyntaxTriviaList, triviaList2: ISyntaxTriviaList): Boolean = js.native
  def triviaStructuralEquals(trivia1: ISyntaxTrivia, trivia2: ISyntaxTrivia): Boolean = js.native
  def trueExpression(): IUnaryExpressionSyntax = js.native
  def value(token: ISyntaxToken): js.Any = js.native
  def valueText(token: ISyntaxToken): String = js.native
  def whitespace(text: String): ISyntaxTrivia = js.native
}

