package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var key: java.lang.String
  var success: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_DataAny, scala.Unit]] = js.undefined
}

object GetStorageParams {
  @scala.inline
  def apply(
    key: java.lang.String,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function1[/* res */ wegameDashApiLib.Anon_DataAny, scala.Unit] = null
  ): GetStorageParams = {
    val __obj = js.Dynamic.literal(key = key)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[GetStorageParams]
  }
}

