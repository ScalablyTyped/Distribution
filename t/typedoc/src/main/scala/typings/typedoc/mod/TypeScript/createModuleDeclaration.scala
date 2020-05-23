package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.Modifier
import typings.typescript.mod.ModuleBody
import typings.typescript.mod.ModuleDeclaration
import typings.typescript.mod.ModuleName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createModuleDeclaration")
@js.native
object createModuleDeclaration extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: ModuleName
  ): ModuleDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: ModuleName,
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: ModuleName,
    body: ModuleBody,
    flags: typings.typescript.mod.NodeFlags
  ): ModuleDeclaration = js.native
}

