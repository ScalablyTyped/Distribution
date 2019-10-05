package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SetAccessorSyntax")
@js.native
class SetAccessorSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.SetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typings.typescriptDashServices.TypeScript.ParameterListSyntax,
    block: typings.typescriptDashServices.TypeScript.BlockSyntax,
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
    parameterList: typings.typescriptDashServices.TypeScript.ParameterListSyntax,
    block: typings.typescriptDashServices.TypeScript.BlockSyntax
  ): typings.typescriptDashServices.TypeScript.SetAccessorSyntax = js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptDashServices.TypeScript.SetAccessorSyntax = js.native
}

