package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createConstructor")
@js.native
object createConstructor extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
}

