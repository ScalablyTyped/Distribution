package typings.tablesorter

import typings.jquery.JQuery.TriggeredEvent
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/System/ConfigEventHandler", JSImport.Namespace)
@js.native
object configEventHandlerMod extends js.Object {
  
  type ConfigEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* config */ TablesorterConfigurationStore[TElement], 
    Unit
  ]
}
