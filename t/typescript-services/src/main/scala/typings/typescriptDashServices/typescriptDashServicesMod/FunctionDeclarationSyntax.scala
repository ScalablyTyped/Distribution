package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionDeclarationSyntax")
@js.native
class FunctionDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.FunctionDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptDashServices.TypeScript.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "FunctionDeclarationSyntax")
@js.native
object FunctionDeclarationSyntax extends js.Object {
  def create(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScript.CallSignatureSyntax
  ): typings.typescriptDashServices.TypeScript.FunctionDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScript.FunctionDeclarationSyntax = js.native
}

