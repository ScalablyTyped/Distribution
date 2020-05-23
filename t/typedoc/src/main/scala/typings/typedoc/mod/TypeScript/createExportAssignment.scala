package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.ExportAssignment
import typings.typescript.mod.Expression
import typings.typescript.mod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createExportAssignment")
@js.native
object createExportAssignment extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    isExportEquals: js.UndefOr[Boolean],
    expression: Expression
  ): ExportAssignment = js.native
}

