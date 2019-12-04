package typings.tablesorter

import typings.tablesorter.filteringValidSelectSourcesMod.ValidSelectSources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/FunctionSelectSource", JSImport.Namespace)
@js.native
object filteringFunctionSelectSourceMod extends js.Object {
  type FunctionSelectSource[TElement] = js.Function3[/* table */ TElement, /* index */ Double, /* onlyAvail */ Boolean, ValidSelectSources]
}

