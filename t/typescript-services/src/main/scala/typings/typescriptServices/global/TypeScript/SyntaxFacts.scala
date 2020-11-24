package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SyntaxFacts")
@js.native
object SyntaxFacts extends js.Object {
  
  def getBinaryExpressionFromOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  def getOperatorTokenFromBinaryExpression(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  def getPostfixUnaryExpressionFromOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  def getPrefixUnaryExpressionFromOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  def getText(kind: typings.typescriptServices.TypeScript.SyntaxKind): String = js.native
  
  def getTokenKind(text: String): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  def isAnyDivideOrRegularExpressionToken(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isAnyDivideToken(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isAnyKeyword(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isAnyPunctuation(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isBinaryExpressionOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isDirectivePrologueElement(node: ISyntaxNodeOrToken): Boolean = js.native
  
  def isFutureReservedKeyword(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isFutureReservedStrictKeyword(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isIdentifierNameOrAnyKeyword(token: ISyntaxToken): Boolean = js.native
  
  def isPrefixUnaryExpressionOperatorToken(tokenKind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isStandardKeyword(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isTokenKind(kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isUseStrictDirective(node: ISyntaxNodeOrToken): Boolean = js.native
}
