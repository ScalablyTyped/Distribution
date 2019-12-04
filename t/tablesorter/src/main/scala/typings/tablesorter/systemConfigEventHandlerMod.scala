package typings.tablesorter

import typings.jquery.JQuery.TriggeredEvent
import typings.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/System/ConfigEventHandler", JSImport.Namespace)
@js.native
object systemConfigEventHandlerMod extends js.Object {
  type ConfigEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* config */ TablesorterConfigurationStore[TElement], 
    Unit
  ]
}

