package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxToken
import typings.typescriptDashServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionTypeSyntax")
@js.native
class FunctionTypeSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.FunctionTypeSyntax {
  def this(
    typeParameterList: typings.typescriptDashServices.TypeScript.TypeParameterListSyntax,
    parameterList: typings.typescriptDashServices.TypeScript.ParameterListSyntax,
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
    parameterList: typings.typescriptDashServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typings.typescriptDashServices.TypeScript.FunctionTypeSyntax = js.native
  def create1(`type`: ITypeSyntax): typings.typescriptDashServices.TypeScript.FunctionTypeSyntax = js.native
}

