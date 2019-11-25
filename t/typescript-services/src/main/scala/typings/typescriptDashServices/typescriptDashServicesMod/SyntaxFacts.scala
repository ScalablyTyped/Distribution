package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxFacts")
@js.native
object SyntaxFacts extends js.Object {
  def getBinaryExpressionFromOperatorToken(tokenKind: typings.typescriptDashServices.TypeScript.SyntaxKind): typings.typescriptDashServices.TypeScript.SyntaxKind = js.native
  def getOperatorTokenFromBinaryExpression(tokenKind: typings.typescriptDashServices.TypeScript.SyntaxKind): typings.typescriptDashServices.TypeScript.SyntaxKind = js.native
  def getPostfixUnaryExpressionFromOperatorToken(tokenKind: typings.typescriptDashServices.TypeScript.SyntaxKind): typings.typescriptDashServices.TypeScript.SyntaxKind = js.native
  def getPrefixUnaryExpressionFromOperatorToken(tokenKind: typings.typescriptDashServices.TypeScript.SyntaxKind): typings.typescriptDashServices.TypeScript.SyntaxKind = js.native
  def getText(kind: typings.typescriptDashServices.TypeScript.SyntaxKind): String = js.native
  def getTokenKind(text: String): typings.typescriptDashServices.TypeScript.SyntaxKind = js.native
  def isAnyDivideOrRegularExpressionToken(kind: typings.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isAnyDivideToken(kind: typings.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isAnyKeyword(kind: typings.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isAnyPunctuation(kind: typings.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isBinaryExpressionOperatorToken(tokenKind: typings.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isDirectivePrologueElement(node: ISyntaxNodeOrToken): Boolean = js.native
  def isFutureReservedKeyword(kind: typings.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isFutureReservedStrictKeyword(kind: typings.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isIdentifierNameOrAnyKeyword(token: ISyntaxToken): Boolean = js.native
  def isPrefixUnaryExpressionOperatorToken(tokenKind: typings.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isStandardKeyword(kind: typings.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isTokenKind(kind: typings.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isUseStrictDirective(node: ISyntaxNodeOrToken): Boolean = js.native
}

