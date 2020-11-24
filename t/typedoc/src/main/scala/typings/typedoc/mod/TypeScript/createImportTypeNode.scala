package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.ImportTypeNode
import typings.typescript.mod.QualifiedName
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createImportTypeNode")
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
