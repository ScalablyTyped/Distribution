package typings.tablesorter

import typings.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import typings.tablesorter.tablesorterMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/System/RenderHeaderEventHandler", JSImport.Namespace)
@js.native
object systemRenderHeaderEventHandlerMod extends js.Object {
  type RenderHeaderEventHandler[TElement] = js.Function3[
    /* index */ Double, 
    /* config */ TablesorterConfigurationStore[TElement], 
    /* table */ JQuery[TElement], 
    Unit
  ]
}

