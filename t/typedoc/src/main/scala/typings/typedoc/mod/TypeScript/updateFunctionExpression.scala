package typings.typedoc.mod.TypeScript

import typings.typescript.mod.AsteriskToken
import typings.typescript.mod.Block
import typings.typescript.mod.FunctionExpression
import typings.typescript.mod.Identifier
import typings.typescript.mod.Modifier
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateFunctionExpression")
@js.native
object updateFunctionExpression extends js.Object {
  def apply(
    node: FunctionExpression,
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: Block
  ): FunctionExpression = js.native
}

