package typings.tablesorter.filteringFormatterOptionsHtml5NumberOptionsMod

import typings.tablesorter.filteringFormatterOptionsComparableOptionsMod.ComparableOptions
import typings.tablesorter.filteringFormatterOptionsControlOptionsMod.ControlOptions
import typings.tablesorter.filteringFormatterOptionsDefaultValueOptionsMod.DefaultValueOptions
import typings.tablesorter.filteringFormatterOptionsDelayableOptionsMod.DelayableOptions
import typings.tablesorter.filteringFormatterOptionsIntervalOptionsMod.IntervalOptions
import typings.tablesorter.filteringFormatterOptionsStrictOptionsMod.StrictOptions
import typings.tablesorter.filteringFormatterOptionsTestableOptionsMod.TestableOptions
import typings.tablesorter.filteringFormatterOptionsToggleableOptionsMod.ToggleableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    addToggle: js.UndefOr[Boolean] = js.undefined,
    cellText: String = null,
    compare: String | js.Array[String] = null,
    delayed: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    skipTest: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    value: Int | Double = null
  ): Html5NumberOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToggle)) __obj.updateDynamic("addToggle")(addToggle.asInstanceOf[js.Any])
    if (cellText != null) __obj.updateDynamic("cellText")(cellText.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(compare.asInstanceOf[js.Any])
    if (!js.isUndefined(delayed)) __obj.updateDynamic("delayed")(delayed.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(skipTest)) __obj.updateDynamic("skipTest")(skipTest.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html5NumberOptions]
  }
}

