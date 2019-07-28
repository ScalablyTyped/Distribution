package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ParameterSyntax")
@js.native
class ParameterSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ParameterSyntax {
  def this(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: typings.typescriptDashServices.TypeScriptNs.TypeAnnotationSyntax,
    equalsValueClause: typings.typescriptDashServices.TypeScriptNs.EqualsValueClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ParameterSyntax")
@js.native
object ParameterSyntax extends js.Object {
  def create(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.ParameterSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.ParameterSyntax = js.native
}

