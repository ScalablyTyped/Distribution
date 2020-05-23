package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blockversion extends js.Object {
  var block_version: Double
}

object Blockversion {
  @scala.inline
  def apply(block_version: Double): Blockversion = {
    val __obj = js.Dynamic.literal(block_version = block_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blockversion]
  }
}

