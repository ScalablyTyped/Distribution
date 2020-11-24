package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TupleTypeNode extends TypeNode {
  
  val elements: NodeArray[TypeNode | NamedTupleMember] = js.native
  
  @JSName("kind")
  val kind_TupleTypeNode: typings.typescript.mod.SyntaxKind.TupleType = js.native
}
