package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompleteFailName extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 分包的名字，可以填 name 或者 root
    */
  var name: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonCompleteFailName {
  @scala.inline
  def apply(name: String, complete: () => Unit = null, fail: () => Unit = null, success: () => Unit = null): AnonCompleteFailName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AnonCompleteFailName]
  }
}

