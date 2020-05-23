package typings.vuex.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSubscribersObject[P, S] extends js.Object {
  var after: js.UndefOr[ActionSubscriber[P, S]] = js.undefined
  var before: js.UndefOr[ActionSubscriber[P, S]] = js.undefined
  var error: js.UndefOr[ActionErrorSubscriber[P, S]] = js.undefined
}

object ActionSubscribersObject {
  @scala.inline
  def apply[P, S](
    after: (P, S) => js.Any = null,
    before: (P, S) => js.Any = null,
    error: (P, S, /* error */ Error) => js.Any = null
  ): ActionSubscribersObject[P, S] = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction2(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    __obj.asInstanceOf[ActionSubscribersObject[P, S]]
  }
}

