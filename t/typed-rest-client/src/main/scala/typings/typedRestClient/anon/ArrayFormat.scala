package typings.typedRestClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayFormat extends js.Object {
  var arrayFormat: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var shouldAllowDots: js.UndefOr[Boolean] = js.undefined
  var shouldOnlyEncodeValues: js.UndefOr[Boolean] = js.undefined
}

object ArrayFormat {
  @scala.inline
  def apply(
    arrayFormat: String = null,
    separator: String = null,
    shouldAllowDots: js.UndefOr[Boolean] = js.undefined,
    shouldOnlyEncodeValues: js.UndefOr[Boolean] = js.undefined
  ): ArrayFormat = {
    val __obj = js.Dynamic.literal()
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldAllowDots)) __obj.updateDynamic("shouldAllowDots")(shouldAllowDots.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldOnlyEncodeValues)) __obj.updateDynamic("shouldOnlyEncodeValues")(shouldOnlyEncodeValues.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFormat]
  }
}

