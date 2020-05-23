package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.ExportDeclaration
import typings.typescript.mod.Expression
import typings.typescript.mod.Modifier
import typings.typescript.mod.NamedExportBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateExportDeclaration")
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

