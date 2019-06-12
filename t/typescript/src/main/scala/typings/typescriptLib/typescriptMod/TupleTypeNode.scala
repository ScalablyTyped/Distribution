package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TupleTypeNode extends TypeNode {
  var elementTypes: NodeArray[TypeNode] = js.native
  @JSName("kind")
  var kind_TupleTypeNode: typescriptLib.typescriptMod.SyntaxKind.TupleType = js.native
}

