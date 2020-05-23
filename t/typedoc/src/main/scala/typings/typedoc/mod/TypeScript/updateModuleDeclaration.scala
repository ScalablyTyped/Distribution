package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.Modifier
import typings.typescript.mod.ModuleBody
import typings.typescript.mod.ModuleDeclaration
import typings.typescript.mod.ModuleName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateModuleDeclaration")
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

