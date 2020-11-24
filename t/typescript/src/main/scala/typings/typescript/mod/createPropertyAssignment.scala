package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createPropertyAssignment")
@js.native
object createPropertyAssignment extends js.Object {
  
  /** @deprecated Use `factory.createPropertyAssignment` or the factory supplied by your transformation context instead. */
  def apply(name: java.lang.String, initializer: Expression): PropertyAssignment = js.native
  def apply(name: ComputedPropertyName, initializer: Expression): PropertyAssignment = js.native
  def apply(name: Identifier, initializer: Expression): PropertyAssignment = js.native
  def apply(name: NumericLiteral, initializer: Expression): PropertyAssignment = js.native
  def apply(name: PrivateIdentifier, initializer: Expression): PropertyAssignment = js.native
  def apply(name: StringLiteral, initializer: Expression): PropertyAssignment = js.native
}
