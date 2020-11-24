package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.MethodSignatureSyntax")
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
/* static members */
@JSGlobal("TypeScript.MethodSignatureSyntax")
@js.native
object MethodSignatureSyntax extends js.Object {
  
  def create(
    propertyName: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax
  ): typings.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
  
  def create1(propertyName: ISyntaxToken): typings.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
}
