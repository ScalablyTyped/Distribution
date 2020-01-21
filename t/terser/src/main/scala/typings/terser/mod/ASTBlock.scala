package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTBlock extends ASTNode {
  var block_scope: ASTScope | Null = js.native
  var body: js.Array[ASTNode] = js.native
}

