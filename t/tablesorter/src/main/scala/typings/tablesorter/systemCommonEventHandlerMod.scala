package typings.tablesorter

import typings.jquery.JQuery.TriggeredEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/System/CommonEventHandler", JSImport.Namespace)
@js.native
object systemCommonEventHandlerMod extends js.Object {
  type CommonEventHandler[TElement] = js.Function1[/* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], Unit]
}

