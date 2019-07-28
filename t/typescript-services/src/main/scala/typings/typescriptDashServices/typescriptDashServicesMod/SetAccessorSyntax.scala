package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SetAccessorSyntax")
@js.native
class SetAccessorSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.SetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typings.typescriptDashServices.TypeScriptNs.ParameterListSyntax,
    block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SetAccessorSyntax")
@js.native
object SetAccessorSyntax extends js.Object {
  def create(
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typings.typescriptDashServices.TypeScriptNs.ParameterListSyntax,
    block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax
  ): typings.typescriptDashServices.TypeScriptNs.SetAccessorSyntax = js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.SetAccessorSyntax = js.native
}

