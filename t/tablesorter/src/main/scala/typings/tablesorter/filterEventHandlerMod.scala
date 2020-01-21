package typings.tablesorter

import typings.jquery.JQuery_.TriggeredEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/FilterEventHandler", JSImport.Namespace)
@js.native
object filterEventHandlerMod extends js.Object {
  type FilterEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* filters */ js.Array[String], 
    Unit
  ]
}

