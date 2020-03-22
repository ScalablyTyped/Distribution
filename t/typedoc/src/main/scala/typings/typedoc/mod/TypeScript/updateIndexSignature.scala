package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.IndexSignatureDeclaration
import typings.typescript.mod.Modifier
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateIndexSignature")
@js.native
object updateIndexSignature extends js.Object {
  def apply(
    node: IndexSignatureDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def apply(
    node: IndexSignatureDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def apply(
    node: IndexSignatureDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def apply(
    node: IndexSignatureDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
}

