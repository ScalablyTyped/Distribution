package typings.tablesorter

import typings.jquery.JQuery_.TriggeredEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/System/TablesorterEventHandler", JSImport.Namespace)
@js.native
object tablesorterEventHandlerMod extends js.Object {
  type TablesorterEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* table */ TElement, 
    Unit
  ]
}

