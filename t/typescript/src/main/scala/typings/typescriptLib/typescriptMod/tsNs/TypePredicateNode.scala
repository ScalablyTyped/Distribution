package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypePredicateNode
  extends TypeNode
     with HasType {
  var parameterName: Identifier | ThisTypeNode = js.native
  @JSName("parent")
  var parent_TypePredicateNode: SignatureDeclaration | JSDocTypeExpression = js.native
  var `type`: TypeNode = js.native
}

