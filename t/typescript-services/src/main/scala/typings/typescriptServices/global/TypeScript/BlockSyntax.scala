package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.BlockSyntax")
@js.native
class BlockSyntax protected ()
  extends typings.typescriptServices.TypeScript.BlockSyntax {
  def this(
    openBraceToken: ISyntaxToken,
    statements: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object BlockSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.BlockSyntax.create")
  @js.native
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typings.typescriptServices.TypeScript.BlockSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.BlockSyntax.create1")
  @js.native
  def create1(): typings.typescriptServices.TypeScript.BlockSyntax = js.native
}
