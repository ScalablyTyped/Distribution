package typings.tablesorter.uidatecompareoptionsMod

import typings.jqueryui.JQueryUI.DatepickerOptions
import typings.tablesorter.comparableOptionsMod.ComparableOptions
import typings.tablesorter.controlOptionsMod.ControlOptions
import typings.tablesorter.dateOptionsMod.DateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDateCompareOptions
  extends DatepickerOptions
     with DateOptions
     with ControlOptions
     with ComparableOptions

object UIDateCompareOptions {
  @scala.inline
  def apply(): UIDateCompareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIDateCompareOptions]
  }
}

