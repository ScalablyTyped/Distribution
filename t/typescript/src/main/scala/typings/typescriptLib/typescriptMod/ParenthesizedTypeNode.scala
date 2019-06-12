package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParenthesizedTypeNode
  extends TypeNode
     with HasType {
  @JSName("kind")
  var kind_ParenthesizedTypeNode: typescriptLib.typescriptMod.SyntaxKind.ParenthesizedType = js.native
  var `type`: TypeNode = js.native
}

