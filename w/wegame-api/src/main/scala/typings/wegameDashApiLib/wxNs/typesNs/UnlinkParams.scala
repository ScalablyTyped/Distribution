package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnlinkParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit]] = js.undefined
  var filePath: java.lang.String
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object UnlinkParams {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): UnlinkParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filePath")(filePath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[UnlinkParams]
  }
}

