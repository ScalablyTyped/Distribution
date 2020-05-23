package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateImportDeclaration")
@js.native
object updateImportDeclaration extends js.Object {
  def apply(
    node: ImportDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    importClause: js.UndefOr[ImportClause],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
}

