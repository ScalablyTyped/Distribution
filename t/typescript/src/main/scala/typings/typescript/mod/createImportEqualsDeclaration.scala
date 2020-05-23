package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createImportEqualsDeclaration")
@js.native
object createImportEqualsDeclaration extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
}

