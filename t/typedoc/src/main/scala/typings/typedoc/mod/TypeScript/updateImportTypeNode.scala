package typings.typedoc.mod.TypeScript

import typings.typescript.mod.EntityName
import typings.typescript.mod.ImportTypeNode
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateImportTypeNode")
@js.native
object updateImportTypeNode extends js.Object {
  def apply(node: ImportTypeNode, argument: TypeNode): ImportTypeNode = js.native
  def apply(node: ImportTypeNode, argument: TypeNode, qualifier: EntityName): ImportTypeNode = js.native
  def apply(node: ImportTypeNode, argument: TypeNode, qualifier: EntityName, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def apply(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: EntityName,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
}

