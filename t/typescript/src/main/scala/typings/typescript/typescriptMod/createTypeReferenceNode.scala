package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createTypeReferenceNode")
@js.native
object createTypeReferenceNode extends js.Object {
  def apply(typeName: String): TypeReferenceNode = js.native
  def apply(typeName: String, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def apply(typeName: EntityName): TypeReferenceNode = js.native
  def apply(typeName: EntityName, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
}

