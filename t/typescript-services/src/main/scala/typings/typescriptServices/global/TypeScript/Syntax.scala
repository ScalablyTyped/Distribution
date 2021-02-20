package typings.typescriptServices.global.TypeScript

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
  
  @JSGlobal("TypeScript.Syntax")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("TypeScript.Syntax.EmptySyntaxList")
  @js.native
  class EmptySyntaxList ()
    extends typings.typescriptServices.TypeScript.Syntax.EmptySyntaxList
  
  @JSGlobal("TypeScript.Syntax.FixedWidthTokenWithLeadingAndTrailingTrivia")
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
  
  @JSGlobal("TypeScript.Syntax.FixedWidthTokenWithLeadingTrivia")
  @js.native
  class FixedWidthTokenWithLeadingTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithLeadingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double
    ) = this()
  }
  
  @JSGlobal("TypeScript.Syntax.FixedWidthTokenWithNoTrivia")
  @js.native
  class FixedWidthTokenWithNoTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithNoTrivia {
    def this(kind: typings.typescriptServices.TypeScript.SyntaxKind) = this()
  }
  
  @JSGlobal("TypeScript.Syntax.FixedWidthTokenWithTrailingTrivia")
  @js.native
  class FixedWidthTokenWithTrailingTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  @JSGlobal("TypeScript.Syntax.NormalModeFactory")
  @js.native
  class NormalModeFactory_ () extends NormalModeFactory
  
  @JSGlobal("TypeScript.Syntax.StrictModeFactory")
  @js.native
  class StrictModeFactory_ () extends StrictModeFactory
  
  @JSGlobal("TypeScript.Syntax.VariableWidthTokenWithLeadingAndTrailingTrivia")
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
  
  @JSGlobal("TypeScript.Syntax.VariableWidthTokenWithLeadingTrivia")
  @js.native
  class VariableWidthTokenWithLeadingTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithLeadingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double
    ) = this()
  }
  
  @JSGlobal("TypeScript.Syntax.VariableWidthTokenWithNoTrivia")
  @js.native
  class VariableWidthTokenWithNoTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithNoTrivia {
    def this(fullText: String, kind: typings.typescriptServices.TypeScript.SyntaxKind) = this()
  }
  
  @JSGlobal("TypeScript.Syntax.VariableWidthTokenWithTrailingTrivia")
  @js.native
  class VariableWidthTokenWithTrailingTrivia protected ()
    extends typings.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  @JSGlobal("TypeScript.Syntax.assignmentExpression")
  @js.native
  def assignmentExpression(left: IExpressionSyntax, token: ISyntaxToken, right: IExpressionSyntax): typings.typescriptServices.TypeScript.BinaryExpressionSyntax = js.native
  
  @JSGlobal("TypeScript.Syntax.carriageReturnLineFeedTrivia")
  @js.native
  def carriageReturnLineFeedTrivia: ISyntaxTrivia = js.native
  @scala.inline
  def carriageReturnLineFeedTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("carriageReturnLineFeedTrivia")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.Syntax.carriageReturnTrivia")
  @js.native
  def carriageReturnTrivia: ISyntaxTrivia = js.native
  @scala.inline
  def carriageReturnTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("carriageReturnTrivia")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.Syntax.childIndex")
  @js.native
  def childIndex(parent: ISyntaxElement, child: ISyntaxElement): Double = js.native
  
  @JSGlobal("TypeScript.Syntax.childOffset")
  @js.native
  def childOffset(parent: ISyntaxElement, child: ISyntaxElement): Double = js.native
  
  @JSGlobal("TypeScript.Syntax.childOffsetAt")
  @js.native
  def childOffsetAt(parent: ISyntaxElement, index: Double): Double = js.native
  
  @JSGlobal("TypeScript.Syntax.convertToIdentifierName")
  @js.native
  def convertToIdentifierName(token: ISyntaxToken): ISyntaxToken = js.native
  
  @JSGlobal("TypeScript.Syntax.deferredTrivia")
  @js.native
  def deferredTrivia(
    kind: typings.typescriptServices.TypeScript.SyntaxKind,
    text: ISimpleText,
    fullStart: Double,
    fullWidth: Double
  ): ISyntaxTrivia = js.native
  
  @JSGlobal("TypeScript.Syntax.elementStructuralEquals")
  @js.native
  def elementStructuralEquals(element1: ISyntaxElement, element2: ISyntaxElement): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.emptyList")
  @js.native
  def emptyList: ISyntaxList = js.native
  @scala.inline
  def emptyList_=(x: ISyntaxList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyList")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.Syntax.emptySeparatedList")
  @js.native
  def emptySeparatedList: ISeparatedSyntaxList = js.native
  @scala.inline
  def emptySeparatedList_=(x: ISeparatedSyntaxList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptySeparatedList")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.Syntax.emptySourceUnit")
  @js.native
  def emptySourceUnit(): typings.typescriptServices.TypeScript.SourceUnitSyntax = js.native
  
  @JSGlobal("TypeScript.Syntax.emptyToken")
  @js.native
  def emptyToken(kind: typings.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = js.native
  
  @JSGlobal("TypeScript.Syntax.emptyTriviaList")
  @js.native
  def emptyTriviaList: ISyntaxTriviaList = js.native
  @scala.inline
  def emptyTriviaList_=(x: ISyntaxTriviaList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyTriviaList")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.Syntax.falseExpression")
  @js.native
  def falseExpression(): IUnaryExpressionSyntax = js.native
  
  @JSGlobal("TypeScript.Syntax.findSkippedTokenInLeadingTriviaList")
  @js.native
  def findSkippedTokenInLeadingTriviaList(positionedToken: typings.typescriptServices.TypeScript.PositionedToken, position: Double): typings.typescriptServices.TypeScript.PositionedSkippedToken = js.native
  
  @JSGlobal("TypeScript.Syntax.findSkippedTokenInPositionedToken")
  @js.native
  def findSkippedTokenInPositionedToken(positionedToken: typings.typescriptServices.TypeScript.PositionedToken, position: Double): typings.typescriptServices.TypeScript.PositionedSkippedToken = js.native
  
  @JSGlobal("TypeScript.Syntax.findSkippedTokenInTrailingTriviaList")
  @js.native
  def findSkippedTokenInTrailingTriviaList(positionedToken: typings.typescriptServices.TypeScript.PositionedToken, position: Double): typings.typescriptServices.TypeScript.PositionedSkippedToken = js.native
  
  @JSGlobal("TypeScript.Syntax.findSkippedTokenOnLeft")
  @js.native
  def findSkippedTokenOnLeft(positionedToken: typings.typescriptServices.TypeScript.PositionedToken, position: Double): typings.typescriptServices.TypeScript.PositionedSkippedToken = js.native
  
  @JSGlobal("TypeScript.Syntax.getAncestorOfKind")
  @js.native
  def getAncestorOfKind(
    positionedToken: typings.typescriptServices.TypeScript.PositionedElement,
    kind: typings.typescriptServices.TypeScript.SyntaxKind
  ): typings.typescriptServices.TypeScript.PositionedElement = js.native
  
  @JSGlobal("TypeScript.Syntax.getStandaloneExpression")
  @js.native
  def getStandaloneExpression(positionedToken: typings.typescriptServices.TypeScript.PositionedToken): typings.typescriptServices.TypeScript.PositionedNodeOrToken = js.native
  
  @JSGlobal("TypeScript.Syntax.hasAncestorOfKind")
  @js.native
  def hasAncestorOfKind(
    positionedToken: typings.typescriptServices.TypeScript.PositionedElement,
    kind: typings.typescriptServices.TypeScript.SyntaxKind
  ): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.identifier")
  @js.native
  def identifier(text: String): ISyntaxToken = js.native
  @JSGlobal("TypeScript.Syntax.identifier")
  @js.native
  def identifier(text: String, info: ITokenInfo): ISyntaxToken = js.native
  
  @JSGlobal("TypeScript.Syntax.identifierName")
  @js.native
  def identifierName(text: String): ISyntaxToken = js.native
  @JSGlobal("TypeScript.Syntax.identifierName")
  @js.native
  def identifierName(text: String, info: ITokenInfo): ISyntaxToken = js.native
  
  @JSGlobal("TypeScript.Syntax.isEntirelyInStringOrRegularExpressionLiteral")
  @js.native
  def isEntirelyInStringOrRegularExpressionLiteral(sourceUnit: typings.typescriptServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.isEntirelyInsideComment")
  @js.native
  def isEntirelyInsideComment(sourceUnit: typings.typescriptServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.isEntirelyInsideCommentTrivia")
  @js.native
  def isEntirelyInsideCommentTrivia(trivia: ISyntaxTrivia, fullStart: Double, position: Double): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.isExpression")
  @js.native
  def isExpression(token: ISyntaxToken): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.isInModuleOrTypeContext")
  @js.native
  def isInModuleOrTypeContext(positionedToken: typings.typescriptServices.TypeScript.PositionedToken): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.isInTypeOnlyContext")
  @js.native
  def isInTypeOnlyContext(positionedToken: typings.typescriptServices.TypeScript.PositionedToken): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.isIntegerLiteral")
  @js.native
  def isIntegerLiteral(expression: IExpressionSyntax): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.isSuperInvocationExpression")
  @js.native
  def isSuperInvocationExpression(node: IExpressionSyntax): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.isSuperInvocationExpressionStatement")
  @js.native
  def isSuperInvocationExpressionStatement(node: typings.typescriptServices.TypeScript.SyntaxNode): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.isSuperMemberAccessExpression")
  @js.native
  def isSuperMemberAccessExpression(node: IExpressionSyntax): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.isSuperMemberAccessInvocationExpression")
  @js.native
  def isSuperMemberAccessInvocationExpression(node: typings.typescriptServices.TypeScript.SyntaxNode): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.isUnterminatedMultilineCommentTrivia")
  @js.native
  def isUnterminatedMultilineCommentTrivia(trivia: ISyntaxTrivia): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.isUnterminatedStringLiteral")
  @js.native
  def isUnterminatedStringLiteral(token: ISyntaxToken): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.lineFeedTrivia")
  @js.native
  def lineFeedTrivia: ISyntaxTrivia = js.native
  @scala.inline
  def lineFeedTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineFeedTrivia")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.Syntax.list")
  @js.native
  def list(nodes: js.Array[ISyntaxNodeOrToken]): ISyntaxList = js.native
  
  @JSGlobal("TypeScript.Syntax.listStructuralEquals")
  @js.native
  def listStructuralEquals(list1: ISyntaxList, list2: ISyntaxList): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.massageEscapes")
  @js.native
  def massageEscapes(text: String): String = js.native
  
  @JSGlobal("TypeScript.Syntax.multiLineComment")
  @js.native
  def multiLineComment(text: String): ISyntaxTrivia = js.native
  
  @JSGlobal("TypeScript.Syntax.nodeHasSkippedOrMissingTokens")
  @js.native
  def nodeHasSkippedOrMissingTokens(node: typings.typescriptServices.TypeScript.SyntaxNode): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.nodeOrTokenStructuralEquals")
  @js.native
  def nodeOrTokenStructuralEquals(node1: ISyntaxNodeOrToken, node2: ISyntaxNodeOrToken): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.nodeStructuralEquals")
  @js.native
  def nodeStructuralEquals(
    node1: typings.typescriptServices.TypeScript.SyntaxNode,
    node2: typings.typescriptServices.TypeScript.SyntaxNode
  ): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.normalModeFactory")
  @js.native
  def normalModeFactory: IFactory = js.native
  @scala.inline
  def normalModeFactory_=(x: IFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalModeFactory")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.Syntax.numericLiteralExpression")
  @js.native
  def numericLiteralExpression(text: String): IUnaryExpressionSyntax = js.native
  
  @JSGlobal("TypeScript.Syntax.realizeToken")
  @js.native
  def realizeToken(token: ISyntaxToken): ISyntaxToken = js.native
  
  @JSGlobal("TypeScript.Syntax.separatedList")
  @js.native
  def separatedList(nodes: js.Array[ISyntaxNodeOrToken]): ISeparatedSyntaxList = js.native
  
  @JSGlobal("TypeScript.Syntax.separatedListStructuralEquals")
  @js.native
  def separatedListStructuralEquals(list1: ISeparatedSyntaxList, list2: ISeparatedSyntaxList): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.singleLineComment")
  @js.native
  def singleLineComment(text: String): ISyntaxTrivia = js.native
  
  @JSGlobal("TypeScript.Syntax.skippedTokenTrivia")
  @js.native
  def skippedTokenTrivia(token: ISyntaxToken): ISyntaxTrivia = js.native
  
  @JSGlobal("TypeScript.Syntax.spaceTrivia")
  @js.native
  def spaceTrivia: ISyntaxTrivia = js.native
  
  @JSGlobal("TypeScript.Syntax.spaceTriviaList")
  @js.native
  def spaceTriviaList: ISyntaxTriviaList = js.native
  @scala.inline
  def spaceTriviaList_=(x: ISyntaxTriviaList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spaceTriviaList")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def spaceTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spaceTrivia")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.Syntax.spaces")
  @js.native
  def spaces(count: Double): ISyntaxTrivia = js.native
  
  @JSGlobal("TypeScript.Syntax.splitMultiLineCommentTriviaIntoMultipleLines")
  @js.native
  def splitMultiLineCommentTriviaIntoMultipleLines(trivia: ISyntaxTrivia): js.Array[String] = js.native
  
  @JSGlobal("TypeScript.Syntax.strictModeFactory")
  @js.native
  def strictModeFactory: IFactory = js.native
  @scala.inline
  def strictModeFactory_=(x: IFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strictModeFactory")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.Syntax.stringLiteralExpression")
  @js.native
  def stringLiteralExpression(text: String): IUnaryExpressionSyntax = js.native
  
  @JSGlobal("TypeScript.Syntax.token")
  @js.native
  def token(kind: typings.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = js.native
  @JSGlobal("TypeScript.Syntax.token")
  @js.native
  def token(kind: typings.typescriptServices.TypeScript.SyntaxKind, info: ITokenInfo): ISyntaxToken = js.native
  
  @JSGlobal("TypeScript.Syntax.tokenStructuralEquals")
  @js.native
  def tokenStructuralEquals(token1: ISyntaxToken, token2: ISyntaxToken): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.tokenToJSON")
  @js.native
  def tokenToJSON(token: ISyntaxToken): js.Any = js.native
  
  @JSGlobal("TypeScript.Syntax.trivia")
  @js.native
  def trivia(kind: typings.typescriptServices.TypeScript.SyntaxKind, text: String): ISyntaxTrivia = js.native
  
  @JSGlobal("TypeScript.Syntax.triviaList")
  @js.native
  def triviaList(trivia: js.Array[ISyntaxTrivia]): ISyntaxTriviaList = js.native
  
  @JSGlobal("TypeScript.Syntax.triviaListStructuralEquals")
  @js.native
  def triviaListStructuralEquals(triviaList1: ISyntaxTriviaList, triviaList2: ISyntaxTriviaList): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.triviaStructuralEquals")
  @js.native
  def triviaStructuralEquals(trivia1: ISyntaxTrivia, trivia2: ISyntaxTrivia): Boolean = js.native
  
  @JSGlobal("TypeScript.Syntax.trueExpression")
  @js.native
  def trueExpression(): IUnaryExpressionSyntax = js.native
  
  @JSGlobal("TypeScript.Syntax.value")
  @js.native
  def value(token: ISyntaxToken): js.Any = js.native
  
  @JSGlobal("TypeScript.Syntax.valueText")
  @js.native
  def valueText(token: ISyntaxToken): String = js.native
  
  @JSGlobal("TypeScript.Syntax.whitespace")
  @js.native
  def whitespace(text: String): ISyntaxTrivia = js.native
}
