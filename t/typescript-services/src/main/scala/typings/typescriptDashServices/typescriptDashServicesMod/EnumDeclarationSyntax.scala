package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "EnumDeclarationSyntax")
@js.native
class EnumDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.EnumDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    enumElements: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "EnumDeclarationSyntax")
@js.native
object EnumDeclarationSyntax extends js.Object {
  def create(
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScript.EnumDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScript.EnumDeclarationSyntax = js.native
}

