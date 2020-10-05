package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTypePredicateNode")
@js.native
object createTypePredicateNode extends js.Object {
  def apply(parameterName: java.lang.String, `type`: TypeNode): TypePredicateNode = js.native
  def apply(parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def apply(parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
}

