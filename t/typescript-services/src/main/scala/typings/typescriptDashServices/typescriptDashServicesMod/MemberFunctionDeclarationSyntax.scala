package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MemberFunctionDeclarationSyntax")
@js.native
class MemberFunctionDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.MemberFunctionDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    propertyName: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScriptNs.CallSignatureSyntax,
    block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "MemberFunctionDeclarationSyntax")
@js.native
object MemberFunctionDeclarationSyntax extends js.Object {
  def create(
    propertyName: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScriptNs.CallSignatureSyntax
  ): typings.typescriptDashServices.TypeScriptNs.MemberFunctionDeclarationSyntax = js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.MemberFunctionDeclarationSyntax = js.native
}

