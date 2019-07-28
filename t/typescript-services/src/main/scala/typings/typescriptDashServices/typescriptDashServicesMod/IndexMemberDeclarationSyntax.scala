package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "IndexMemberDeclarationSyntax")
@js.native
class IndexMemberDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.IndexMemberDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    indexSignature: typings.typescriptDashServices.TypeScriptNs.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "IndexMemberDeclarationSyntax")
@js.native
object IndexMemberDeclarationSyntax extends js.Object {
  def create(
    indexSignature: typings.typescriptDashServices.TypeScriptNs.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScriptNs.IndexMemberDeclarationSyntax = js.native
  def create1(indexSignature: typings.typescriptDashServices.TypeScriptNs.IndexSignatureSyntax): typings.typescriptDashServices.TypeScriptNs.IndexMemberDeclarationSyntax = js.native
}

