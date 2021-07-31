package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.IMemberExpressionSyntax
import typings.typescriptServices.TypeScript.IModuleReferenceSyntax
import typings.typescriptServices.TypeScript.INameSyntax
import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISimpleText
import typings.typescriptServices.TypeScript.IStatementSyntax
import typings.typescriptServices.TypeScript.ISyntaxElement
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTrivia
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import typings.typescriptServices.TypeScript.ISyntaxVisitor
import typings.typescriptServices.TypeScript.ITokenInfo
import typings.typescriptServices.TypeScript.ITypeSyntax
import typings.typescriptServices.TypeScript.IUnaryExpressionSyntax
import typings.typescriptServices.TypeScript.Syntax.IFactory
import typings.typescriptServices.TypeScript.Syntax.NormalModeFactory
import typings.typescriptServices.TypeScript.Syntax.StrictModeFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Syntax {
  
  @JSImport("typescript-services", "Syntax")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typescript-services", "Syntax.EmptySyntaxList")
  @js.native
  class EmptySyntaxList ()
    extends StObject
       with typings.typescriptServices.TypeScript.Syntax.EmptySyntaxList {
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def findTokenInternal(
      parent: typings.typescriptServices.TypeScript.PositionedElement,
      position: Double,
      fullStart: Double
    ): typings.typescriptServices.TypeScript.PositionedToken = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def insertChildrenInto(array: js.Array[ISyntaxElement], index: Double): Unit = js.native
    
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
    override def toArray(): js.Array[ISyntaxNodeOrToken] = js.native
    
    /* CompleteClass */
    override def toJSON(key: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
  }
  
  @JSImport("typescript-services", "Syntax.FixedWidthTokenWithLeadingAndTrailingTrivia")
  @js.native
  class FixedWidthTokenWithLeadingAndTrailingTrivia protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithLeadingAndTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double,
      trailingTriviaInfo: Double
    ) = this()
    
    /* CompleteClass */
    var _fullText: js.Any = js.native
    
    /* CompleteClass */
    var _leadingTriviaInfo: js.Any = js.native
    
    /* CompleteClass */
    var _trailingTriviaInfo: js.Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): js.Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    /* private */ override def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
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
    /* private */ override def realize(): js.Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: js.Any): js.Any = js.native
    
    /* CompleteClass */
    var tokenKind: typings.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): js.Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.FixedWidthTokenWithLeadingTrivia")
  @js.native
  class FixedWidthTokenWithLeadingTrivia protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithLeadingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double
    ) = this()
    
    /* CompleteClass */
    var _fullText: js.Any = js.native
    
    /* CompleteClass */
    var _leadingTriviaInfo: js.Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): js.Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    /* private */ override def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
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
    /* private */ override def realize(): js.Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: js.Any): js.Any = js.native
    
    /* CompleteClass */
    var tokenKind: typings.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): js.Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.FixedWidthTokenWithNoTrivia")
  @js.native
  class FixedWidthTokenWithNoTrivia protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithNoTrivia {
    def this(kind: typings.typescriptServices.TypeScript.SyntaxKind) = this()
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): js.Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    /* private */ override def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
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
    /* private */ override def realize(): js.Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: js.Any): js.Any = js.native
    
    /* CompleteClass */
    var tokenKind: typings.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): js.Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.FixedWidthTokenWithTrailingTrivia")
  @js.native
  class FixedWidthTokenWithTrailingTrivia protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      trailingTriviaInfo: Double
    ) = this()
    
    /* CompleteClass */
    var _fullText: js.Any = js.native
    
    /* CompleteClass */
    var _trailingTriviaInfo: js.Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): js.Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    /* private */ override def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
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
    /* private */ override def realize(): js.Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: js.Any): js.Any = js.native
    
    /* CompleteClass */
    var tokenKind: typings.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): js.Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.NormalModeFactory")
  @js.native
  class NormalModeFactory_ ()
    extends StObject
       with NormalModeFactory {
    
    /* CompleteClass */
    override def argumentList(
      typeArgumentList: typings.typescriptServices.TypeScript.TypeArgumentListSyntax,
      openParenToken: ISyntaxToken,
      arguments: ISeparatedSyntaxList,
      closeParenToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ArgumentListSyntax = js.native
    
    /* CompleteClass */
    override def arrayLiteralExpression(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken): typings.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax = js.native
    
    /* CompleteClass */
    override def arrayType(`type`: ITypeSyntax, openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): typings.typescriptServices.TypeScript.ArrayTypeSyntax = js.native
    
    /* CompleteClass */
    override def binaryExpression(
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      left: IExpressionSyntax,
      operatorToken: ISyntaxToken,
      right: IExpressionSyntax
    ): typings.typescriptServices.TypeScript.BinaryExpressionSyntax = js.native
    
    /* CompleteClass */
    override def block(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken): typings.typescriptServices.TypeScript.BlockSyntax = js.native
    
    /* CompleteClass */
    override def breakStatement(breakKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.BreakStatementSyntax = js.native
    
    /* CompleteClass */
    override def callSignature(
      typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
      parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax
    ): typings.typescriptServices.TypeScript.CallSignatureSyntax = js.native
    
    /* CompleteClass */
    override def caseSwitchClause(
      caseKeyword: ISyntaxToken,
      expression: IExpressionSyntax,
      colonToken: ISyntaxToken,
      statements: ISyntaxList
    ): typings.typescriptServices.TypeScript.CaseSwitchClauseSyntax = js.native
    
    /* CompleteClass */
    override def castExpression(
      lessThanToken: ISyntaxToken,
      `type`: ITypeSyntax,
      greaterThanToken: ISyntaxToken,
      expression: IUnaryExpressionSyntax
    ): typings.typescriptServices.TypeScript.CastExpressionSyntax = js.native
    
    /* CompleteClass */
    override def catchClause(
      catchKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      identifier: ISyntaxToken,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
      closeParenToken: ISyntaxToken,
      block: typings.typescriptServices.TypeScript.BlockSyntax
    ): typings.typescriptServices.TypeScript.CatchClauseSyntax = js.native
    
    /* CompleteClass */
    override def classDeclaration(
      modifiers: ISyntaxList,
      classKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
      heritageClauses: ISyntaxList,
      openBraceToken: ISyntaxToken,
      classElements: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ClassDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def conditionalExpression(
      condition: IExpressionSyntax,
      questionToken: ISyntaxToken,
      whenTrue: IExpressionSyntax,
      colonToken: ISyntaxToken,
      whenFalse: IExpressionSyntax
    ): typings.typescriptServices.TypeScript.ConditionalExpressionSyntax = js.native
    
    /* CompleteClass */
    override def constraint(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax): typings.typescriptServices.TypeScript.ConstraintSyntax = js.native
    
    /* CompleteClass */
    override def constructSignature(newKeyword: ISyntaxToken, callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax): typings.typescriptServices.TypeScript.ConstructSignatureSyntax = js.native
    
    /* CompleteClass */
    override def constructorDeclaration(
      modifiers: ISyntaxList,
      constructorKeyword: ISyntaxToken,
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ConstructorDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def constructorType(
      newKeyword: ISyntaxToken,
      typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
      parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      `type`: ITypeSyntax
    ): typings.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
    
    /* CompleteClass */
    override def continueStatement(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
    
    /* CompleteClass */
    override def debuggerStatement(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.DebuggerStatementSyntax = js.native
    
    /* CompleteClass */
    override def defaultSwitchClause(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken, statements: ISyntaxList): typings.typescriptServices.TypeScript.DefaultSwitchClauseSyntax = js.native
    
    /* CompleteClass */
    override def deleteExpression(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): typings.typescriptServices.TypeScript.DeleteExpressionSyntax = js.native
    
    /* CompleteClass */
    override def doStatement(
      doKeyword: ISyntaxToken,
      statement: IStatementSyntax,
      whileKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.DoStatementSyntax = js.native
    
    /* CompleteClass */
    override def elementAccessExpression(
      expression: IExpressionSyntax,
      openBracketToken: ISyntaxToken,
      argumentExpression: IExpressionSyntax,
      closeBracketToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ElementAccessExpressionSyntax = js.native
    
    /* CompleteClass */
    override def elseClause(elseKeyword: ISyntaxToken, statement: IStatementSyntax): typings.typescriptServices.TypeScript.ElseClauseSyntax = js.native
    
    /* CompleteClass */
    override def emptyStatement(semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.EmptyStatementSyntax = js.native
    
    /* CompleteClass */
    override def enumDeclaration(
      modifiers: ISyntaxList,
      enumKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      enumElements: ISeparatedSyntaxList,
      closeBraceToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.EnumDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def enumElement(
      propertyName: ISyntaxToken,
      equalsValueClause: typings.typescriptServices.TypeScript.EqualsValueClauseSyntax
    ): typings.typescriptServices.TypeScript.EnumElementSyntax = js.native
    
    /* CompleteClass */
    override def equalsValueClause(equalsToken: ISyntaxToken, value: IExpressionSyntax): typings.typescriptServices.TypeScript.EqualsValueClauseSyntax = js.native
    
    /* CompleteClass */
    override def exportAssignment(
      exportKeyword: ISyntaxToken,
      equalsToken: ISyntaxToken,
      identifier: ISyntaxToken,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ExportAssignmentSyntax = js.native
    
    /* CompleteClass */
    override def expressionStatement(expression: IExpressionSyntax, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ExpressionStatementSyntax = js.native
    
    /* CompleteClass */
    override def externalModuleReference(
      requireKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      stringLiteral: ISyntaxToken,
      closeParenToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ExternalModuleReferenceSyntax = js.native
    
    /* CompleteClass */
    override def finallyClause(finallyKeyword: ISyntaxToken, block: typings.typescriptServices.TypeScript.BlockSyntax): typings.typescriptServices.TypeScript.FinallyClauseSyntax = js.native
    
    /* CompleteClass */
    override def forInStatement(
      forKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      variableDeclaration: typings.typescriptServices.TypeScript.VariableDeclarationSyntax,
      left: IExpressionSyntax,
      inKeyword: ISyntaxToken,
      expression: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typings.typescriptServices.TypeScript.ForInStatementSyntax = js.native
    
    /* CompleteClass */
    override def forStatement(
      forKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      variableDeclaration: typings.typescriptServices.TypeScript.VariableDeclarationSyntax,
      initializer: IExpressionSyntax,
      firstSemicolonToken: ISyntaxToken,
      condition: IExpressionSyntax,
      secondSemicolonToken: ISyntaxToken,
      incrementor: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typings.typescriptServices.TypeScript.ForStatementSyntax = js.native
    
    /* CompleteClass */
    override def functionDeclaration(
      modifiers: ISyntaxList,
      functionKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def functionExpression(
      functionKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax
    ): typings.typescriptServices.TypeScript.FunctionExpressionSyntax = js.native
    
    /* CompleteClass */
    override def functionPropertyAssignment(
      propertyName: ISyntaxToken,
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax
    ): typings.typescriptServices.TypeScript.FunctionPropertyAssignmentSyntax = js.native
    
    /* CompleteClass */
    override def functionType(
      typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
      parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      `type`: ITypeSyntax
    ): typings.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
    
    /* CompleteClass */
    override def genericType(name: INameSyntax, typeArgumentList: typings.typescriptServices.TypeScript.TypeArgumentListSyntax): typings.typescriptServices.TypeScript.GenericTypeSyntax = js.native
    
    /* CompleteClass */
    override def getAccessor(
      modifiers: ISyntaxList,
      getKeyword: ISyntaxToken,
      propertyName: ISyntaxToken,
      parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax
    ): typings.typescriptServices.TypeScript.GetAccessorSyntax = js.native
    
    /* CompleteClass */
    override def heritageClause(
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      extendsOrImplementsKeyword: ISyntaxToken,
      typeNames: ISeparatedSyntaxList
    ): typings.typescriptServices.TypeScript.HeritageClauseSyntax = js.native
    
    /* CompleteClass */
    override def ifStatement(
      ifKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax,
      elseClause: typings.typescriptServices.TypeScript.ElseClauseSyntax
    ): typings.typescriptServices.TypeScript.IfStatementSyntax = js.native
    
    /* CompleteClass */
    override def importDeclaration(
      modifiers: ISyntaxList,
      importKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      equalsToken: ISyntaxToken,
      moduleReference: IModuleReferenceSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def indexMemberDeclaration(
      modifiers: ISyntaxList,
      indexSignature: typings.typescriptServices.TypeScript.IndexSignatureSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def indexSignature(
      openBracketToken: ISyntaxToken,
      parameter: typings.typescriptServices.TypeScript.ParameterSyntax,
      closeBracketToken: ISyntaxToken,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax
    ): typings.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
    
    /* CompleteClass */
    override def interfaceDeclaration(
      modifiers: ISyntaxList,
      interfaceKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
      heritageClauses: ISyntaxList,
      body: typings.typescriptServices.TypeScript.ObjectTypeSyntax
    ): typings.typescriptServices.TypeScript.InterfaceDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def invocationExpression(
      expression: IMemberExpressionSyntax,
      argumentList: typings.typescriptServices.TypeScript.ArgumentListSyntax
    ): typings.typescriptServices.TypeScript.InvocationExpressionSyntax = js.native
    
    /* CompleteClass */
    override def labeledStatement(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax): typings.typescriptServices.TypeScript.LabeledStatementSyntax = js.native
    
    /* CompleteClass */
    override def memberAccessExpression(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): typings.typescriptServices.TypeScript.MemberAccessExpressionSyntax = js.native
    
    /* CompleteClass */
    override def memberFunctionDeclaration(
      modifiers: ISyntaxList,
      propertyName: ISyntaxToken,
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def memberVariableDeclaration(
      modifiers: ISyntaxList,
      variableDeclarator: typings.typescriptServices.TypeScript.VariableDeclaratorSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.MemberVariableDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def methodSignature(
      propertyName: ISyntaxToken,
      questionToken: ISyntaxToken,
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax
    ): typings.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
    
    /* CompleteClass */
    override def moduleDeclaration(
      modifiers: ISyntaxList,
      moduleKeyword: ISyntaxToken,
      name: INameSyntax,
      stringLiteral: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      moduleElements: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ModuleDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def moduleNameModuleReference(moduleName: INameSyntax): typings.typescriptServices.TypeScript.ModuleNameModuleReferenceSyntax = js.native
    
    /* CompleteClass */
    override def objectCreationExpression(
      newKeyword: ISyntaxToken,
      expression: IMemberExpressionSyntax,
      argumentList: typings.typescriptServices.TypeScript.ArgumentListSyntax
    ): typings.typescriptServices.TypeScript.ObjectCreationExpressionSyntax = js.native
    
    /* CompleteClass */
    override def objectLiteralExpression(
      openBraceToken: ISyntaxToken,
      propertyAssignments: ISeparatedSyntaxList,
      closeBraceToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax = js.native
    
    /* CompleteClass */
    override def objectType(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken): typings.typescriptServices.TypeScript.ObjectTypeSyntax = js.native
    
    /* CompleteClass */
    override def omittedExpression(): typings.typescriptServices.TypeScript.OmittedExpressionSyntax = js.native
    
    /* CompleteClass */
    override def parameter(
      dotDotDotToken: ISyntaxToken,
      modifiers: ISyntaxList,
      identifier: ISyntaxToken,
      questionToken: ISyntaxToken,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
      equalsValueClause: typings.typescriptServices.TypeScript.EqualsValueClauseSyntax
    ): typings.typescriptServices.TypeScript.ParameterSyntax = js.native
    
    /* CompleteClass */
    override def parameterList(openParenToken: ISyntaxToken, parameters: ISeparatedSyntaxList, closeParenToken: ISyntaxToken): typings.typescriptServices.TypeScript.ParameterListSyntax = js.native
    
    /* CompleteClass */
    override def parenthesizedArrowFunctionExpression(
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      block: typings.typescriptServices.TypeScript.BlockSyntax,
      expression: IExpressionSyntax
    ): typings.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = js.native
    
    /* CompleteClass */
    override def parenthesizedExpression(openParenToken: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken): typings.typescriptServices.TypeScript.ParenthesizedExpressionSyntax = js.native
    
    /* CompleteClass */
    override def postfixUnaryExpression(
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      operand: IMemberExpressionSyntax,
      operatorToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.PostfixUnaryExpressionSyntax = js.native
    
    /* CompleteClass */
    override def prefixUnaryExpression(
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      operatorToken: ISyntaxToken,
      operand: IUnaryExpressionSyntax
    ): typings.typescriptServices.TypeScript.PrefixUnaryExpressionSyntax = js.native
    
    /* CompleteClass */
    override def propertySignature(
      propertyName: ISyntaxToken,
      questionToken: ISyntaxToken,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax
    ): typings.typescriptServices.TypeScript.PropertySignatureSyntax = js.native
    
    /* CompleteClass */
    override def qualifiedName(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken): typings.typescriptServices.TypeScript.QualifiedNameSyntax = js.native
    
    /* CompleteClass */
    override def returnStatement(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
    
    /* CompleteClass */
    override def setAccessor(
      modifiers: ISyntaxList,
      setKeyword: ISyntaxToken,
      propertyName: ISyntaxToken,
      parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax
    ): typings.typescriptServices.TypeScript.SetAccessorSyntax = js.native
    
    /* CompleteClass */
    override def simpleArrowFunctionExpression(
      identifier: ISyntaxToken,
      equalsGreaterThanToken: ISyntaxToken,
      block: typings.typescriptServices.TypeScript.BlockSyntax,
      expression: IExpressionSyntax
    ): typings.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax = js.native
    
    /* CompleteClass */
    override def simplePropertyAssignment(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax): typings.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax = js.native
    
    /* CompleteClass */
    override def sourceUnit(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken): typings.typescriptServices.TypeScript.SourceUnitSyntax = js.native
    
    /* CompleteClass */
    override def switchStatement(
      switchKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      expression: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      switchClauses: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.SwitchStatementSyntax = js.native
    
    /* CompleteClass */
    override def throwStatement(throwKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ThrowStatementSyntax = js.native
    
    /* CompleteClass */
    override def tryStatement(
      tryKeyword: ISyntaxToken,
      block: typings.typescriptServices.TypeScript.BlockSyntax,
      catchClause: typings.typescriptServices.TypeScript.CatchClauseSyntax,
      finallyClause: typings.typescriptServices.TypeScript.FinallyClauseSyntax
    ): typings.typescriptServices.TypeScript.TryStatementSyntax = js.native
    
    /* CompleteClass */
    override def typeAnnotation(colonToken: ISyntaxToken, `type`: ITypeSyntax): typings.typescriptServices.TypeScript.TypeAnnotationSyntax = js.native
    
    /* CompleteClass */
    override def typeArgumentList(lessThanToken: ISyntaxToken, typeArguments: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): typings.typescriptServices.TypeScript.TypeArgumentListSyntax = js.native
    
    /* CompleteClass */
    override def typeOfExpression(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): typings.typescriptServices.TypeScript.TypeOfExpressionSyntax = js.native
    
    /* CompleteClass */
    override def typeParameter(identifier: ISyntaxToken, constraint: typings.typescriptServices.TypeScript.ConstraintSyntax): typings.typescriptServices.TypeScript.TypeParameterSyntax = js.native
    
    /* CompleteClass */
    override def typeParameterList(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): typings.typescriptServices.TypeScript.TypeParameterListSyntax = js.native
    
    /* CompleteClass */
    override def typeQuery(typeOfKeyword: ISyntaxToken, name: INameSyntax): typings.typescriptServices.TypeScript.TypeQuerySyntax = js.native
    
    /* CompleteClass */
    override def variableDeclaration(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList): typings.typescriptServices.TypeScript.VariableDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def variableDeclarator(
      propertyName: ISyntaxToken,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
      equalsValueClause: typings.typescriptServices.TypeScript.EqualsValueClauseSyntax
    ): typings.typescriptServices.TypeScript.VariableDeclaratorSyntax = js.native
    
    /* CompleteClass */
    override def variableStatement(
      modifiers: ISyntaxList,
      variableDeclaration: typings.typescriptServices.TypeScript.VariableDeclarationSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.VariableStatementSyntax = js.native
    
    /* CompleteClass */
    override def voidExpression(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): typings.typescriptServices.TypeScript.VoidExpressionSyntax = js.native
    
    /* CompleteClass */
    override def whileStatement(
      whileKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typings.typescriptServices.TypeScript.WhileStatementSyntax = js.native
    
    /* CompleteClass */
    override def withStatement(
      withKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typings.typescriptServices.TypeScript.WithStatementSyntax = js.native
  }
  
  @JSImport("typescript-services", "Syntax.StrictModeFactory")
  @js.native
  class StrictModeFactory_ ()
    extends StObject
       with StrictModeFactory {
    
    /* CompleteClass */
    override def argumentList(
      typeArgumentList: typings.typescriptServices.TypeScript.TypeArgumentListSyntax,
      openParenToken: ISyntaxToken,
      arguments: ISeparatedSyntaxList,
      closeParenToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ArgumentListSyntax = js.native
    
    /* CompleteClass */
    override def arrayLiteralExpression(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken): typings.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax = js.native
    
    /* CompleteClass */
    override def arrayType(`type`: ITypeSyntax, openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): typings.typescriptServices.TypeScript.ArrayTypeSyntax = js.native
    
    /* CompleteClass */
    override def binaryExpression(
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      left: IExpressionSyntax,
      operatorToken: ISyntaxToken,
      right: IExpressionSyntax
    ): typings.typescriptServices.TypeScript.BinaryExpressionSyntax = js.native
    
    /* CompleteClass */
    override def block(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken): typings.typescriptServices.TypeScript.BlockSyntax = js.native
    
    /* CompleteClass */
    override def breakStatement(breakKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.BreakStatementSyntax = js.native
    
    /* CompleteClass */
    override def callSignature(
      typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
      parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax
    ): typings.typescriptServices.TypeScript.CallSignatureSyntax = js.native
    
    /* CompleteClass */
    override def caseSwitchClause(
      caseKeyword: ISyntaxToken,
      expression: IExpressionSyntax,
      colonToken: ISyntaxToken,
      statements: ISyntaxList
    ): typings.typescriptServices.TypeScript.CaseSwitchClauseSyntax = js.native
    
    /* CompleteClass */
    override def castExpression(
      lessThanToken: ISyntaxToken,
      `type`: ITypeSyntax,
      greaterThanToken: ISyntaxToken,
      expression: IUnaryExpressionSyntax
    ): typings.typescriptServices.TypeScript.CastExpressionSyntax = js.native
    
    /* CompleteClass */
    override def catchClause(
      catchKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      identifier: ISyntaxToken,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
      closeParenToken: ISyntaxToken,
      block: typings.typescriptServices.TypeScript.BlockSyntax
    ): typings.typescriptServices.TypeScript.CatchClauseSyntax = js.native
    
    /* CompleteClass */
    override def classDeclaration(
      modifiers: ISyntaxList,
      classKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
      heritageClauses: ISyntaxList,
      openBraceToken: ISyntaxToken,
      classElements: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ClassDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def conditionalExpression(
      condition: IExpressionSyntax,
      questionToken: ISyntaxToken,
      whenTrue: IExpressionSyntax,
      colonToken: ISyntaxToken,
      whenFalse: IExpressionSyntax
    ): typings.typescriptServices.TypeScript.ConditionalExpressionSyntax = js.native
    
    /* CompleteClass */
    override def constraint(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax): typings.typescriptServices.TypeScript.ConstraintSyntax = js.native
    
    /* CompleteClass */
    override def constructSignature(newKeyword: ISyntaxToken, callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax): typings.typescriptServices.TypeScript.ConstructSignatureSyntax = js.native
    
    /* CompleteClass */
    override def constructorDeclaration(
      modifiers: ISyntaxList,
      constructorKeyword: ISyntaxToken,
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ConstructorDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def constructorType(
      newKeyword: ISyntaxToken,
      typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
      parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      `type`: ITypeSyntax
    ): typings.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
    
    /* CompleteClass */
    override def continueStatement(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
    
    /* CompleteClass */
    override def debuggerStatement(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.DebuggerStatementSyntax = js.native
    
    /* CompleteClass */
    override def defaultSwitchClause(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken, statements: ISyntaxList): typings.typescriptServices.TypeScript.DefaultSwitchClauseSyntax = js.native
    
    /* CompleteClass */
    override def deleteExpression(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): typings.typescriptServices.TypeScript.DeleteExpressionSyntax = js.native
    
    /* CompleteClass */
    override def doStatement(
      doKeyword: ISyntaxToken,
      statement: IStatementSyntax,
      whileKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.DoStatementSyntax = js.native
    
    /* CompleteClass */
    override def elementAccessExpression(
      expression: IExpressionSyntax,
      openBracketToken: ISyntaxToken,
      argumentExpression: IExpressionSyntax,
      closeBracketToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ElementAccessExpressionSyntax = js.native
    
    /* CompleteClass */
    override def elseClause(elseKeyword: ISyntaxToken, statement: IStatementSyntax): typings.typescriptServices.TypeScript.ElseClauseSyntax = js.native
    
    /* CompleteClass */
    override def emptyStatement(semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.EmptyStatementSyntax = js.native
    
    /* CompleteClass */
    override def enumDeclaration(
      modifiers: ISyntaxList,
      enumKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      enumElements: ISeparatedSyntaxList,
      closeBraceToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.EnumDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def enumElement(
      propertyName: ISyntaxToken,
      equalsValueClause: typings.typescriptServices.TypeScript.EqualsValueClauseSyntax
    ): typings.typescriptServices.TypeScript.EnumElementSyntax = js.native
    
    /* CompleteClass */
    override def equalsValueClause(equalsToken: ISyntaxToken, value: IExpressionSyntax): typings.typescriptServices.TypeScript.EqualsValueClauseSyntax = js.native
    
    /* CompleteClass */
    override def exportAssignment(
      exportKeyword: ISyntaxToken,
      equalsToken: ISyntaxToken,
      identifier: ISyntaxToken,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ExportAssignmentSyntax = js.native
    
    /* CompleteClass */
    override def expressionStatement(expression: IExpressionSyntax, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ExpressionStatementSyntax = js.native
    
    /* CompleteClass */
    override def externalModuleReference(
      requireKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      stringLiteral: ISyntaxToken,
      closeParenToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ExternalModuleReferenceSyntax = js.native
    
    /* CompleteClass */
    override def finallyClause(finallyKeyword: ISyntaxToken, block: typings.typescriptServices.TypeScript.BlockSyntax): typings.typescriptServices.TypeScript.FinallyClauseSyntax = js.native
    
    /* CompleteClass */
    override def forInStatement(
      forKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      variableDeclaration: typings.typescriptServices.TypeScript.VariableDeclarationSyntax,
      left: IExpressionSyntax,
      inKeyword: ISyntaxToken,
      expression: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typings.typescriptServices.TypeScript.ForInStatementSyntax = js.native
    
    /* CompleteClass */
    override def forStatement(
      forKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      variableDeclaration: typings.typescriptServices.TypeScript.VariableDeclarationSyntax,
      initializer: IExpressionSyntax,
      firstSemicolonToken: ISyntaxToken,
      condition: IExpressionSyntax,
      secondSemicolonToken: ISyntaxToken,
      incrementor: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typings.typescriptServices.TypeScript.ForStatementSyntax = js.native
    
    /* CompleteClass */
    override def functionDeclaration(
      modifiers: ISyntaxList,
      functionKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def functionExpression(
      functionKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax
    ): typings.typescriptServices.TypeScript.FunctionExpressionSyntax = js.native
    
    /* CompleteClass */
    override def functionPropertyAssignment(
      propertyName: ISyntaxToken,
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax
    ): typings.typescriptServices.TypeScript.FunctionPropertyAssignmentSyntax = js.native
    
    /* CompleteClass */
    override def functionType(
      typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
      parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      `type`: ITypeSyntax
    ): typings.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
    
    /* CompleteClass */
    override def genericType(name: INameSyntax, typeArgumentList: typings.typescriptServices.TypeScript.TypeArgumentListSyntax): typings.typescriptServices.TypeScript.GenericTypeSyntax = js.native
    
    /* CompleteClass */
    override def getAccessor(
      modifiers: ISyntaxList,
      getKeyword: ISyntaxToken,
      propertyName: ISyntaxToken,
      parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax
    ): typings.typescriptServices.TypeScript.GetAccessorSyntax = js.native
    
    /* CompleteClass */
    override def heritageClause(
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      extendsOrImplementsKeyword: ISyntaxToken,
      typeNames: ISeparatedSyntaxList
    ): typings.typescriptServices.TypeScript.HeritageClauseSyntax = js.native
    
    /* CompleteClass */
    override def ifStatement(
      ifKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax,
      elseClause: typings.typescriptServices.TypeScript.ElseClauseSyntax
    ): typings.typescriptServices.TypeScript.IfStatementSyntax = js.native
    
    /* CompleteClass */
    override def importDeclaration(
      modifiers: ISyntaxList,
      importKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      equalsToken: ISyntaxToken,
      moduleReference: IModuleReferenceSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def indexMemberDeclaration(
      modifiers: ISyntaxList,
      indexSignature: typings.typescriptServices.TypeScript.IndexSignatureSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def indexSignature(
      openBracketToken: ISyntaxToken,
      parameter: typings.typescriptServices.TypeScript.ParameterSyntax,
      closeBracketToken: ISyntaxToken,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax
    ): typings.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
    
    /* CompleteClass */
    override def interfaceDeclaration(
      modifiers: ISyntaxList,
      interfaceKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
      heritageClauses: ISyntaxList,
      body: typings.typescriptServices.TypeScript.ObjectTypeSyntax
    ): typings.typescriptServices.TypeScript.InterfaceDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def invocationExpression(
      expression: IMemberExpressionSyntax,
      argumentList: typings.typescriptServices.TypeScript.ArgumentListSyntax
    ): typings.typescriptServices.TypeScript.InvocationExpressionSyntax = js.native
    
    /* CompleteClass */
    override def labeledStatement(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax): typings.typescriptServices.TypeScript.LabeledStatementSyntax = js.native
    
    /* CompleteClass */
    override def memberAccessExpression(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): typings.typescriptServices.TypeScript.MemberAccessExpressionSyntax = js.native
    
    /* CompleteClass */
    override def memberFunctionDeclaration(
      modifiers: ISyntaxList,
      propertyName: ISyntaxToken,
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def memberVariableDeclaration(
      modifiers: ISyntaxList,
      variableDeclarator: typings.typescriptServices.TypeScript.VariableDeclaratorSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.MemberVariableDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def methodSignature(
      propertyName: ISyntaxToken,
      questionToken: ISyntaxToken,
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax
    ): typings.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
    
    /* CompleteClass */
    override def moduleDeclaration(
      modifiers: ISyntaxList,
      moduleKeyword: ISyntaxToken,
      name: INameSyntax,
      stringLiteral: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      moduleElements: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ModuleDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def moduleNameModuleReference(moduleName: INameSyntax): typings.typescriptServices.TypeScript.ModuleNameModuleReferenceSyntax = js.native
    
    /* CompleteClass */
    override def objectCreationExpression(
      newKeyword: ISyntaxToken,
      expression: IMemberExpressionSyntax,
      argumentList: typings.typescriptServices.TypeScript.ArgumentListSyntax
    ): typings.typescriptServices.TypeScript.ObjectCreationExpressionSyntax = js.native
    
    /* CompleteClass */
    override def objectLiteralExpression(
      openBraceToken: ISyntaxToken,
      propertyAssignments: ISeparatedSyntaxList,
      closeBraceToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax = js.native
    
    /* CompleteClass */
    override def objectType(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken): typings.typescriptServices.TypeScript.ObjectTypeSyntax = js.native
    
    /* CompleteClass */
    override def omittedExpression(): typings.typescriptServices.TypeScript.OmittedExpressionSyntax = js.native
    
    /* CompleteClass */
    override def parameter(
      dotDotDotToken: ISyntaxToken,
      modifiers: ISyntaxList,
      identifier: ISyntaxToken,
      questionToken: ISyntaxToken,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
      equalsValueClause: typings.typescriptServices.TypeScript.EqualsValueClauseSyntax
    ): typings.typescriptServices.TypeScript.ParameterSyntax = js.native
    
    /* CompleteClass */
    override def parameterList(openParenToken: ISyntaxToken, parameters: ISeparatedSyntaxList, closeParenToken: ISyntaxToken): typings.typescriptServices.TypeScript.ParameterListSyntax = js.native
    
    /* CompleteClass */
    override def parenthesizedArrowFunctionExpression(
      callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      block: typings.typescriptServices.TypeScript.BlockSyntax,
      expression: IExpressionSyntax
    ): typings.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = js.native
    
    /* CompleteClass */
    override def parenthesizedExpression(openParenToken: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken): typings.typescriptServices.TypeScript.ParenthesizedExpressionSyntax = js.native
    
    /* CompleteClass */
    override def postfixUnaryExpression(
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      operand: IMemberExpressionSyntax,
      operatorToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.PostfixUnaryExpressionSyntax = js.native
    
    /* CompleteClass */
    override def prefixUnaryExpression(
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      operatorToken: ISyntaxToken,
      operand: IUnaryExpressionSyntax
    ): typings.typescriptServices.TypeScript.PrefixUnaryExpressionSyntax = js.native
    
    /* CompleteClass */
    override def propertySignature(
      propertyName: ISyntaxToken,
      questionToken: ISyntaxToken,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax
    ): typings.typescriptServices.TypeScript.PropertySignatureSyntax = js.native
    
    /* CompleteClass */
    override def qualifiedName(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken): typings.typescriptServices.TypeScript.QualifiedNameSyntax = js.native
    
    /* CompleteClass */
    override def returnStatement(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
    
    /* CompleteClass */
    override def setAccessor(
      modifiers: ISyntaxList,
      setKeyword: ISyntaxToken,
      propertyName: ISyntaxToken,
      parameterList: typings.typescriptServices.TypeScript.ParameterListSyntax,
      block: typings.typescriptServices.TypeScript.BlockSyntax
    ): typings.typescriptServices.TypeScript.SetAccessorSyntax = js.native
    
    /* CompleteClass */
    override def simpleArrowFunctionExpression(
      identifier: ISyntaxToken,
      equalsGreaterThanToken: ISyntaxToken,
      block: typings.typescriptServices.TypeScript.BlockSyntax,
      expression: IExpressionSyntax
    ): typings.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax = js.native
    
    /* CompleteClass */
    override def simplePropertyAssignment(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax): typings.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax = js.native
    
    /* CompleteClass */
    override def sourceUnit(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken): typings.typescriptServices.TypeScript.SourceUnitSyntax = js.native
    
    /* CompleteClass */
    override def switchStatement(
      switchKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      expression: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      switchClauses: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.SwitchStatementSyntax = js.native
    
    /* CompleteClass */
    override def throwStatement(throwKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ThrowStatementSyntax = js.native
    
    /* CompleteClass */
    override def tryStatement(
      tryKeyword: ISyntaxToken,
      block: typings.typescriptServices.TypeScript.BlockSyntax,
      catchClause: typings.typescriptServices.TypeScript.CatchClauseSyntax,
      finallyClause: typings.typescriptServices.TypeScript.FinallyClauseSyntax
    ): typings.typescriptServices.TypeScript.TryStatementSyntax = js.native
    
    /* CompleteClass */
    override def typeAnnotation(colonToken: ISyntaxToken, `type`: ITypeSyntax): typings.typescriptServices.TypeScript.TypeAnnotationSyntax = js.native
    
    /* CompleteClass */
    override def typeArgumentList(lessThanToken: ISyntaxToken, typeArguments: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): typings.typescriptServices.TypeScript.TypeArgumentListSyntax = js.native
    
    /* CompleteClass */
    override def typeOfExpression(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): typings.typescriptServices.TypeScript.TypeOfExpressionSyntax = js.native
    
    /* CompleteClass */
    override def typeParameter(identifier: ISyntaxToken, constraint: typings.typescriptServices.TypeScript.ConstraintSyntax): typings.typescriptServices.TypeScript.TypeParameterSyntax = js.native
    
    /* CompleteClass */
    override def typeParameterList(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): typings.typescriptServices.TypeScript.TypeParameterListSyntax = js.native
    
    /* CompleteClass */
    override def typeQuery(typeOfKeyword: ISyntaxToken, name: INameSyntax): typings.typescriptServices.TypeScript.TypeQuerySyntax = js.native
    
    /* CompleteClass */
    override def variableDeclaration(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList): typings.typescriptServices.TypeScript.VariableDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def variableDeclarator(
      propertyName: ISyntaxToken,
      typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
      equalsValueClause: typings.typescriptServices.TypeScript.EqualsValueClauseSyntax
    ): typings.typescriptServices.TypeScript.VariableDeclaratorSyntax = js.native
    
    /* CompleteClass */
    override def variableStatement(
      modifiers: ISyntaxList,
      variableDeclaration: typings.typescriptServices.TypeScript.VariableDeclarationSyntax,
      semicolonToken: ISyntaxToken
    ): typings.typescriptServices.TypeScript.VariableStatementSyntax = js.native
    
    /* CompleteClass */
    override def voidExpression(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): typings.typescriptServices.TypeScript.VoidExpressionSyntax = js.native
    
    /* CompleteClass */
    override def whileStatement(
      whileKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typings.typescriptServices.TypeScript.WhileStatementSyntax = js.native
    
    /* CompleteClass */
    override def withStatement(
      withKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typings.typescriptServices.TypeScript.WithStatementSyntax = js.native
  }
  
  @JSImport("typescript-services", "Syntax.VariableWidthTokenWithLeadingAndTrailingTrivia")
  @js.native
  class VariableWidthTokenWithLeadingAndTrailingTrivia protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithLeadingAndTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double,
      trailingTriviaInfo: Double
    ) = this()
    
    /* CompleteClass */
    var _fullText: js.Any = js.native
    
    /* CompleteClass */
    var _leadingTriviaInfo: js.Any = js.native
    
    /* CompleteClass */
    var _trailingTriviaInfo: js.Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): js.Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    /* private */ override def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
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
    /* private */ override def realize(): js.Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: js.Any): js.Any = js.native
    
    /* CompleteClass */
    var tokenKind: typings.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): js.Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.VariableWidthTokenWithLeadingTrivia")
  @js.native
  class VariableWidthTokenWithLeadingTrivia protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithLeadingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double
    ) = this()
    
    /* CompleteClass */
    var _fullText: js.Any = js.native
    
    /* CompleteClass */
    var _leadingTriviaInfo: js.Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): js.Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    /* private */ override def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
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
    /* private */ override def realize(): js.Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: js.Any): js.Any = js.native
    
    /* CompleteClass */
    var tokenKind: typings.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): js.Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.VariableWidthTokenWithNoTrivia")
  @js.native
  class VariableWidthTokenWithNoTrivia protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithNoTrivia {
    def this(fullText: String, kind: typings.typescriptServices.TypeScript.SyntaxKind) = this()
    
    /* CompleteClass */
    var _fullText: js.Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): js.Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    /* private */ override def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
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
    /* private */ override def realize(): js.Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: js.Any): js.Any = js.native
    
    /* CompleteClass */
    var tokenKind: typings.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): js.Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.VariableWidthTokenWithTrailingTrivia")
  @js.native
  class VariableWidthTokenWithTrailingTrivia protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithTrailingTrivia {
    def this(
      fullText: String,
      kind: typings.typescriptServices.TypeScript.SyntaxKind,
      trailingTriviaInfo: Double
    ) = this()
    
    /* CompleteClass */
    var _fullText: js.Any = js.native
    
    /* CompleteClass */
    var _trailingTriviaInfo: js.Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): js.Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    /* private */ override def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
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
    /* private */ override def realize(): js.Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: js.Any): js.Any = js.native
    
    /* CompleteClass */
    var tokenKind: typings.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): js.Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @scala.inline
  def assignmentExpression(left: IExpressionSyntax, token: ISyntaxToken, right: IExpressionSyntax): typings.typescriptServices.TypeScript.BinaryExpressionSyntax = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentExpression")(left.asInstanceOf[js.Any], token.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.BinaryExpressionSyntax]
  
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
  
  @scala.inline
  def childIndex(parent: ISyntaxElement, child: ISyntaxElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("childIndex")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def childOffset(parent: ISyntaxElement, child: ISyntaxElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("childOffset")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def childOffsetAt(parent: ISyntaxElement, index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("childOffsetAt")(parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def convertToIdentifierName(token: ISyntaxToken): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToIdentifierName")(token.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  
  @scala.inline
  def deferredTrivia(
    kind: typings.typescriptServices.TypeScript.SyntaxKind,
    text: ISimpleText,
    fullStart: Double,
    fullWidth: Double
  ): ISyntaxTrivia = (^.asInstanceOf[js.Dynamic].applyDynamic("deferredTrivia")(kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any], fullStart.asInstanceOf[js.Any], fullWidth.asInstanceOf[js.Any])).asInstanceOf[ISyntaxTrivia]
  
  @scala.inline
  def elementStructuralEquals(element1: ISyntaxElement, element2: ISyntaxElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementStructuralEquals")(element1.asInstanceOf[js.Any], element2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
  
  @scala.inline
  def emptySourceUnit(): typings.typescriptServices.TypeScript.SourceUnitSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("emptySourceUnit")().asInstanceOf[typings.typescriptServices.TypeScript.SourceUnitSyntax]
  
  @scala.inline
  def emptyToken(kind: typings.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyToken")(kind.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  
  @JSImport("typescript-services", "Syntax.emptyTriviaList")
  @js.native
  def emptyTriviaList: ISyntaxTriviaList = js.native
  @scala.inline
  def emptyTriviaList_=(x: ISyntaxTriviaList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyTriviaList")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def falseExpression(): IUnaryExpressionSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("falseExpression")().asInstanceOf[IUnaryExpressionSyntax]
  
  @scala.inline
  def findSkippedTokenInLeadingTriviaList(positionedToken: typings.typescriptServices.TypeScript.PositionedToken, position: Double): typings.typescriptServices.TypeScript.PositionedSkippedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("findSkippedTokenInLeadingTriviaList")(positionedToken.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.PositionedSkippedToken]
  
  @scala.inline
  def findSkippedTokenInPositionedToken(positionedToken: typings.typescriptServices.TypeScript.PositionedToken, position: Double): typings.typescriptServices.TypeScript.PositionedSkippedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("findSkippedTokenInPositionedToken")(positionedToken.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.PositionedSkippedToken]
  
  @scala.inline
  def findSkippedTokenInTrailingTriviaList(positionedToken: typings.typescriptServices.TypeScript.PositionedToken, position: Double): typings.typescriptServices.TypeScript.PositionedSkippedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("findSkippedTokenInTrailingTriviaList")(positionedToken.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.PositionedSkippedToken]
  
  @scala.inline
  def findSkippedTokenOnLeft(positionedToken: typings.typescriptServices.TypeScript.PositionedToken, position: Double): typings.typescriptServices.TypeScript.PositionedSkippedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("findSkippedTokenOnLeft")(positionedToken.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.PositionedSkippedToken]
  
  @scala.inline
  def getAncestorOfKind(
    positionedToken: typings.typescriptServices.TypeScript.PositionedElement,
    kind: typings.typescriptServices.TypeScript.SyntaxKind
  ): typings.typescriptServices.TypeScript.PositionedElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getAncestorOfKind")(positionedToken.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.PositionedElement]
  
  @scala.inline
  def getStandaloneExpression(positionedToken: typings.typescriptServices.TypeScript.PositionedToken): typings.typescriptServices.TypeScript.PositionedNodeOrToken = ^.asInstanceOf[js.Dynamic].applyDynamic("getStandaloneExpression")(positionedToken.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.PositionedNodeOrToken]
  
  @scala.inline
  def hasAncestorOfKind(
    positionedToken: typings.typescriptServices.TypeScript.PositionedElement,
    kind: typings.typescriptServices.TypeScript.SyntaxKind
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAncestorOfKind")(positionedToken.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def identifier(text: String): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("identifier")(text.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  @scala.inline
  def identifier(text: String, info: ITokenInfo): ISyntaxToken = (^.asInstanceOf[js.Dynamic].applyDynamic("identifier")(text.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[ISyntaxToken]
  
  @scala.inline
  def identifierName(text: String): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("identifierName")(text.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  @scala.inline
  def identifierName(text: String, info: ITokenInfo): ISyntaxToken = (^.asInstanceOf[js.Dynamic].applyDynamic("identifierName")(text.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[ISyntaxToken]
  
  @scala.inline
  def isEntirelyInStringOrRegularExpressionLiteral(sourceUnit: typings.typescriptServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEntirelyInStringOrRegularExpressionLiteral")(sourceUnit.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isEntirelyInsideComment(sourceUnit: typings.typescriptServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEntirelyInsideComment")(sourceUnit.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isEntirelyInsideCommentTrivia(trivia: ISyntaxTrivia, fullStart: Double, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEntirelyInsideCommentTrivia")(trivia.asInstanceOf[js.Any], fullStart.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isExpression(token: ISyntaxToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpression")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isInModuleOrTypeContext(positionedToken: typings.typescriptServices.TypeScript.PositionedToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInModuleOrTypeContext")(positionedToken.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isInTypeOnlyContext(positionedToken: typings.typescriptServices.TypeScript.PositionedToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInTypeOnlyContext")(positionedToken.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isIntegerLiteral(expression: IExpressionSyntax): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntegerLiteral")(expression.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isSuperInvocationExpression(node: IExpressionSyntax): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuperInvocationExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isSuperInvocationExpressionStatement(node: typings.typescriptServices.TypeScript.SyntaxNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuperInvocationExpressionStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isSuperMemberAccessExpression(node: IExpressionSyntax): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuperMemberAccessExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isSuperMemberAccessInvocationExpression(node: typings.typescriptServices.TypeScript.SyntaxNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuperMemberAccessInvocationExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isUnterminatedMultilineCommentTrivia(trivia: ISyntaxTrivia): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnterminatedMultilineCommentTrivia")(trivia.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isUnterminatedStringLiteral(token: ISyntaxToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnterminatedStringLiteral")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("typescript-services", "Syntax.lineFeedTrivia")
  @js.native
  def lineFeedTrivia: ISyntaxTrivia = js.native
  @scala.inline
  def lineFeedTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineFeedTrivia")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def list(nodes: js.Array[ISyntaxNodeOrToken]): ISyntaxList = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(nodes.asInstanceOf[js.Any]).asInstanceOf[ISyntaxList]
  
  @scala.inline
  def listStructuralEquals(list1: ISyntaxList, list2: ISyntaxList): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("listStructuralEquals")(list1.asInstanceOf[js.Any], list2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def massageEscapes(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("massageEscapes")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def multiLineComment(text: String): ISyntaxTrivia = ^.asInstanceOf[js.Dynamic].applyDynamic("multiLineComment")(text.asInstanceOf[js.Any]).asInstanceOf[ISyntaxTrivia]
  
  @scala.inline
  def nodeHasSkippedOrMissingTokens(node: typings.typescriptServices.TypeScript.SyntaxNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeHasSkippedOrMissingTokens")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def nodeOrTokenStructuralEquals(node1: ISyntaxNodeOrToken, node2: ISyntaxNodeOrToken): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeOrTokenStructuralEquals")(node1.asInstanceOf[js.Any], node2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def nodeStructuralEquals(
    node1: typings.typescriptServices.TypeScript.SyntaxNode,
    node2: typings.typescriptServices.TypeScript.SyntaxNode
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeStructuralEquals")(node1.asInstanceOf[js.Any], node2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("typescript-services", "Syntax.normalModeFactory")
  @js.native
  def normalModeFactory: IFactory = js.native
  @scala.inline
  def normalModeFactory_=(x: IFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalModeFactory")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def numericLiteralExpression(text: String): IUnaryExpressionSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("numericLiteralExpression")(text.asInstanceOf[js.Any]).asInstanceOf[IUnaryExpressionSyntax]
  
  @scala.inline
  def realizeToken(token: ISyntaxToken): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("realizeToken")(token.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  
  @scala.inline
  def separatedList(nodes: js.Array[ISyntaxNodeOrToken]): ISeparatedSyntaxList = ^.asInstanceOf[js.Dynamic].applyDynamic("separatedList")(nodes.asInstanceOf[js.Any]).asInstanceOf[ISeparatedSyntaxList]
  
  @scala.inline
  def separatedListStructuralEquals(list1: ISeparatedSyntaxList, list2: ISeparatedSyntaxList): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("separatedListStructuralEquals")(list1.asInstanceOf[js.Any], list2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def singleLineComment(text: String): ISyntaxTrivia = ^.asInstanceOf[js.Dynamic].applyDynamic("singleLineComment")(text.asInstanceOf[js.Any]).asInstanceOf[ISyntaxTrivia]
  
  @scala.inline
  def skippedTokenTrivia(token: ISyntaxToken): ISyntaxTrivia = ^.asInstanceOf[js.Dynamic].applyDynamic("skippedTokenTrivia")(token.asInstanceOf[js.Any]).asInstanceOf[ISyntaxTrivia]
  
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
  
  @scala.inline
  def spaces(count: Double): ISyntaxTrivia = ^.asInstanceOf[js.Dynamic].applyDynamic("spaces")(count.asInstanceOf[js.Any]).asInstanceOf[ISyntaxTrivia]
  
  @scala.inline
  def splitMultiLineCommentTriviaIntoMultipleLines(trivia: ISyntaxTrivia): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitMultiLineCommentTriviaIntoMultipleLines")(trivia.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("typescript-services", "Syntax.strictModeFactory")
  @js.native
  def strictModeFactory: IFactory = js.native
  @scala.inline
  def strictModeFactory_=(x: IFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strictModeFactory")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def stringLiteralExpression(text: String): IUnaryExpressionSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("stringLiteralExpression")(text.asInstanceOf[js.Any]).asInstanceOf[IUnaryExpressionSyntax]
  
  @scala.inline
  def token(kind: typings.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(kind.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  @scala.inline
  def token(kind: typings.typescriptServices.TypeScript.SyntaxKind, info: ITokenInfo): ISyntaxToken = (^.asInstanceOf[js.Dynamic].applyDynamic("token")(kind.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[ISyntaxToken]
  
  @scala.inline
  def tokenStructuralEquals(token1: ISyntaxToken, token2: ISyntaxToken): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenStructuralEquals")(token1.asInstanceOf[js.Any], token2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def tokenToJSON(token: ISyntaxToken): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenToJSON")(token.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def trivia(kind: typings.typescriptServices.TypeScript.SyntaxKind, text: String): ISyntaxTrivia = (^.asInstanceOf[js.Dynamic].applyDynamic("trivia")(kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[ISyntaxTrivia]
  
  @scala.inline
  def triviaList(trivia: js.Array[ISyntaxTrivia]): ISyntaxTriviaList = ^.asInstanceOf[js.Dynamic].applyDynamic("triviaList")(trivia.asInstanceOf[js.Any]).asInstanceOf[ISyntaxTriviaList]
  
  @scala.inline
  def triviaListStructuralEquals(triviaList1: ISyntaxTriviaList, triviaList2: ISyntaxTriviaList): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("triviaListStructuralEquals")(triviaList1.asInstanceOf[js.Any], triviaList2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def triviaStructuralEquals(trivia1: ISyntaxTrivia, trivia2: ISyntaxTrivia): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("triviaStructuralEquals")(trivia1.asInstanceOf[js.Any], trivia2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def trueExpression(): IUnaryExpressionSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("trueExpression")().asInstanceOf[IUnaryExpressionSyntax]
  
  @scala.inline
  def value(token: ISyntaxToken): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(token.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def valueText(token: ISyntaxToken): String = ^.asInstanceOf[js.Dynamic].applyDynamic("valueText")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def whitespace(text: String): ISyntaxTrivia = ^.asInstanceOf[js.Dynamic].applyDynamic("whitespace")(text.asInstanceOf[js.Any]).asInstanceOf[ISyntaxTrivia]
}
