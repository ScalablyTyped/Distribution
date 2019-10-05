package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.events
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "live")
@js.native
object live_events extends js.Object {
  def apply(endpoint: events, params: LiveRequestObject[EventsRequestObject]): LiveEventEmitter[EventsRequestObject, EventsResponseObject] = js.native
}

