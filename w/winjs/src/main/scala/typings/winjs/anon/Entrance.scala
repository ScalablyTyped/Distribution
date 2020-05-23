package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entrance extends js.Object {
  var entrance: js.Function
  var exit: js.Function
}

object Entrance {
  @scala.inline
  def apply(entrance: js.Function, exit: js.Function): Entrance = {
    val __obj = js.Dynamic.literal(entrance = entrance.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entrance]
  }
}

