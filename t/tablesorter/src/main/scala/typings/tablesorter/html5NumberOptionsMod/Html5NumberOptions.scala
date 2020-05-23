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
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    skipTest: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): Html5NumberOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToggle)) __obj.updateDynamic("addToggle")(addToggle.get.asInstanceOf[js.Any])
    if (cellText != null) __obj.updateDynamic("cellText")(cellText.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(compare.asInstanceOf[js.Any])
    if (!js.isUndefined(delayed)) __obj.updateDynamic("delayed")(delayed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipTest)) __obj.updateDynamic("skipTest")(skipTest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html5NumberOptions]
  }
}

