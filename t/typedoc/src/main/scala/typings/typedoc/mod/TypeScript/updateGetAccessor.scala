package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Block
import typings.typescript.mod.Decorator
import typings.typescript.mod.GetAccessorDeclaration
import typings.typescript.mod.Modifier
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PropertyName
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateGetAccessor")
@js.native
object updateGetAccessor extends js.Object {
  def apply(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def apply(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def apply(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
}

