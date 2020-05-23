package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EqualsValueClauseSyntax extends SyntaxNode {
  var equalsToken: ISyntaxToken = js.native
  var value: IExpressionSyntax = js.native
  def update(equalsToken: ISyntaxToken, value: IExpressionSyntax): EqualsValueClauseSyntax = js.native
  def withEqualsToken(equalsToken: ISyntaxToken): EqualsValueClauseSyntax = js.native
  def withValue(value: IExpressionSyntax): EqualsValueClauseSyntax = js.native
}

