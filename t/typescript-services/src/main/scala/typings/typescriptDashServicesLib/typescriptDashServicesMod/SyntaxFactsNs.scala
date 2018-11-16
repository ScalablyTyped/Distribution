package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxFacts")
@js.native
object SyntaxFactsNs extends js.Object {
  def getBinaryExpressionFromOperatorToken(tokenKind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): typescriptDashServicesLib.TypeScriptNs.SyntaxKind = js.native
  def getOperatorTokenFromBinaryExpression(tokenKind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): typescriptDashServicesLib.TypeScriptNs.SyntaxKind = js.native
  def getPostfixUnaryExpressionFromOperatorToken(tokenKind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): typescriptDashServicesLib.TypeScriptNs.SyntaxKind = js.native
  def getPrefixUnaryExpressionFromOperatorToken(tokenKind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): typescriptDashServicesLib.TypeScriptNs.SyntaxKind = js.native
  def getText(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): java.lang.String = js.native
  def getTokenKind(text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.SyntaxKind = js.native
  def isAnyDivideOrRegularExpressionToken(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean = js.native
  def isAnyDivideToken(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean = js.native
  def isAnyKeyword(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean = js.native
  def isAnyPunctuation(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean = js.native
  def isBinaryExpressionOperatorToken(tokenKind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean = js.native
  def isDirectivePrologueElement(node: typescriptDashServicesLib.TypeScriptNs.ISyntaxNodeOrToken): scala.Boolean = js.native
  def isFutureReservedKeyword(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean = js.native
  def isFutureReservedStrictKeyword(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean = js.native
  def isIdentifierNameOrAnyKeyword(token: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): scala.Boolean = js.native
  def isPrefixUnaryExpressionOperatorToken(tokenKind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean = js.native
  def isStandardKeyword(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean = js.native
  def isTokenKind(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean = js.native
  def isUseStrictDirective(node: typescriptDashServicesLib.TypeScriptNs.ISyntaxNodeOrToken): scala.Boolean = js.native
}

