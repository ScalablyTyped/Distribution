package typings.wegameApi.wx.types

import typings.wegameApi.anon.Digest
import typings.wegameApi.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileinfoParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.undefined
  var filePath: String
  var success: js.UndefOr[js.Function1[/* res */ Digest, Unit]] = js.undefined
}

object FileinfoParams {
  @scala.inline
  def apply(
    filePath: String,
    complete: () => Unit = null,
    fail: /* res */ ErrMsg => Unit = null,
    success: /* res */ Digest => Unit = null
  ): FileinfoParams = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[FileinfoParams]
  }
}

