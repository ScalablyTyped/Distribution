package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.MemberFunctionDeclarationSyntax")
@js.native
class MemberFunctionDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    propertyName: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object MemberFunctionDeclarationSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.MemberFunctionDeclarationSyntax.create")
  @js.native
  def create(
    propertyName: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax
  ): typings.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.MemberFunctionDeclarationSyntax.create1")
  @js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
}
