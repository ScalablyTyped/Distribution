package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ArrowFunction
import typings.typescript.mod.ConciseBody
import typings.typescript.mod.EqualsGreaterThanToken
import typings.typescript.mod.Modifier
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createArrowFunction")
@js.native
object createArrowFunction extends js.Object {
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    equalsGreaterThanToken: js.UndefOr[EqualsGreaterThanToken],
    body: ConciseBody
  ): ArrowFunction = js.native
}

