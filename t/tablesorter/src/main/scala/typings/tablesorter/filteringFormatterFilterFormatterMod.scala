package typings.tablesorter

import typings.tablesorter.filteringFormatterHtml5FormatterMod.Html5Formatter
import typings.tablesorter.filteringFormatterSelect2FormatterMod.Select2Formatter
import typings.tablesorter.filteringFormatterUIFormatterMod.UIFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/Formatter/FilterFormatter", JSImport.Namespace)
@js.native
object filteringFormatterFilterFormatterMod extends js.Object {
  @js.native
  trait FilterFormatter
    extends Html5Formatter
       with UIFormatter
       with Select2Formatter
  
}

