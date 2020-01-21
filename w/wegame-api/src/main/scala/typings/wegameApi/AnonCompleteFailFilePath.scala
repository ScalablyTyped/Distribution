package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompleteFailFilePath extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 图片文件路径，可以是临时文件路径也可以是永久文件路径，不支持网络图片路径
    */
  var filePath: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonCompleteFailFilePath {
  @scala.inline
  def apply(filePath: String, complete: () => Unit = null, fail: () => Unit = null, success: () => Unit = null): AnonCompleteFailFilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AnonCompleteFailFilePath]
  }
}

