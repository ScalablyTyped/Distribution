package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CallSignatureDeclaration
import typings.typescript.mod.NodeArray
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateCallSignature")
@js.native
object updateCallSignature extends js.Object {
  def apply(
    node: CallSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration]
  ): CallSignatureDeclaration = js.native
  def apply(
    node: CallSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
  def apply(
    node: CallSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): CallSignatureDeclaration = js.native
  def apply(
    node: CallSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
}

