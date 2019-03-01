package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  var key: java.lang.String
  @JSName("success")
  var success_RemoveStorageOptions: js.UndefOr[js.Function1[/* res */ DataResponse, scala.Unit]] = js.undefined
}

object RemoveStorageOptions {
  @scala.inline
  def apply(
    key: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ DataResponse, scala.Unit] = null
  ): RemoveStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[RemoveStorageOptions]
  }
}

