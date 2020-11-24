package typings.tablesorter

import typings.jquery.JQuery.TriggeredEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/Filtering/FilterEventHandler", JSImport.Namespace)
@js.native
object filterEventHandlerMod extends js.Object {
  
  type FilterEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* filters */ js.Array[String], 
    Unit
  ]
}
