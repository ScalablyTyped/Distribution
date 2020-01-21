package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeParameterSyntax")
@js.native
class TypeParameterSyntax protected () extends SyntaxNode {
  def this(identifier: ISyntaxToken, constraint: ConstraintSyntax, parsedInStrictMode: Boolean) = this()
  var constraint: ConstraintSyntax = js.native
  var identifier: ISyntaxToken = js.native
  def update(identifier: ISyntaxToken, constraint: ConstraintSyntax): TypeParameterSyntax = js.native
  def withConstraint(constraint: ConstraintSyntax): TypeParameterSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): TypeParameterSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.TypeParameterSyntax")
@js.native
object TypeParameterSyntax extends js.Object {
  def create(identifier: ISyntaxToken): TypeParameterSyntax = js.native
  def create1(identifier: ISyntaxToken): TypeParameterSyntax = js.native
}

