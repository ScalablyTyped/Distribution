package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createPropertyAccess")
@js.native
object createPropertyAccess extends js.Object {
  
  /** @deprecated Use `factory.createPropertyAccess` or the factory supplied by your transformation context instead. */
  def apply(expression: Expression, name: java.lang.String): PropertyAccessExpression = js.native
  def apply(expression: Expression, name: Identifier): PropertyAccessExpression = js.native
  def apply(expression: Expression, name: PrivateIdentifier): PropertyAccessExpression = js.native
}
