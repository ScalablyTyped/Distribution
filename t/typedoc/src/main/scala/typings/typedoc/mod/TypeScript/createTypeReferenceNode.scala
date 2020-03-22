package typings.typedoc.mod.TypeScript

import typings.typescript.mod.EntityName
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createTypeReferenceNode")
@js.native
object createTypeReferenceNode extends js.Object {
  def apply(typeName: String): TypeReferenceNode = js.native
  def apply(typeName: String, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def apply(typeName: EntityName): TypeReferenceNode = js.native
  def apply(typeName: EntityName, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
}

