package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.events
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "get")
@js.native
object get_events extends js.Object {
  def apply(endpoint: events, params: EventsRequestObject): js.Promise[js.Array[EventsResponseObject]] = js.native
}

