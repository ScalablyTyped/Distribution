package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Block
import typings.typescript.mod.ConstructorDeclaration
import typings.typescript.mod.Decorator
import typings.typescript.mod.Modifier
import typings.typescript.mod.ParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateConstructor")
@js.native
object updateConstructor extends js.Object {
  def apply(
    node: ConstructorDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def apply(
    node: ConstructorDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
}

