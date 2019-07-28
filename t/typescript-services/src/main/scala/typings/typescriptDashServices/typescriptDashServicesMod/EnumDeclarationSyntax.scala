package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "EnumDeclarationSyntax")
@js.native
class EnumDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.EnumDeclarationSyntax {
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
  ): typings.typescriptDashServices.TypeScriptNs.EnumDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.EnumDeclarationSyntax = js.native
}

