package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var destPath: java.lang.String
  var fail: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit]] = js.undefined
  var srcPath: java.lang.String
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object CopyfileParams {
  @scala.inline
  def apply(
    destPath: java.lang.String,
    srcPath: java.lang.String,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): CopyfileParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destPath")(destPath)
    __obj.updateDynamic("srcPath")(srcPath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CopyfileParams]
  }
}

