package typings.tablesorter.html5NumberOptionsMod

import typings.tablesorter.comparableOptionsMod.ComparableOptions
import typings.tablesorter.controlOptionsMod.ControlOptions
import typings.tablesorter.defaultValueOptionsMod.DefaultValueOptions
import typings.tablesorter.delayableOptionsMod.DelayableOptions
import typings.tablesorter.intervalOptionsMod.IntervalOptions
import typings.tablesorter.strictOptionsMod.StrictOptions
import typings.tablesorter.testableOptionsMod.TestableOptions
import typings.tablesorter.toggleableOptionsMod.ToggleableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html5NumberOptions
  extends IntervalOptions
     with ControlOptions
     with DefaultValueOptions[Double]
     with ComparableOptions
     with ToggleableOptions
     with DelayableOptions
     with StrictOptions
     with TestableOptions

object Html5NumberOptions {
  @scala.inline
  def apply(): Html5NumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Html5NumberOptions]
  }
}

