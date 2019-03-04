package typings
package ydnDashDbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageOptions extends js.Object {
  var autoSchema: js.UndefOr[scala.Boolean] = js.undefined
  var isSerial: js.UndefOr[scala.Boolean] = js.undefined
  var mechanisms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object StorageOptions {
  @scala.inline
  def apply(
    autoSchema: js.UndefOr[scala.Boolean] = js.undefined,
    isSerial: js.UndefOr[scala.Boolean] = js.undefined,
    mechanisms: js.Array[java.lang.String] = null,
    requestType: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): StorageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSchema)) __obj.updateDynamic("autoSchema")(autoSchema)
    if (!js.isUndefined(isSerial)) __obj.updateDynamic("isSerial")(isSerial)
    if (mechanisms != null) __obj.updateDynamic("mechanisms")(mechanisms)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageOptions]
  }
}

