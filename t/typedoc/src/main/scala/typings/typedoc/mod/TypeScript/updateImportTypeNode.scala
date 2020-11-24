package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.ImportTypeNode
import typings.typescript.mod.QualifiedName
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateImportTypeNode")
@js.native
object updateImportTypeNode extends js.Object {
  
  /** @deprecated Use `factory.updateImportTypeNode` or the factory supplied by your transformation context instead. */
  def apply(node: ImportTypeNode, argument: TypeNode): ImportTypeNode = js.native
  def apply(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: js.UndefOr[scala.Nothing],
    typeArguments: js.UndefOr[scala.Nothing],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def apply(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: js.UndefOr[scala.Nothing],
    typeArguments: js.Array[TypeNode]
  ): ImportTypeNode = js.native
  def apply(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: js.UndefOr[scala.Nothing],
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def apply(node: ImportTypeNode, argument: TypeNode, qualifier: Identifier): ImportTypeNode = js.native
  def apply(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: Identifier,
    typeArguments: js.UndefOr[scala.Nothing],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def apply(node: ImportTypeNode, argument: TypeNode, qualifier: Identifier, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def apply(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: Identifier,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def apply(node: ImportTypeNode, argument: TypeNode, qualifier: QualifiedName): ImportTypeNode = js.native
  def apply(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: QualifiedName,
    typeArguments: js.UndefOr[scala.Nothing],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def apply(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: QualifiedName,
    typeArguments: js.Array[TypeNode]
  ): ImportTypeNode = js.native
  def apply(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: QualifiedName,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
}
