package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CatchClauseSyntax")
@js.native
class CatchClauseSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.CatchClauseSyntax {
  def this(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    typeAnnotation: typings.typescriptDashServices.TypeScript.TypeAnnotationSyntax,
    closeParenToken: ISyntaxToken,
    block: typings.typescriptDashServices.TypeScript.BlockSyntax,
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
    block: typings.typescriptDashServices.TypeScript.BlockSyntax
  ): typings.typescriptDashServices.TypeScript.CatchClauseSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScript.CatchClauseSyntax = js.native
}

