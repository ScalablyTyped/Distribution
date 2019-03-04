package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetStorageInfoOptions(res: StorageInfo): scala.Unit
}

object GetStorageInfoOptions {
  @scala.inline
  def apply(
    success: js.Function1[StorageInfo, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetStorageInfoOptions = {
    val __obj = js.Dynamic.literal(success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetStorageInfoOptions]
  }
}

