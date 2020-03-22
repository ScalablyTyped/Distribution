package typings.typedoc.mod.TypeScript

import typings.typescript.mod.AsteriskToken
import typings.typescript.mod.Block
import typings.typescript.mod.Decorator
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.Identifier
import typings.typescript.mod.Modifier
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateFunctionDeclaration")
@js.native
object updateFunctionDeclaration extends js.Object {
  def apply(
    node: FunctionDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration]
  ): FunctionDeclaration = js.native
  def apply(
    node: FunctionDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionDeclaration = js.native
  def apply(
    node: FunctionDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionDeclaration = js.native
}

