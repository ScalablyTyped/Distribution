package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTConditional extends ASTNode {
  var alternative: ASTNode = js.native
  var condition: ASTNode = js.native
  var consequent: ASTNode = js.native
}

