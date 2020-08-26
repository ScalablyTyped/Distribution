package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ConstructorDeclarationSyntax")
@js.native
class ConstructorDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.ConstructorDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    constructorKeyword: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
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
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax
  ): typings.typescriptServices.TypeScript.ConstructorDeclarationSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.ConstructorDeclarationSyntax = js.native
}

