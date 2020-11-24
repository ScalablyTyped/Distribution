package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createStringLiteralFromNode")
@js.native
object createStringLiteralFromNode extends js.Object {
  
  /** @deprecated Use `factory.createStringLiteralFromNode` or the factory supplied by your transformation context instead. */
  def apply(sourceNode: Identifier): StringLiteral = js.native
  def apply(sourceNode: Identifier, isSingleQuote: Boolean): StringLiteral = js.native
  def apply(sourceNode: NoSubstitutionTemplateLiteral): StringLiteral = js.native
  def apply(sourceNode: NoSubstitutionTemplateLiteral, isSingleQuote: Boolean): StringLiteral = js.native
  def apply(sourceNode: NumericLiteral): StringLiteral = js.native
  def apply(sourceNode: NumericLiteral, isSingleQuote: Boolean): StringLiteral = js.native
  def apply(sourceNode: StringLiteral): StringLiteral = js.native
  def apply(sourceNode: StringLiteral, isSingleQuote: Boolean): StringLiteral = js.native
}
