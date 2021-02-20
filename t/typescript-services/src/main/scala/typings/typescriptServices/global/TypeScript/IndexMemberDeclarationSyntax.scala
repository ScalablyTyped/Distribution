package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.IndexMemberDeclarationSyntax")
@js.native
class IndexMemberDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.IndexMemberDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    indexSignature: typings.typescriptServices.TypeScript.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object IndexMemberDeclarationSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.IndexMemberDeclarationSyntax.create")
  @js.native
  def create(
    indexSignature: typings.typescriptServices.TypeScript.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.IndexMemberDeclarationSyntax.create1")
  @js.native
  def create1(indexSignature: typings.typescriptServices.TypeScript.IndexSignatureSyntax): typings.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
}
