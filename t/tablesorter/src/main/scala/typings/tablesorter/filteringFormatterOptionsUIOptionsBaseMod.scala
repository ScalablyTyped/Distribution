package typings.tablesorter

import typings.tablesorter.omitMod.Omit
import typings.tablesorter.tablesorterStrings.max
import typings.tablesorter.tablesorterStrings.min
import typings.tablesorter.tablesorterStrings.step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/Formatter/Options/UIOptionsBase", JSImport.Namespace)
@js.native
object filteringFormatterOptionsUIOptionsBaseMod extends js.Object {
  type UIOptionsBase[T /* <: Anon_Max */] = Omit[T, min | max | step]
}

