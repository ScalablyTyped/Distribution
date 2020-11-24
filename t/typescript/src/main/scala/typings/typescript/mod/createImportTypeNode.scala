package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createImportTypeNode")
@js.native
object createImportTypeNode extends js.Object {
  
  /** @deprecated Use `factory.createImportTypeNode` or the factory supplied by your transformation context instead. */
  def apply(argument: TypeNode): ImportTypeNode = js.native
  def apply(
    argument: TypeNode,
    qualifier: js.UndefOr[scala.Nothing],
    typeArguments: js.UndefOr[scala.Nothing],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def apply(argument: TypeNode, qualifier: js.UndefOr[scala.Nothing], typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def apply(
    argument: TypeNode,
    qualifier: js.UndefOr[scala.Nothing],
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def apply(argument: TypeNode, qualifier: Identifier): ImportTypeNode = js.native
  def apply(
    argument: TypeNode,
    qualifier: Identifier,
    typeArguments: js.UndefOr[scala.Nothing],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def apply(argument: TypeNode, qualifier: Identifier, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def apply(argument: TypeNode, qualifier: Identifier, typeArguments: js.Array[TypeNode], isTypeOf: Boolean): ImportTypeNode = js.native
  def apply(argument: TypeNode, qualifier: QualifiedName): ImportTypeNode = js.native
  def apply(
    argument: TypeNode,
    qualifier: QualifiedName,
    typeArguments: js.UndefOr[scala.Nothing],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def apply(argument: TypeNode, qualifier: QualifiedName, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def apply(argument: TypeNode, qualifier: QualifiedName, typeArguments: js.Array[TypeNode], isTypeOf: Boolean): ImportTypeNode = js.native
}
