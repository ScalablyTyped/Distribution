package typings.whyDidYouUpdate.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var collapseComponentGroups: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[RegExp] = js.undefined
  var groupByComment: js.UndefOr[Boolean] = js.undefined
  var include: js.UndefOr[RegExp] = js.undefined
  var notifier: js.UndefOr[
    js.Function4[
      /* groupByComponent */ Boolean, 
      /* collapseComponentGroups */ Boolean, 
      /* displayName */ String, 
      /* diffs */ js.Array[Diffs], 
      Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    collapseComponentGroups: js.UndefOr[Boolean] = js.undefined,
    exclude: RegExp = null,
    groupByComment: js.UndefOr[Boolean] = js.undefined,
    include: RegExp = null,
    notifier: (/* groupByComponent */ Boolean, /* collapseComponentGroups */ Boolean, /* displayName */ String, /* diffs */ js.Array[Diffs]) => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseComponentGroups)) __obj.updateDynamic("collapseComponentGroups")(collapseComponentGroups.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(groupByComment)) __obj.updateDynamic("groupByComment")(groupByComment.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (notifier != null) __obj.updateDynamic("notifier")(js.Any.fromFunction4(notifier))
    __obj.asInstanceOf[Options]
  }
}

