package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SyntaxFacts {
  
  @JSImport("typescript-services", "SyntaxFacts.getBinaryExpressionFromOperatorToken")
  @js.native
  def getBinaryExpressionFromOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.getOperatorTokenFromBinaryExpression")
  @js.native
  def getOperatorTokenFromBinaryExpression(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.getPostfixUnaryExpressionFromOperatorToken")
  @js.native
  def getPostfixUnaryExpressionFromOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.getPrefixUnaryExpressionFromOperatorToken")
  @js.native
  def getPrefixUnaryExpressionFromOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.getText")
  @js.native
  def getText(kind: typings.typescriptServices.TypeScript.SyntaxKind): String = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.getTokenKind")
  @js.native
  def getTokenKind(text: String): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isAnyDivideOrRegularExpressionToken")
  @js.native
  def isAnyDivideOrRegularExpressionToken(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isAnyDivideToken")
  @js.native
  def isAnyDivideToken(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isAnyKeyword")
  @js.native
  def isAnyKeyword(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isAnyPunctuation")
  @js.native
  def isAnyPunctuation(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isBinaryExpressionOperatorToken")
  @js.native
  def isBinaryExpressionOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isDirectivePrologueElement")
  @js.native
  def isDirectivePrologueElement(node: ISyntaxNodeOrToken): Boolean = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isFutureReservedKeyword")
  @js.native
  def isFutureReservedKeyword(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isFutureReservedStrictKeyword")
  @js.native
  def isFutureReservedStrictKeyword(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isIdentifierNameOrAnyKeyword")
  @js.native
  def isIdentifierNameOrAnyKeyword(token: ISyntaxToken): Boolean = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isPrefixUnaryExpressionOperatorToken")
  @js.native
  def isPrefixUnaryExpressionOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isStandardKeyword")
  @js.native
  def isStandardKeyword(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isTokenKind")
  @js.native
  def isTokenKind(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  @JSImport("typescript-services", "SyntaxFacts.isUseStrictDirective")
  @js.native
  def isUseStrictDirective(node: ISyntaxNodeOrToken): Boolean = js.native
}
