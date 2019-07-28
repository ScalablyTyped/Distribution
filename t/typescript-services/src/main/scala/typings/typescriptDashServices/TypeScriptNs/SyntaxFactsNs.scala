package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxFacts")
@js.native
object SyntaxFactsNs extends js.Object {
  def getBinaryExpressionFromOperatorToken(tokenKind: SyntaxKind): SyntaxKind = js.native
  def getOperatorTokenFromBinaryExpression(tokenKind: SyntaxKind): SyntaxKind = js.native
  def getPostfixUnaryExpressionFromOperatorToken(tokenKind: SyntaxKind): SyntaxKind = js.native
  def getPrefixUnaryExpressionFromOperatorToken(tokenKind: SyntaxKind): SyntaxKind = js.native
  def getText(kind: SyntaxKind): String = js.native
  def getTokenKind(text: String): SyntaxKind = js.native
  def isAnyDivideOrRegularExpressionToken(kind: SyntaxKind): Boolean = js.native
  def isAnyDivideToken(kind: SyntaxKind): Boolean = js.native
  def isAnyKeyword(kind: SyntaxKind): Boolean = js.native
  def isAnyPunctuation(kind: SyntaxKind): Boolean = js.native
  def isBinaryExpressionOperatorToken(tokenKind: SyntaxKind): Boolean = js.native
  def isDirectivePrologueElement(node: ISyntaxNodeOrToken): Boolean = js.native
  def isFutureReservedKeyword(kind: SyntaxKind): Boolean = js.native
  def isFutureReservedStrictKeyword(kind: SyntaxKind): Boolean = js.native
  def isIdentifierNameOrAnyKeyword(token: ISyntaxToken): Boolean = js.native
  def isPrefixUnaryExpressionOperatorToken(tokenKind: SyntaxKind): Boolean = js.native
  def isStandardKeyword(kind: SyntaxKind): Boolean = js.native
  def isTokenKind(kind: SyntaxKind): Boolean = js.native
  def isUseStrictDirective(node: ISyntaxNodeOrToken): Boolean = js.native
}

