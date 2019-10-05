package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxToken
import typings.typescriptDashServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ConstructorTypeSyntax")
@js.native
class ConstructorTypeSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ConstructorTypeSyntax {
  def this(
    newKeyword: ISyntaxToken,
    typeParameterList: typings.typescriptDashServices.TypeScript.TypeParameterListSyntax,
    parameterList: typings.typescriptDashServices.TypeScript.ParameterListSyntax,
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
    parameterList: typings.typescriptDashServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typings.typescriptDashServices.TypeScript.ConstructorTypeSyntax = js.native
  def create1(`type`: ITypeSyntax): typings.typescriptDashServices.TypeScript.ConstructorTypeSyntax = js.native
}

