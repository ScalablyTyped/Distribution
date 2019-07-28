package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import typings.typescriptDashServices.TypeScriptNs.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ConstructorTypeSyntax")
@js.native
class ConstructorTypeSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ConstructorTypeSyntax {
  def this(
    newKeyword: ISyntaxToken,
    typeParameterList: typings.typescriptDashServices.TypeScriptNs.TypeParameterListSyntax,
    parameterList: typings.typescriptDashServices.TypeScriptNs.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ConstructorTypeSyntax")
@js.native
object ConstructorTypeSyntax extends js.Object {
  def create(
    newKeyword: ISyntaxToken,
    parameterList: typings.typescriptDashServices.TypeScriptNs.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typings.typescriptDashServices.TypeScriptNs.ConstructorTypeSyntax = js.native
  def create1(`type`: ITypeSyntax): typings.typescriptDashServices.TypeScriptNs.ConstructorTypeSyntax = js.native
}

