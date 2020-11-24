package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.QualifiedName
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createTypeReferenceNode")
@js.native
object createTypeReferenceNode extends js.Object {
  
  /** @deprecated Use `factory.createTypeReferenceNode` or the factory supplied by your transformation context instead. */
  def apply(typeName: String): TypeReferenceNode = js.native
  def apply(typeName: String, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def apply(typeName: Identifier): TypeReferenceNode = js.native
  def apply(typeName: Identifier, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def apply(typeName: QualifiedName): TypeReferenceNode = js.native
  def apply(typeName: QualifiedName, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
}
