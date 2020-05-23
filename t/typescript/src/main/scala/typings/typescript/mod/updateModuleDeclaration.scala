package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateModuleDeclaration")
@js.native
object updateModuleDeclaration extends js.Object {
  def apply(
    node: ModuleDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: ModuleName
  ): ModuleDeclaration = js.native
  def apply(
    node: ModuleDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: ModuleName,
    body: ModuleBody
  ): ModuleDeclaration = js.native
}

