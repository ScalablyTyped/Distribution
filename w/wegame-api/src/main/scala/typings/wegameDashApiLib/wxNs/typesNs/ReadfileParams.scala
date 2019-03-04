package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var encoding: js.UndefOr[FileContentEncoding] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit]] = js.undefined
  var filePath: java.lang.String
  var success: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_Data, scala.Unit]] = js.undefined
}

object ReadfileParams {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    complete: js.Function0[scala.Unit] = null,
    encoding: FileContentEncoding = null,
    fail: js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit] = null,
    success: js.Function1[/* res */ wegameDashApiLib.Anon_Data, scala.Unit] = null
  ): ReadfileParams = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ReadfileParams]
  }
}

