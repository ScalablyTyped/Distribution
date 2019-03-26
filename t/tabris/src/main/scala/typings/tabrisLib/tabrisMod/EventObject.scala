package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "EventObject")
@js.native
class EventObject[T] () extends js.Object {
  /**
    * The object that fired the event.
    */
  val target: T = js.native
  /**
    * The time at which the event was created, in milliseconds.
    */
  val timeStamp: scala.Double = js.native
  /**
    * The event type.
    */
  val `type`: java.lang.String = js.native
}

