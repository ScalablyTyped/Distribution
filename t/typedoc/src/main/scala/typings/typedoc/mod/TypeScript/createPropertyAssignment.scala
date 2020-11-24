package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ComputedPropertyName
import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.NumericLiteral
import typings.typescript.mod.PrivateIdentifier
import typings.typescript.mod.PropertyAssignment
import typings.typescript.mod.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createPropertyAssignment")
@js.native
object createPropertyAssignment extends js.Object {
  
  /** @deprecated Use `factory.createPropertyAssignment` or the factory supplied by your transformation context instead. */
  def apply(name: String, initializer: Expression): PropertyAssignment = js.native
  def apply(name: ComputedPropertyName, initializer: Expression): PropertyAssignment = js.native
  def apply(name: Identifier, initializer: Expression): PropertyAssignment = js.native
  def apply(name: NumericLiteral, initializer: Expression): PropertyAssignment = js.native
  def apply(name: PrivateIdentifier, initializer: Expression): PropertyAssignment = js.native
  def apply(name: StringLiteral, initializer: Expression): PropertyAssignment = js.native
}
