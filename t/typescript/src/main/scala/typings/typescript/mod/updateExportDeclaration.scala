package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateExportDeclaration")
@js.native
object updateExportDeclaration extends js.Object {
  def apply(
    node: ExportDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    exportClause: js.UndefOr[NamedExportBindings],
    moduleSpecifier: js.UndefOr[Expression],
    isTypeOnly: Boolean
  ): ExportDeclaration = js.native
}

