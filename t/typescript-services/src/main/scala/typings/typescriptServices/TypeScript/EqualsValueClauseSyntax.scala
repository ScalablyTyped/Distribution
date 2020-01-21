package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.EqualsValueClauseSyntax")
@js.native
class EqualsValueClauseSyntax protected () extends SyntaxNode {
  def this(equalsToken: ISyntaxToken, value: IExpressionSyntax, parsedInStrictMode: Boolean) = this()
  var equalsToken: ISyntaxToken = js.native
  var value: IExpressionSyntax = js.native
  def update(equalsToken: ISyntaxToken, value: IExpressionSyntax): EqualsValueClauseSyntax = js.native
  def withEqualsToken(equalsToken: ISyntaxToken): EqualsValueClauseSyntax = js.native
  def withValue(value: IExpressionSyntax): EqualsValueClauseSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.EqualsValueClauseSyntax")
@js.native
object EqualsValueClauseSyntax extends js.Object {
  def create1(value: IExpressionSyntax): EqualsValueClauseSyntax = js.native
}

