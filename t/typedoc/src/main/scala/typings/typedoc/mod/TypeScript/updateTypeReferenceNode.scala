package typings.typedoc.mod.TypeScript

import typings.typescript.mod.EntityName
import typings.typescript.mod.NodeArray
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateTypeReferenceNode")
@js.native
object updateTypeReferenceNode extends js.Object {
  def apply(node: TypeReferenceNode, typeName: EntityName): TypeReferenceNode = js.native
  def apply(node: TypeReferenceNode, typeName: EntityName, typeArguments: NodeArray[TypeNode]): TypeReferenceNode = js.native
}

