package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxNodeOrToken
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxFacts")
@js.native
object SyntaxFactsNs extends js.Object {
  def getBinaryExpressionFromOperatorToken(tokenKind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): typings.typescriptDashServices.TypeScriptNs.SyntaxKind = js.native
  def getOperatorTokenFromBinaryExpression(tokenKind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): typings.typescriptDashServices.TypeScriptNs.SyntaxKind = js.native
  def getPostfixUnaryExpressionFromOperatorToken(tokenKind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): typings.typescriptDashServices.TypeScriptNs.SyntaxKind = js.native
  def getPrefixUnaryExpressionFromOperatorToken(tokenKind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): typings.typescriptDashServices.TypeScriptNs.SyntaxKind = js.native
  def getText(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): String = js.native
  def getTokenKind(text: String): typings.typescriptDashServices.TypeScriptNs.SyntaxKind = js.native
  def isAnyDivideOrRegularExpressionToken(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): Boolean = js.native
  def isAnyDivideToken(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): Boolean = js.native
  def isAnyKeyword(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): Boolean = js.native
  def isAnyPunctuation(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): Boolean = js.native
  def isBinaryExpressionOperatorToken(tokenKind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): Boolean = js.native
  def isDirectivePrologueElement(node: ISyntaxNodeOrToken): Boolean = js.native
  def isFutureReservedKeyword(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): Boolean = js.native
  def isFutureReservedStrictKeyword(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): Boolean = js.native
  def isIdentifierNameOrAnyKeyword(token: ISyntaxToken): Boolean = js.native
  def isPrefixUnaryExpressionOperatorToken(tokenKind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): Boolean = js.native
  def isStandardKeyword(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): Boolean = js.native
  def isTokenKind(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): Boolean = js.native
  def isUseStrictDirective(node: ISyntaxNodeOrToken): Boolean = js.native
}

