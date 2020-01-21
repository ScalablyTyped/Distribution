package typings.tablesorter

import typings.tablesorter.functionSelectSourceMod.FunctionSelectSource
import typings.tablesorter.validSelectSourcesMod.ValidSelectSources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/SelectSources", JSImport.Namespace)
@js.native
object selectSourcesMod extends js.Object {
  type SelectSources[TElement] = FunctionSelectSource[TElement] | ValidSelectSources
}

