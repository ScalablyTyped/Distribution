package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParameterListSyntax")
@js.native
class ParameterListSyntax protected () extends SyntaxNode {
  def this(openParenToken: ISyntaxToken, parameters: ISeparatedSyntaxList, closeParenToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var closeParenToken: ISyntaxToken = js.native
  var openParenToken: ISyntaxToken = js.native
  var parameters: ISeparatedSyntaxList = js.native
  def update(openParenToken: ISyntaxToken, parameters: ISeparatedSyntaxList, closeParenToken: ISyntaxToken): ParameterListSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): ParameterListSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): ParameterListSyntax = js.native
  def withParameter(parameter: ParameterSyntax): ParameterListSyntax = js.native
  def withParameters(parameters: ISeparatedSyntaxList): ParameterListSyntax = js.native
}

@JSGlobal("TypeScript.ParameterListSyntax")
@js.native
object ParameterListSyntax extends js.Object {
  def create(
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax = js.native
  def create1(): typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax = js.native
}

