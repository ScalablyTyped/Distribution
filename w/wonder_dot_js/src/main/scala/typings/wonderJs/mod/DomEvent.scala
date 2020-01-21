package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "DomEvent")
@js.native
abstract class DomEvent protected ()
  extends typings.wonderJs.domEventMod.DomEvent {
  def this(event: js.Any, eventName: typings.wonderJs.eventNameHandlerMod.EEventName) = this()
}

