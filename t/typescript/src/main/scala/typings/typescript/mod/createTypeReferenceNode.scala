package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTypeReferenceNode")
@js.native
object createTypeReferenceNode extends js.Object {
  
  /** @deprecated Use `factory.createTypeReferenceNode` or the factory supplied by your transformation context instead. */
  def apply(typeName: java.lang.String): TypeReferenceNode = js.native
  def apply(typeName: java.lang.String, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def apply(typeName: Identifier): TypeReferenceNode = js.native
  def apply(typeName: Identifier, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def apply(typeName: QualifiedName): TypeReferenceNode = js.native
  def apply(typeName: QualifiedName, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
}
