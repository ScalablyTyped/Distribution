package typings.wordpressBlocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockName extends js.Object {
  var blockName: String
}

object BlockName {
  @scala.inline
  def apply(blockName: String): BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockName]
  }
}

