package typings.styletronEngineAtomic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  var block: String
  var pseudo: String
}

object Block {
  @scala.inline
  def apply(block: String, pseudo: String): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], pseudo = pseudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

