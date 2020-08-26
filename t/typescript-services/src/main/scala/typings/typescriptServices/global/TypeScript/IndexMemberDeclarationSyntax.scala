package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.IndexMemberDeclarationSyntax")
@js.native
class IndexMemberDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.IndexMemberDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    indexSignature: typings.typescriptServices.TypeScript.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.IndexMemberDeclarationSyntax")
@js.native
object IndexMemberDeclarationSyntax extends js.Object {
  def create(
    indexSignature: typings.typescriptServices.TypeScript.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
  def create1(indexSignature: typings.typescriptServices.TypeScript.IndexSignatureSyntax): typings.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
}

