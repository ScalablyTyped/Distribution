package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ConstructorDeclarationSyntax")
@js.native
class ConstructorDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ConstructorDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    constructorKeyword: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScriptNs.CallSignatureSyntax,
    block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ConstructorDeclarationSyntax")
@js.native
object ConstructorDeclarationSyntax extends js.Object {
  def create(
    constructorKeyword: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScriptNs.CallSignatureSyntax
  ): typings.typescriptDashServices.TypeScriptNs.ConstructorDeclarationSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScriptNs.ConstructorDeclarationSyntax = js.native
}

