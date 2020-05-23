package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createExportAssignment")
@js.native
object createExportAssignment extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    isExportEquals: js.UndefOr[Boolean],
    expression: Expression
  ): ExportAssignment = js.native
}

