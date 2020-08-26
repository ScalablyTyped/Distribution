package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createImportTypeNode")
@js.native
object createImportTypeNode extends js.Object {
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
  def apply(argument: TypeNode, qualifier: EntityName): ImportTypeNode = js.native
  def apply(
    argument: TypeNode,
    qualifier: EntityName,
    typeArguments: js.UndefOr[scala.Nothing],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def apply(argument: TypeNode, qualifier: EntityName, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def apply(argument: TypeNode, qualifier: EntityName, typeArguments: js.Array[TypeNode], isTypeOf: Boolean): ImportTypeNode = js.native
}

