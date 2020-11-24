package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateTypeReferenceNode")
@js.native
object updateTypeReferenceNode extends js.Object {
  
  /** @deprecated Use `factory.updateTypeReferenceNode` or the factory supplied by your transformation context instead. */
  def apply(node: TypeReferenceNode, typeName: EntityName): TypeReferenceNode = js.native
  def apply(node: TypeReferenceNode, typeName: EntityName, typeArguments: NodeArray[TypeNode]): TypeReferenceNode = js.native
}
