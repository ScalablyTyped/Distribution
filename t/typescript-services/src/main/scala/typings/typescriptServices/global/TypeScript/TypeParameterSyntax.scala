package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeParameterSyntax")
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
@JSGlobal("TypeScript.TypeParameterSyntax")
@js.native
object TypeParameterSyntax extends js.Object {
  def create(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.TypeParameterSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.TypeParameterSyntax = js.native
}

