package typings.wordpressApiFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlockversion extends js.Object {
  var block_version: Double
}

object AnonBlockversion {
  @scala.inline
  def apply(block_version: Double): AnonBlockversion = {
    val __obj = js.Dynamic.literal(block_version = block_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlockversion]
  }
}

