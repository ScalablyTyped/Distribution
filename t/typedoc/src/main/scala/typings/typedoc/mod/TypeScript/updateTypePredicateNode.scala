package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.ThisTypeNode
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypePredicateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateTypePredicateNode")
@js.native
object updateTypePredicateNode extends js.Object {
  def apply(node: TypePredicateNode, parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def apply(node: TypePredicateNode, parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
}

