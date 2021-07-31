package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SyntaxFacts {
  
  @JSImport("typescript-services", "SyntaxFacts")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getBinaryExpressionFromOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): typings.typescriptServices.TypeScript.SyntaxKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinaryExpressionFromOperatorToken")(tokenKind.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.SyntaxKind]
  
  @scala.inline
  def getOperatorTokenFromBinaryExpression(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): typings.typescriptServices.TypeScript.SyntaxKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getOperatorTokenFromBinaryExpression")(tokenKind.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.SyntaxKind]
  
  @scala.inline
  def getPostfixUnaryExpressionFromOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): typings.typescriptServices.TypeScript.SyntaxKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getPostfixUnaryExpressionFromOperatorToken")(tokenKind.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.SyntaxKind]
  
  @scala.inline
  def getPrefixUnaryExpressionFromOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): typings.typescriptServices.TypeScript.SyntaxKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefixUnaryExpressionFromOperatorToken")(tokenKind.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.SyntaxKind]
  
  @scala.inline
  def getText(kind: typings.typescriptServices.TypeScript.SyntaxKind): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getTokenKind(text: String): typings.typescriptServices.TypeScript.SyntaxKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenKind")(text.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.SyntaxKind]
  
  @scala.inline
  def isAnyDivideOrRegularExpressionToken(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyDivideOrRegularExpressionToken")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isAnyDivideToken(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyDivideToken")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isAnyKeyword(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyKeyword")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isAnyPunctuation(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyPunctuation")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isBinaryExpressionOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryExpressionOperatorToken")(tokenKind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isDirectivePrologueElement(node: ISyntaxNodeOrToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectivePrologueElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFutureReservedKeyword(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFutureReservedKeyword")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFutureReservedStrictKeyword(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFutureReservedStrictKeyword")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isIdentifierNameOrAnyKeyword(token: ISyntaxToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierNameOrAnyKeyword")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPrefixUnaryExpressionOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrefixUnaryExpressionOperatorToken")(tokenKind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isStandardKeyword(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStandardKeyword")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isTokenKind(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isUseStrictDirective(node: ISyntaxNodeOrToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUseStrictDirective")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
