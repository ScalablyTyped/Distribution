package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailName extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 分包的名字，可以填 name 或者 root
    */
  var name: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Anon_CompleteFailName {
  @scala.inline
  def apply(name: String, complete: () => Unit = null, fail: () => Unit = null, success: () => Unit = null): Anon_CompleteFailName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[Anon_CompleteFailName]
  }
}

