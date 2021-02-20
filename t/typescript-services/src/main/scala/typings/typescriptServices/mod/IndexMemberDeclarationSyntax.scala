package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "IndexMemberDeclarationSyntax")
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
  @JSImport("typescript-services", "IndexMemberDeclarationSyntax.create")
  @js.native
  def create(
    indexSignature: typings.typescriptServices.TypeScript.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "IndexMemberDeclarationSyntax.create1")
  @js.native
  def create1(indexSignature: typings.typescriptServices.TypeScript.IndexSignatureSyntax): typings.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
}
