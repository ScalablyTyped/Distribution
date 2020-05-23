package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createImportDeclaration")
@js.native
object createImportDeclaration extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    importClause: js.UndefOr[ImportClause],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
}

