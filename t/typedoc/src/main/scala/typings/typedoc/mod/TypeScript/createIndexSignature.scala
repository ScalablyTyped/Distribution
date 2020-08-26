package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.IndexSignatureDeclaration
import typings.typescript.mod.Modifier
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createIndexSignature")
@js.native
object createIndexSignature extends js.Object {
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
}

