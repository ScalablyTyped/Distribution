package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.Identifier
import typings.typescript.mod.ImportEqualsDeclaration
import typings.typescript.mod.Modifier
import typings.typescript.mod.ModuleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateImportEqualsDeclaration")
@js.native
object updateImportEqualsDeclaration extends js.Object {
  def apply(
    node: ImportEqualsDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
}

