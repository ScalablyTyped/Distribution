package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Block
import typings.typescript.mod.Decorator
import typings.typescript.mod.Modifier
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PropertyName
import typings.typescript.mod.SetAccessorDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createSetAccessor")
@js.native
object createSetAccessor extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
}

