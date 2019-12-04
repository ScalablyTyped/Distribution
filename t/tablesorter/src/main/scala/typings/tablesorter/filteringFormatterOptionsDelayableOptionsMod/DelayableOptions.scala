package typings.tablesorter.filteringFormatterOptionsDelayableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelayableOptions extends js.Object {
  /**
    * A value indicating whether the value of the filter should be set delayed.
    */
  var delayed: js.UndefOr[Boolean] = js.undefined
}

object DelayableOptions {
  @scala.inline
  def apply(delayed: js.UndefOr[Boolean] = js.undefined): DelayableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delayed)) __obj.updateDynamic("delayed")(delayed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayableOptions]
  }
}

