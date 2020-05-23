package typings.tablesorter

import typings.jquery.JQuery.TriggeredEvent
import typings.tablesorter.pagerConfigurationStoreMod.PagerConfigurationStore
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Paging/PagerEventHandler", JSImport.Namespace)
@js.native
object pagerEventHandlerMod extends js.Object {
  type PagerEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* options */ TablesorterConfigurationStore[TElement] | PagerConfigurationStore[TElement], 
    Unit
  ]
}

