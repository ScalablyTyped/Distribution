package typings.victory.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Many victory components accept string or number or callback which returns string or number
trait CallbackArgs extends js.Object {
  var active: Boolean
  var datum: js.Any
  var horizontal: Boolean
  var x: Double
  var y: Double
}

object CallbackArgs {
  @scala.inline
  def apply(active: Boolean, datum: js.Any, horizontal: Boolean, x: Double, y: Double): CallbackArgs = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CallbackArgs]
  }
}

