package typings.typedRestClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrayFormat extends js.Object {
  var arrayFormat: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var shouldAllowDots: js.UndefOr[Boolean] = js.undefined
  var shouldOnlyEncodeValues: js.UndefOr[Boolean] = js.undefined
}

object AnonArrayFormat {
  @scala.inline
  def apply(
    arrayFormat: String = null,
    separator: String = null,
    shouldAllowDots: js.UndefOr[Boolean] = js.undefined,
    shouldOnlyEncodeValues: js.UndefOr[Boolean] = js.undefined
  ): AnonArrayFormat = {
    val __obj = js.Dynamic.literal()
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldAllowDots)) __obj.updateDynamic("shouldAllowDots")(shouldAllowDots.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldOnlyEncodeValues)) __obj.updateDynamic("shouldOnlyEncodeValues")(shouldOnlyEncodeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrayFormat]
  }
}

