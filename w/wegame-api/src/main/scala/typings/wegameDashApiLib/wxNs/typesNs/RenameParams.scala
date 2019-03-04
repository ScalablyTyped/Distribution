package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit]] = js.undefined
  var newPath: java.lang.String
  var oldPath: java.lang.String
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object RenameParams {
  @scala.inline
  def apply(
    newPath: java.lang.String,
    oldPath: java.lang.String,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): RenameParams = {
    val __obj = js.Dynamic.literal(newPath = newPath, oldPath = oldPath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[RenameParams]
  }
}

