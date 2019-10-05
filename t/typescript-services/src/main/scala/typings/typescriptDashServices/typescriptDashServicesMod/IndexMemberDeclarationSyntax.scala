package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "IndexMemberDeclarationSyntax")
@js.native
class IndexMemberDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.IndexMemberDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    indexSignature: typings.typescriptDashServices.TypeScript.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "IndexMemberDeclarationSyntax")
@js.native
object IndexMemberDeclarationSyntax extends js.Object {
  def create(
    indexSignature: typings.typescriptDashServices.TypeScript.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScript.IndexMemberDeclarationSyntax = js.native
  def create1(indexSignature: typings.typescriptDashServices.TypeScript.IndexSignatureSyntax): typings.typescriptDashServices.TypeScript.IndexMemberDeclarationSyntax = js.native
}

