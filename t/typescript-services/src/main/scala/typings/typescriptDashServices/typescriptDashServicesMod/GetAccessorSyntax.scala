package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "GetAccessorSyntax")
@js.native
class GetAccessorSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.GetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typings.typescriptDashServices.TypeScript.ParameterListSyntax,
    typeAnnotation: typings.typescriptDashServices.TypeScript.TypeAnnotationSyntax,
    block: typings.typescriptDashServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "GetAccessorSyntax")
@js.native
object GetAccessorSyntax extends js.Object {
  def create(
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typings.typescriptDashServices.TypeScript.ParameterListSyntax,
    block: typings.typescriptDashServices.TypeScript.BlockSyntax
  ): typings.typescriptDashServices.TypeScript.GetAccessorSyntax = js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptDashServices.TypeScript.GetAccessorSyntax = js.native
}

