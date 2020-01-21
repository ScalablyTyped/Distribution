package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createGetAccessor")
@js.native
object createGetAccessor extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
}

