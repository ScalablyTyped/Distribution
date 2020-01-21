package typings.styletronEngineAtomic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlock extends js.Object {
  var block: String
  var pseudo: String
}

object AnonBlock {
  @scala.inline
  def apply(block: String, pseudo: String): AnonBlock = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], pseudo = pseudo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlock]
  }
}

