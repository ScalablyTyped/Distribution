package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import typings.typescriptDashServices.TypeScriptNs.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionTypeSyntax")
@js.native
class FunctionTypeSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.FunctionTypeSyntax {
  def this(
    typeParameterList: typings.typescriptDashServices.TypeScriptNs.TypeParameterListSyntax,
    parameterList: typings.typescriptDashServices.TypeScriptNs.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "FunctionTypeSyntax")
@js.native
object FunctionTypeSyntax extends js.Object {
  def create(
    parameterList: typings.typescriptDashServices.TypeScriptNs.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typings.typescriptDashServices.TypeScriptNs.FunctionTypeSyntax = js.native
  def create1(`type`: ITypeSyntax): typings.typescriptDashServices.TypeScriptNs.FunctionTypeSyntax = js.native
}

