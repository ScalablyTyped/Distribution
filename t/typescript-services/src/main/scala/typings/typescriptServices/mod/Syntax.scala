package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISimpleText
import typings.typescriptServices.TypeScript.ISyntaxElement
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTrivia
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import typings.typescriptServices.TypeScript.ITokenInfo
import typings.typescriptServices.TypeScript.IUnaryExpressionSyntax
import typings.typescriptServices.TypeScript.Syntax.IFactory
import typings.typescriptServices.TypeScript.Syntax.NormalModeFactory
import typings.typescriptServices.TypeScript.Syntax.StrictModeFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Syntax {
  
  @JSImport("typescript-services", "Syntax")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typescript-services", "Syntax.EmptySyntaxList")
  @js.native
  class EmptySyntaxList ()
    extends typings.typescriptServices.TypeScript.Syntax.EmptySyntaxList
  
  @JSImport("typescript-services", "Syntax.FixedWidthTokenWithLeadingAndTrailingTrivia")
  @js.native
  class FixedWidthTokenWithLeadingAndTrailingTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithLeadingAndTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  @JSImport("typescript-services", "Syntax.FixedWidthTokenWithLeadingTrivia")
  @js.native
  class FixedWidthTokenWithLeadingTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithLeadingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double
    ) = this()
  }
  
  @JSImport("typescript-services", "Syntax.FixedWidthTokenWithNoTrivia")
  @js.native
  class FixedWidthTokenWithNoTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithNoTrivia {
    def this(kind: typings.typescriptServices.TypeScript.SyntaxKind) = this()
  }
  
  @JSImport("typescript-services", "Syntax.FixedWidthTokenWithTrailingTrivia")
  @js.native
  class FixedWidthTokenWithTrailingTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  @JSImport("typescript-services", "Syntax.NormalModeFactory")
  @js.native
  class NormalModeFactory_ () extends NormalModeFactory
  
  @JSImport("typescript-services", "Syntax.StrictModeFactory")
  @js.native
  class StrictModeFactory_ () extends StrictModeFactory
  
  @JSImport("typescript-services", "Syntax.VariableWidthTokenWithLeadingAndTrailingTrivia")
  @js.native
  class VariableWidthTokenWithLeadingAndTrailingTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithLeadingAndTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  @JSImport("typescript-services", "Syntax.VariableWidthTokenWithLeadingTrivia")
  @js.native
  class VariableWidthTokenWithLeadingTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithLeadingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double
    ) = this()
  }
  
  @JSImport("typescript-services", "Syntax.VariableWidthTokenWithNoTrivia")
  @js.native
  class VariableWidthTokenWithNoTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithNoTrivia {
    def this(fullText: String, kind: typings.typescriptServices.TypeScript.SyntaxKind) = this()
  }
  
  @JSImport("typescript-services", "Syntax.VariableWidthTokenWithTrailingTrivia")
  @js.native
  class VariableWidthTokenWithTrailingTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  @JSImport("typescript-services", "Syntax.assignmentExpression")
  @js.native
  def assignmentExpression(left: IExpressionSyntax, token: ISyntaxToken, right: IExpressionSyntax): typings.typescriptServices.TypeScript.BinaryExpressionSyntax = js.native
  
  @JSImport("typescript-services", "Syntax.carriageReturnLineFeedTrivia")
  @js.native
  def carriageReturnLineFeedTrivia: ISyntaxTrivia = js.native
  @scala.inline
  def carriageReturnLineFeedTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("carriageReturnLineFeedTrivia")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Syntax.carriageReturnTrivia")
  @js.native
  def carriageReturnTrivia: ISyntaxTrivia = js.native
  @scala.inline
  def carriageReturnTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("carriageReturnTrivia")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Syntax.childIndex")
  @js.native
  def childIndex(parent: ISyntaxElement, child: ISyntaxElement): Double = js.native
  
  @JSImport("typescript-services", "Syntax.childOffset")
  @js.native
  def childOffset(parent: ISyntaxElement, child: ISyntaxElement): Double = js.native
  
  @JSImport("typescript-services", "Syntax.childOffsetAt")
  @js.native
  def childOffsetAt(parent: ISyntaxElement, index: Double): Double = js.native
  
  @JSImport("typescript-services", "Syntax.convertToIdentifierName")
  @js.native
  def convertToIdentifierName(token: ISyntaxToken): ISyntaxToken = js.native
  
  @JSImport("typescript-services", "Syntax.deferredTrivia")
  @js.native
  def deferredTrivia(
    kind: typings.typescriptServices.TypeScript.SyntaxKind,
    text: ISimpleText,
    fullStart: Double,
    fullWidth: Double
  ): ISyntaxTrivia = js.native
  
  @JSImport("typescript-services", "Syntax.elementStructuralEquals")
  @js.native
  def elementStructuralEquals(element1: ISyntaxElement, element2: ISyntaxElement): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.emptyList")
  @js.native
  def emptyList: ISyntaxList = js.native
  @scala.inline
  def emptyList_=(x: ISyntaxList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyList")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Syntax.emptySeparatedList")
  @js.native
  def emptySeparatedList: ISeparatedSyntaxList = js.native
  @scala.inline
  def emptySeparatedList_=(x: ISeparatedSyntaxList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptySeparatedList")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Syntax.emptySourceUnit")
  @js.native
  def emptySourceUnit(): typings.typescriptServices.TypeScript.SourceUnitSyntax = js.native
  
  @JSImport("typescript-services", "Syntax.emptyToken")
  @js.native
  def emptyToken(kind: typings.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = js.native
  
  @JSImport("typescript-services", "Syntax.emptyTriviaList")
  @js.native
  def emptyTriviaList: ISyntaxTriviaList = js.native
  @scala.inline
  def emptyTriviaList_=(x: ISyntaxTriviaList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyTriviaList")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Syntax.falseExpression")
  @js.native
  def falseExpression(): IUnaryExpressionSyntax = js.native
  
  @JSImport("typescript-services", "Syntax.findSkippedTokenInLeadingTriviaList")
  @js.native
  def findSkippedTokenInLeadingTriviaList(positionedToken: typings.typescriptServices.TypeScript.PositionedToken, position: Double): typings.typescriptServices.TypeScript.PositionedSkippedToken = js.native
  
  @JSImport("typescript-services", "Syntax.findSkippedTokenInPositionedToken")
  @js.native
  def findSkippedTokenInPositionedToken(positionedToken: typings.typescriptServices.TypeScript.PositionedToken, position: Double): typings.typescriptServices.TypeScript.PositionedSkippedToken = js.native
  
  @JSImport("typescript-services", "Syntax.findSkippedTokenInTrailingTriviaList")
  @js.native
  def findSkippedTokenInTrailingTriviaList(positionedToken: typings.typescriptServices.TypeScript.PositionedToken, position: Double): typings.typescriptServices.TypeScript.PositionedSkippedToken = js.native
  
  @JSImport("typescript-services", "Syntax.findSkippedTokenOnLeft")
  @js.native
  def findSkippedTokenOnLeft(positionedToken: typings.typescriptServices.TypeScript.PositionedToken, position: Double): typings.typescriptServices.TypeScript.PositionedSkippedToken = js.native
  
  @JSImport("typescript-services", "Syntax.getAncestorOfKind")
  @js.native
  def getAncestorOfKind(
    positionedToken: typings.typescriptServices.TypeScript.PositionedElement,
    kind: typings.typescriptServices.TypeScript.SyntaxKind
  ): typings.typescriptServices.TypeScript.PositionedElement = js.native
  
  @JSImport("typescript-services", "Syntax.getStandaloneExpression")
  @js.native
  def getStandaloneExpression(positionedToken: typings.typescriptServices.TypeScript.PositionedToken): typings.typescriptServices.TypeScript.PositionedNodeOrToken = js.native
  
  @JSImport("typescript-services", "Syntax.hasAncestorOfKind")
  @js.native
  def hasAncestorOfKind(
    positionedToken: typings.typescriptServices.TypeScript.PositionedElement,
    kind: typings.typescriptServices.TypeScript.SyntaxKind
  ): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.identifier")
  @js.native
  def identifier(text: String): ISyntaxToken = js.native
  @JSImport("typescript-services", "Syntax.identifier")
  @js.native
  def identifier(text: String, info: ITokenInfo): ISyntaxToken = js.native
  
  @JSImport("typescript-services", "Syntax.identifierName")
  @js.native
  def identifierName(text: String): ISyntaxToken = js.native
  @JSImport("typescript-services", "Syntax.identifierName")
  @js.native
  def identifierName(text: String, info: ITokenInfo): ISyntaxToken = js.native
  
  @JSImport("typescript-services", "Syntax.isEntirelyInStringOrRegularExpressionLiteral")
  @js.native
  def isEntirelyInStringOrRegularExpressionLiteral(sourceUnit: typings.typescriptServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.isEntirelyInsideComment")
  @js.native
  def isEntirelyInsideComment(sourceUnit: typings.typescriptServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.isEntirelyInsideCommentTrivia")
  @js.native
  def isEntirelyInsideCommentTrivia(trivia: ISyntaxTrivia, fullStart: Double, position: Double): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.isExpression")
  @js.native
  def isExpression(token: ISyntaxToken): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.isInModuleOrTypeContext")
  @js.native
  def isInModuleOrTypeContext(positionedToken: typings.typescriptServices.TypeScript.PositionedToken): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.isInTypeOnlyContext")
  @js.native
  def isInTypeOnlyContext(positionedToken: typings.typescriptServices.TypeScript.PositionedToken): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.isIntegerLiteral")
  @js.native
  def isIntegerLiteral(expression: IExpressionSyntax): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.isSuperInvocationExpression")
  @js.native
  def isSuperInvocationExpression(node: IExpressionSyntax): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.isSuperInvocationExpressionStatement")
  @js.native
  def isSuperInvocationExpressionStatement(node: typings.typescriptServices.TypeScript.SyntaxNode): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.isSuperMemberAccessExpression")
  @js.native
  def isSuperMemberAccessExpression(node: IExpressionSyntax): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.isSuperMemberAccessInvocationExpression")
  @js.native
  def isSuperMemberAccessInvocationExpression(node: typings.typescriptServices.TypeScript.SyntaxNode): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.isUnterminatedMultilineCommentTrivia")
  @js.native
  def isUnterminatedMultilineCommentTrivia(trivia: ISyntaxTrivia): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.isUnterminatedStringLiteral")
  @js.native
  def isUnterminatedStringLiteral(token: ISyntaxToken): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.lineFeedTrivia")
  @js.native
  def lineFeedTrivia: ISyntaxTrivia = js.native
  @scala.inline
  def lineFeedTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineFeedTrivia")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Syntax.list")
  @js.native
  def list(nodes: js.Array[ISyntaxNodeOrToken]): ISyntaxList = js.native
  
  @JSImport("typescript-services", "Syntax.listStructuralEquals")
  @js.native
  def listStructuralEquals(list1: ISyntaxList, list2: ISyntaxList): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.massageEscapes")
  @js.native
  def massageEscapes(text: String): String = js.native
  
  @JSImport("typescript-services", "Syntax.multiLineComment")
  @js.native
  def multiLineComment(text: String): ISyntaxTrivia = js.native
  
  @JSImport("typescript-services", "Syntax.nodeHasSkippedOrMissingTokens")
  @js.native
  def nodeHasSkippedOrMissingTokens(node: typings.typescriptServices.TypeScript.SyntaxNode): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.nodeOrTokenStructuralEquals")
  @js.native
  def nodeOrTokenStructuralEquals(node1: ISyntaxNodeOrToken, node2: ISyntaxNodeOrToken): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.nodeStructuralEquals")
  @js.native
  def nodeStructuralEquals(
    node1: typings.typescriptServices.TypeScript.SyntaxNode,
    node2: typings.typescriptServices.TypeScript.SyntaxNode
  ): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.normalModeFactory")
  @js.native
  def normalModeFactory: IFactory = js.native
  @scala.inline
  def normalModeFactory_=(x: IFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalModeFactory")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Syntax.numericLiteralExpression")
  @js.native
  def numericLiteralExpression(text: String): IUnaryExpressionSyntax = js.native
  
  @JSImport("typescript-services", "Syntax.realizeToken")
  @js.native
  def realizeToken(token: ISyntaxToken): ISyntaxToken = js.native
  
  @JSImport("typescript-services", "Syntax.separatedList")
  @js.native
  def separatedList(nodes: js.Array[ISyntaxNodeOrToken]): ISeparatedSyntaxList = js.native
  
  @JSImport("typescript-services", "Syntax.separatedListStructuralEquals")
  @js.native
  def separatedListStructuralEquals(list1: ISeparatedSyntaxList, list2: ISeparatedSyntaxList): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.singleLineComment")
  @js.native
  def singleLineComment(text: String): ISyntaxTrivia = js.native
  
  @JSImport("typescript-services", "Syntax.skippedTokenTrivia")
  @js.native
  def skippedTokenTrivia(token: ISyntaxToken): ISyntaxTrivia = js.native
  
  @JSImport("typescript-services", "Syntax.spaceTrivia")
  @js.native
  def spaceTrivia: ISyntaxTrivia = js.native
  
  @JSImport("typescript-services", "Syntax.spaceTriviaList")
  @js.native
  def spaceTriviaList: ISyntaxTriviaList = js.native
  @scala.inline
  def spaceTriviaList_=(x: ISyntaxTriviaList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spaceTriviaList")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def spaceTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spaceTrivia")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Syntax.spaces")
  @js.native
  def spaces(count: Double): ISyntaxTrivia = js.native
  
  @JSImport("typescript-services", "Syntax.splitMultiLineCommentTriviaIntoMultipleLines")
  @js.native
  def splitMultiLineCommentTriviaIntoMultipleLines(trivia: ISyntaxTrivia): js.Array[String] = js.native
  
  @JSImport("typescript-services", "Syntax.strictModeFactory")
  @js.native
  def strictModeFactory: IFactory = js.native
  @scala.inline
  def strictModeFactory_=(x: IFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strictModeFactory")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Syntax.stringLiteralExpression")
  @js.native
  def stringLiteralExpression(text: String): IUnaryExpressionSyntax = js.native
  
  @JSImport("typescript-services", "Syntax.token")
  @js.native
  def token(kind: typings.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = js.native
  @JSImport("typescript-services", "Syntax.token")
  @js.native
  def token(kind: typings.typescriptServices.TypeScript.SyntaxKind, info: ITokenInfo): ISyntaxToken = js.native
  
  @JSImport("typescript-services", "Syntax.tokenStructuralEquals")
  @js.native
  def tokenStructuralEquals(token1: ISyntaxToken, token2: ISyntaxToken): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.tokenToJSON")
  @js.native
  def tokenToJSON(token: ISyntaxToken): js.Any = js.native
  
  @JSImport("typescript-services", "Syntax.trivia")
  @js.native
  def trivia(kind: typings.typescriptServices.TypeScript.SyntaxKind, text: String): ISyntaxTrivia = js.native
  
  @JSImport("typescript-services", "Syntax.triviaList")
  @js.native
  def triviaList(trivia: js.Array[ISyntaxTrivia]): ISyntaxTriviaList = js.native
  
  @JSImport("typescript-services", "Syntax.triviaListStructuralEquals")
  @js.native
  def triviaListStructuralEquals(triviaList1: ISyntaxTriviaList, triviaList2: ISyntaxTriviaList): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.triviaStructuralEquals")
  @js.native
  def triviaStructuralEquals(trivia1: ISyntaxTrivia, trivia2: ISyntaxTrivia): Boolean = js.native
  
  @JSImport("typescript-services", "Syntax.trueExpression")
  @js.native
  def trueExpression(): IUnaryExpressionSyntax = js.native
  
  @JSImport("typescript-services", "Syntax.value")
  @js.native
  def value(token: ISyntaxToken): js.Any = js.native
  
  @JSImport("typescript-services", "Syntax.valueText")
  @js.native
  def valueText(token: ISyntaxToken): String = js.native
  
  @JSImport("typescript-services", "Syntax.whitespace")
  @js.native
  def whitespace(text: String): ISyntaxTrivia = js.native
}
