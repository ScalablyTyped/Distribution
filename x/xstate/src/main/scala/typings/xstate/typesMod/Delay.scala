package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  /**
    * The time to delay the event, in milliseconds.
    */
  var delay: Double
  var id: String
}

object Delay {
  @scala.inline
  def apply(delay: Double, id: String): Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delay]
  }
}

