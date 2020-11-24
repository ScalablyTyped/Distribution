package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateCallSignature")
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
  /** @deprecated Use `factory.updateCallSignature` or the factory supplied by your transformation context instead. */
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
