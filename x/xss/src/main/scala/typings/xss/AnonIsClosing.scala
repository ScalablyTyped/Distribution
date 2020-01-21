package typings.xss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsClosing extends js.Object {
  var isClosing: Boolean
  var position: Double
}

object AnonIsClosing {
  @scala.inline
  def apply(isClosing: Boolean, position: Double): AnonIsClosing = {
    val __obj = js.Dynamic.literal(isClosing = isClosing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsClosing]
  }
}

