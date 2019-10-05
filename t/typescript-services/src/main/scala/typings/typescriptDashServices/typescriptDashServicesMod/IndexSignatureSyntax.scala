package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "IndexSignatureSyntax")
@js.native
class IndexSignatureSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.IndexSignatureSyntax {
  def this(
    openBracketToken: ISyntaxToken,
    parameter: typings.typescriptDashServices.TypeScript.ParameterSyntax,
    closeBracketToken: ISyntaxToken,
    typeAnnotation: typings.typescriptDashServices.TypeScript.TypeAnnotationSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "IndexSignatureSyntax")
@js.native
object IndexSignatureSyntax extends js.Object {
  def create(
    openBracketToken: ISyntaxToken,
    parameter: typings.typescriptDashServices.TypeScript.ParameterSyntax,
    closeBracketToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScript.IndexSignatureSyntax = js.native
  def create1(parameter: typings.typescriptDashServices.TypeScript.ParameterSyntax): typings.typescriptDashServices.TypeScript.IndexSignatureSyntax = js.native
}

