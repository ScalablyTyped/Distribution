package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "Event")
@js.native
abstract class Event protected ()
  extends typings.wonderJs.eventMod.Event {
  protected def this(eventName: typings.wonderJs.eventNameHandlerMod.EEventName) = this()
}

