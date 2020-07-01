package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.EventsRequestObject
import typings.vexdb.vexdbStrings.events
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/cache", "resolve")
@js.native
object resolve_events extends js.Object {
  def apply(endpoint: events, params: EventsRequestObject): js.Promise[APIResponse[EventsRequestObject]] = js.native
}

