package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ConstructorDeclarationSyntax")
@js.native
class ConstructorDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ConstructorDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    constructorKeyword: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptDashServices.TypeScript.BlockSyntax,
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
    callSignature: typings.typescriptDashServices.TypeScript.CallSignatureSyntax
  ): typings.typescriptDashServices.TypeScript.ConstructorDeclarationSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.ConstructorDeclarationSyntax = js.native
}

