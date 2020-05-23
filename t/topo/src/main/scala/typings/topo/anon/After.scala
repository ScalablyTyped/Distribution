package typings.topo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait After[TGroup] extends js.Object {
  var after: js.UndefOr[TGroup | js.Array[TGroup]] = js.undefined
  var before: js.UndefOr[TGroup | js.Array[TGroup]] = js.undefined
  var group: js.UndefOr[TGroup] = js.undefined
  var sort: js.UndefOr[Double] = js.undefined
}

object After {
  @scala.inline
  def apply[TGroup](
    after: TGroup | js.Array[TGroup] = null,
    before: TGroup | js.Array[TGroup] = null,
    group: TGroup = null,
    sort: js.UndefOr[Double] = js.undefined
  ): After[TGroup] = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[After[TGroup]]
  }
}

