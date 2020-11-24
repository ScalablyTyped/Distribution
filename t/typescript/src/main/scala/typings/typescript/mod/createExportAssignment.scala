package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createExportAssignment")
@js.native
object createExportAssignment extends js.Object {
  
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: Boolean,
    expression: Expression
  ): ExportAssignment = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    isExportEquals: Boolean,
    expression: Expression
  ): ExportAssignment = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: Boolean,
    expression: Expression
  ): ExportAssignment = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  /** @deprecated Use `factory.createExportAssignment` or the factory supplied by your transformation context instead. */
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isExportEquals: Boolean,
    expression: Expression
  ): ExportAssignment = js.native
}
