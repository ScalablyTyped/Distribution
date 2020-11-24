package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TypeParameterSyntax")
@js.native
class TypeParameterSyntax protected ()
  extends typings.typescriptServices.TypeScript.TypeParameterSyntax {
  def this(
    identifier: ISyntaxToken,
    constraint: typings.typescriptServices.TypeScript.ConstraintSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSImport("typescript-services", "TypeParameterSyntax")
@js.native
object TypeParameterSyntax extends js.Object {
  
  def create(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.TypeParameterSyntax = js.native
  
  def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.TypeParameterSyntax = js.native
}
