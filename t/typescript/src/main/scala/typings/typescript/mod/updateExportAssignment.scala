package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateExportAssignment")
@js.native
object updateExportAssignment extends js.Object {
  
  def apply(
    node: ExportAssignment,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  def apply(
    node: ExportAssignment,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    expression: Expression
  ): ExportAssignment = js.native
  def apply(
    node: ExportAssignment,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  /** @deprecated Use `factory.updateExportAssignment` or the factory supplied by your transformation context instead. */
  def apply(
    node: ExportAssignment,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    expression: Expression
  ): ExportAssignment = js.native
}
