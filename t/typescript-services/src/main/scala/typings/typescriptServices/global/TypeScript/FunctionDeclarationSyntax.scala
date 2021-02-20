package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.FunctionDeclarationSyntax")
@js.native
class FunctionDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.FunctionDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object FunctionDeclarationSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.FunctionDeclarationSyntax.create")
  @js.native
  def create(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax
  ): typings.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.FunctionDeclarationSyntax.create1")
  @js.native
  def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
}
