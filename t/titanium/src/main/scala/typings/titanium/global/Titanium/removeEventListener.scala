package typings.titanium.global.Titanium

import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.removeEventListener")
@js.native
object removeEventListener extends js.Object {
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def apply(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
}

