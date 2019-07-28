package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "GetAccessorSyntax")
@js.native
class GetAccessorSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.GetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typings.typescriptDashServices.TypeScriptNs.ParameterListSyntax,
    typeAnnotation: typings.typescriptDashServices.TypeScriptNs.TypeAnnotationSyntax,
    block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax,
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
    parameterList: typings.typescriptDashServices.TypeScriptNs.ParameterListSyntax,
    block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax
  ): typings.typescriptDashServices.TypeScriptNs.GetAccessorSyntax = js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.GetAccessorSyntax = js.native
}

