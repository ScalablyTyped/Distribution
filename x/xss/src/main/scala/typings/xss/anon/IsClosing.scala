package typings.xss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsClosing extends js.Object {
  var isClosing: Boolean
  var position: Double
}

object IsClosing {
  @scala.inline
  def apply(isClosing: Boolean, position: Double): IsClosing = {
    val __obj = js.Dynamic.literal(isClosing = isClosing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsClosing]
  }
}

