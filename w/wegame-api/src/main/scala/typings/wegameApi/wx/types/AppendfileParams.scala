package typings.wegameApi.wx.types

import typings.std.ArrayBuffer
import typings.wegameApi.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var data: String | ArrayBuffer
  var encoding: js.UndefOr[FileContentEncoding] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.undefined
  var filePath: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AppendfileParams {
  @scala.inline
  def apply(
    data: String | ArrayBuffer,
    filePath: String,
    complete: () => Unit = null,
    encoding: FileContentEncoding = null,
    fail: /* res */ ErrMsg => Unit = null,
    success: () => Unit = null
  ): AppendfileParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AppendfileParams]
  }
}

