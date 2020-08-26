package typings.tablesorter.html5RangeOptionsMod

import typings.tablesorter.comparableOptionsMod.ComparableOptions
import typings.tablesorter.controlOptionsMod.ControlOptions
import typings.tablesorter.defaultValueOptionsMod.DefaultValueOptions
import typings.tablesorter.delayableOptionsMod.DelayableOptions
import typings.tablesorter.previewableOptionsMod.PreviewableOptions
import typings.tablesorter.rangeOptionsMod.RangeOptions
import typings.tablesorter.strictOptionsMod.StrictOptions
import typings.tablesorter.testableOptionsMod.TestableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html5RangeOptions
  extends RangeOptions
     with ControlOptions
     with DefaultValueOptions[Double]
     with ComparableOptions
     with StrictOptions
     with PreviewableOptions
     with DelayableOptions
     with TestableOptions

object Html5RangeOptions {
  @scala.inline
  def apply(): Html5RangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Html5RangeOptions]
  }
}

