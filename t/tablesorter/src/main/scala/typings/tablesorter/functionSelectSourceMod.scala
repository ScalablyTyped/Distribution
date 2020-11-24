package typings.tablesorter

import typings.tablesorter.validSelectSourcesMod.ValidSelectSources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/Filtering/FunctionSelectSource", JSImport.Namespace)
@js.native
object functionSelectSourceMod extends js.Object {
  
  type FunctionSelectSource[TElement] = js.Function3[/* table */ TElement, /* index */ Double, /* onlyAvail */ Boolean, ValidSelectSources]
}
