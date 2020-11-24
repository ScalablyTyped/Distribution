package typings.typedoc.mod.TypeScript

import typings.typescript.mod.NamedTupleMember
import typings.typescript.mod.TupleTypeNode
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createTupleTypeNode")
@js.native
object createTupleTypeNode extends js.Object {
  
  /** @deprecated Use `factory.createTupleTypeNode` or the factory supplied by your transformation context instead. */
  def apply(elements: js.Array[TypeNode | NamedTupleMember]): TupleTypeNode = js.native
}
