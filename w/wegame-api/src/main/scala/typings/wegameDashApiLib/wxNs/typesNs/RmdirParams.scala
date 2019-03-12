package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RmdirParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var dirPath: java.lang.String
  var fail: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit]] = js.undefined
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object RmdirParams {
  @scala.inline
  def apply(
    dirPath: java.lang.String,
    complete: () => scala.Unit = null,
    fail: /* res */ wegameDashApiLib.Anon_ErrMsg => scala.Unit = null,
    recursive: js.UndefOr[scala.Boolean] = js.undefined,
    success: () => scala.Unit = null
  ): RmdirParams = {
    val __obj = js.Dynamic.literal(dirPath = dirPath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[RmdirParams]
  }
}

