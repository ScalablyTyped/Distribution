package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ParameterSyntax")
@js.native
class ParameterSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ParameterSyntax {
  def this(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: typings.typescriptDashServices.TypeScript.TypeAnnotationSyntax,
    equalsValueClause: typings.typescriptDashServices.TypeScript.EqualsValueClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ParameterSyntax")
@js.native
object ParameterSyntax extends js.Object {
  def create(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScript.ParameterSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScript.ParameterSyntax = js.native
}

