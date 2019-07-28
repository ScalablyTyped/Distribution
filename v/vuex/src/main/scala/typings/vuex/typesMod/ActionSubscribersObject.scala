package typings.vuex.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSubscribersObject[P, S] extends js.Object {
  var after: js.UndefOr[ActionSubscriber[P, S]] = js.undefined
  var before: js.UndefOr[ActionSubscriber[P, S]] = js.undefined
}

object ActionSubscribersObject {
  @scala.inline
  def apply[P, S](after: ActionSubscriber[P, S] = null, before: ActionSubscriber[P, S] = null): ActionSubscribersObject[P, S] = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    __obj.asInstanceOf[ActionSubscribersObject[P, S]]
  }
}

