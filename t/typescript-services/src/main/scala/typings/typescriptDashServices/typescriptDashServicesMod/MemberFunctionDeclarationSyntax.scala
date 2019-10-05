package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MemberFunctionDeclarationSyntax")
@js.native
class MemberFunctionDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.MemberFunctionDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    propertyName: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptDashServices.TypeScript.BlockSyntax,
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
    callSignature: typings.typescriptDashServices.TypeScript.CallSignatureSyntax
  ): typings.typescriptDashServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptDashServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
}

