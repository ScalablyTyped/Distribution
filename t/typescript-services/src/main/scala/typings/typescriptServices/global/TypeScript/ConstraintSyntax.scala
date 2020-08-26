package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ConstraintSyntax")
@js.native
class ConstraintSyntax protected ()
  extends typings.typescriptServices.TypeScript.ConstraintSyntax {
  def this(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSGlobal("TypeScript.ConstraintSyntax")
@js.native
object ConstraintSyntax extends js.Object {
  def create1(`type`: ITypeSyntax): typings.typescriptServices.TypeScript.ConstraintSyntax = js.native
}

