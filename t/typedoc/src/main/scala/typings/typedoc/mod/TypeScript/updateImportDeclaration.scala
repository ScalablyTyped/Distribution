package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.Expression
import typings.typescript.mod.ImportClause
import typings.typescript.mod.ImportDeclaration
import typings.typescript.mod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateImportDeclaration")
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

