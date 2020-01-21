package typings.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntrance extends js.Object {
  var entrance: js.Function
  var exit: js.Function
}

object AnonEntrance {
  @scala.inline
  def apply(entrance: js.Function, exit: js.Function): AnonEntrance = {
    val __obj = js.Dynamic.literal(entrance = entrance.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEntrance]
  }
}

