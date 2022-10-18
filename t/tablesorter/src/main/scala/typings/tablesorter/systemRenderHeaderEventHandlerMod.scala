package typings.tablesorter

import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemRenderHeaderEventHandlerMod {
  
  type RenderHeaderEventHandler[TElement] = js.Function3[
    /* index */ Double, 
    /* config */ TablesorterConfigurationStore[TElement], 
    /* table */ JQuery[TElement], 
    Unit
  ]
}
