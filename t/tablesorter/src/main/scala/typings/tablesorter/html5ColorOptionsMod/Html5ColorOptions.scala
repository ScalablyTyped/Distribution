package typings.tablesorter.html5ColorOptionsMod

import typings.tablesorter.defaultValueOptionsMod.DefaultValueOptions
import typings.tablesorter.previewableOptionsMod.PreviewableOptions
import typings.tablesorter.strictOptionsMod.StrictOptions
import typings.tablesorter.testableOptionsMod.TestableOptions
import typings.tablesorter.toggleableOptionsMod.ToggleableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Html5ColorOptions
  extends DefaultValueOptions[String]
     with ToggleableOptions
     with StrictOptions
     with PreviewableOptions
     with TestableOptions

object Html5ColorOptions {
  @scala.inline
  def apply(
    addToggle: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    skipTest: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    valueToHeader: js.UndefOr[Boolean] = js.undefined
  ): Html5ColorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToggle)) __obj.updateDynamic("addToggle")(addToggle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipTest)) __obj.updateDynamic("skipTest")(skipTest.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(valueToHeader)) __obj.updateDynamic("valueToHeader")(valueToHeader.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html5ColorOptions]
  }
}

