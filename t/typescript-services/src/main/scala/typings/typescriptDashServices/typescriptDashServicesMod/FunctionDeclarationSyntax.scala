package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionDeclarationSyntax")
@js.native
class FunctionDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.FunctionDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScriptNs.CallSignatureSyntax,
    block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax,
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
    callSignature: typings.typescriptDashServices.TypeScriptNs.CallSignatureSyntax
  ): typings.typescriptDashServices.TypeScriptNs.FunctionDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.FunctionDeclarationSyntax = js.native
}

