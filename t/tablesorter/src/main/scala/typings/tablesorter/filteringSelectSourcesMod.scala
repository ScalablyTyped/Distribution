package typings.tablesorter

import typings.tablesorter.filteringFunctionSelectSourceMod.FunctionSelectSource
import typings.tablesorter.filteringValidSelectSourcesMod.ValidSelectSources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/SelectSources", JSImport.Namespace)
@js.native
object filteringSelectSourcesMod extends js.Object {
  type SelectSources[TElement] = FunctionSelectSource[TElement] | ValidSelectSources
}

