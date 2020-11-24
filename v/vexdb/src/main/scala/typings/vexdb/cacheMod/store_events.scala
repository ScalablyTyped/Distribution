package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.EventsRequestObject
import typings.vexdb.responseObjectsMod.EventsResponseObject
import typings.vexdb.vexdbStrings.events
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexdb/out/methods/cache", "store")
@js.native
object store_events extends js.Object {
  
  def apply(endpoint: events, params: EventsRequestObject, data: APIResponse[EventsResponseObject]): js.Promise[Boolean] = js.native
}
