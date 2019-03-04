package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit]] = js.undefined
  var path: java.lang.String
  var success: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_Stat, scala.Unit]] = js.undefined
}

object StatParams {
  @scala.inline
  def apply(
    path: java.lang.String,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit] = null,
    success: js.Function1[/* res */ wegameDashApiLib.Anon_Stat, scala.Unit] = null
  ): StatParams = {
    val __obj = js.Dynamic.literal(path = path)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[StatParams]
  }
}

