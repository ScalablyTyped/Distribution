package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.INameSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "QualifiedNameSyntax")
@js.native
class QualifiedNameSyntax protected ()
  extends typings.typescriptServices.TypeScript.QualifiedNameSyntax {
  def this(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken, parsedInStrictMode: Boolean) = this()
}
object QualifiedNameSyntax {
  
  /* static member */
  @JSImport("typescript-services", "QualifiedNameSyntax.create1")
  @js.native
  def create1(left: INameSyntax, right: ISyntaxToken): typings.typescriptServices.TypeScript.QualifiedNameSyntax = js.native
}
