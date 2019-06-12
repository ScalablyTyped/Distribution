package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeOperatorNode
  extends TypeNode
     with HasType {
  @JSName("kind")
  var kind_TypeOperatorNode: typescriptLib.typescriptMod.SyntaxKind.TypeOperator = js.native
  var operator: typescriptLib.typescriptMod.SyntaxKind.KeyOfKeyword | typescriptLib.typescriptMod.SyntaxKind.UniqueKeyword | typescriptLib.typescriptMod.SyntaxKind.ReadonlyKeyword = js.native
  var `type`: TypeNode = js.native
}

