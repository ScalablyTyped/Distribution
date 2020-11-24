package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createIndexSignature")
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
  /** @deprecated Use `factory.createIndexSignature` or the factory supplied by your transformation context instead. */
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
}
