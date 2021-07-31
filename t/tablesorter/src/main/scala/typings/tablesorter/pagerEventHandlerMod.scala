package typings.tablesorter

import typings.jquery.JQuery.TriggeredEvent
import typings.tablesorter.pagerConfigurationStoreMod.PagerConfigurationStore
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerEventHandlerMod {
  
  type PagerEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* options */ TablesorterConfigurationStore[TElement] | PagerConfigurationStore[TElement], 
    Unit
  ]
}
