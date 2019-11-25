package typings.ydnDashDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageOptions extends js.Object {
  var autoSchema: js.UndefOr[Boolean] = js.undefined
  var isSerial: js.UndefOr[Boolean] = js.undefined
  var mechanisms: js.UndefOr[js.Array[String]] = js.undefined
  var requestType: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object StorageOptions {
  @scala.inline
  def apply(
    autoSchema: js.UndefOr[Boolean] = js.undefined,
    isSerial: js.UndefOr[Boolean] = js.undefined,
    mechanisms: js.Array[String] = null,
    requestType: String = null,
    size: Int | Double = null
  ): StorageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSchema)) __obj.updateDynamic("autoSchema")(autoSchema.asInstanceOf[js.Any])
    if (!js.isUndefined(isSerial)) __obj.updateDynamic("isSerial")(isSerial.asInstanceOf[js.Any])
    if (mechanisms != null) __obj.updateDynamic("mechanisms")(mechanisms.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageOptions]
  }
}

