package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CatchClauseSyntax")
@js.native
class CatchClauseSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.CatchClauseSyntax {
  def this(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    typeAnnotation: typings.typescriptDashServices.TypeScriptNs.TypeAnnotationSyntax,
    closeParenToken: ISyntaxToken,
    block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "CatchClauseSyntax")
@js.native
object CatchClauseSyntax extends js.Object {
  def create(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    closeParenToken: ISyntaxToken,
    block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax
  ): typings.typescriptDashServices.TypeScriptNs.CatchClauseSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.CatchClauseSyntax = js.native
}

