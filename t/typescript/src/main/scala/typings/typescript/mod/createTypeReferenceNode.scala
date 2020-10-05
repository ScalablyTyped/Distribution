package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTypeReferenceNode")
@js.native
object createTypeReferenceNode extends js.Object {
  def apply(typeName: java.lang.String): TypeReferenceNode = js.native
  def apply(typeName: java.lang.String, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def apply(typeName: EntityName): TypeReferenceNode = js.native
  def apply(typeName: EntityName, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
}

