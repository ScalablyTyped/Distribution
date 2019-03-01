package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var data: java.lang.String | stdLib.ArrayBuffer
  var encoding: js.UndefOr[FileContentEncoding] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit]] = js.undefined
  var filePath: java.lang.String
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object AppendfileParams {
  @scala.inline
  def apply(
    data: java.lang.String | stdLib.ArrayBuffer,
    filePath: java.lang.String,
    complete: js.Function0[scala.Unit] = null,
    encoding: FileContentEncoding = null,
    fail: js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): AppendfileParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("filePath")(filePath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[AppendfileParams]
  }
}

