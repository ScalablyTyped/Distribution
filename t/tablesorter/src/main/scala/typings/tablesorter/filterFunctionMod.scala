package typings.tablesorter

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/Filtering/FilterFunction", JSImport.Namespace)
@js.native
object filterFunctionMod extends js.Object {
  
  type FilterFunction[TElement] = js.Function7[
    /* originalContent */ String, 
    /* normalizedText */ String, 
    /* filterInput */ String, 
    /* index */ Double, 
    /* row */ JQuery[HTMLElement], 
    /* config */ TablesorterConfigurationStore[TElement], 
    /* data */ js.Object, 
    Boolean
  ]
}
