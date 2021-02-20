package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "MethodSignatureSyntax")
@js.native
class MethodSignatureSyntax protected ()
  extends typings.typescriptServices.TypeScript.MethodSignatureSyntax {
  def this(
    propertyName: ISyntaxToken,
    questionToken: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object MethodSignatureSyntax {
  
  /* static member */
  @JSImport("typescript-services", "MethodSignatureSyntax.create")
  @js.native
  def create(
    propertyName: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax
  ): typings.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "MethodSignatureSyntax.create1")
  @js.native
  def create1(propertyName: ISyntaxToken): typings.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
}
