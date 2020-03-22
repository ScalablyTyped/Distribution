package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.PrivateIdentifier
import typings.typescript.mod.PropertyAccessExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updatePropertyAccess")
@js.native
object updatePropertyAccess extends js.Object {
  def apply(node: PropertyAccessExpression, expression: Expression, name: Identifier): PropertyAccessExpression = js.native
  def apply(node: PropertyAccessExpression, expression: Expression, name: PrivateIdentifier): PropertyAccessExpression = js.native
}

