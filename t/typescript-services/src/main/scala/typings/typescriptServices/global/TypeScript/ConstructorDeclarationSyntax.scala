package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ConstructorDeclarationSyntax")
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
object ConstructorDeclarationSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ConstructorDeclarationSyntax.create")
  @js.native
  def create(
    constructorKeyword: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax
  ): typings.typescriptServices.TypeScript.ConstructorDeclarationSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ConstructorDeclarationSyntax.create1")
  @js.native
  def create1(): typings.typescriptServices.TypeScript.ConstructorDeclarationSyntax = js.native
}
