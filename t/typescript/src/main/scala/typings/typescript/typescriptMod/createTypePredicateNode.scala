package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createTypePredicateNode")
@js.native
object createTypePredicateNode extends js.Object {
  def apply(parameterName: String, `type`: TypeNode): TypePredicateNode = js.native
  def apply(parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def apply(parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
}

