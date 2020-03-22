package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.ExportAssignment
import typings.typescript.mod.Expression
import typings.typescript.mod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateExportAssignment")
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
  def apply(
    node: ExportAssignment,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    expression: Expression
  ): ExportAssignment = js.native
}

