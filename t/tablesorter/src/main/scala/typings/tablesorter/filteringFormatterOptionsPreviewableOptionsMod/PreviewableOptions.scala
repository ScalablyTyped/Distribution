package typings.tablesorter.filteringFormatterOptionsPreviewableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewableOptions extends js.Object {
  /**
    * A value indicating whether the value should be visible in the table header.
    */
  var valueToHeader: js.UndefOr[Boolean] = js.undefined
}

object PreviewableOptions {
  @scala.inline
  def apply(valueToHeader: js.UndefOr[Boolean] = js.undefined): PreviewableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(valueToHeader)) __obj.updateDynamic("valueToHeader")(valueToHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewableOptions]
  }
}

