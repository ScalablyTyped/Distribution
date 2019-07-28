package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "IndexSignatureSyntax")
@js.native
class IndexSignatureSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.IndexSignatureSyntax {
  def this(
    openBracketToken: ISyntaxToken,
    parameter: typings.typescriptDashServices.TypeScriptNs.ParameterSyntax,
    closeBracketToken: ISyntaxToken,
    typeAnnotation: typings.typescriptDashServices.TypeScriptNs.TypeAnnotationSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "IndexSignatureSyntax")
@js.native
object IndexSignatureSyntax extends js.Object {
  def create(
    openBracketToken: ISyntaxToken,
    parameter: typings.typescriptDashServices.TypeScriptNs.ParameterSyntax,
    closeBracketToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScriptNs.IndexSignatureSyntax = js.native
  def create1(parameter: typings.typescriptDashServices.TypeScriptNs.ParameterSyntax): typings.typescriptDashServices.TypeScriptNs.IndexSignatureSyntax = js.native
}

