package typings.tablesorter

import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/System/RenderHeaderEventHandler", JSImport.Namespace)
@js.native
object renderHeaderEventHandlerMod extends js.Object {
  type RenderHeaderEventHandler[TElement] = js.Function3[
    /* index */ Double, 
    /* config */ TablesorterConfigurationStore[TElement], 
    /* table */ JQuery[TElement], 
    Unit
  ]
}

