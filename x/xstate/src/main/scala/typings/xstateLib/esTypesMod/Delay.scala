package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  /**
    * The time to delay the event, in milliseconds.
    */
  var delay: scala.Double
  var id: java.lang.String
}

object Delay {
  @scala.inline
  def apply(delay: scala.Double, id: java.lang.String): Delay = {
    val __obj = js.Dynamic.literal(delay = delay, id = id)
  
    __obj.asInstanceOf[Delay]
  }
}

