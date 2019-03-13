package typings
package whyDashDidDashYouDashUpdateLib.whyDashDidDashYouDashUpdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var collapseComponentGroups: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[stdLib.RegExp] = js.undefined
  var groupByComment: js.UndefOr[scala.Boolean] = js.undefined
  var include: js.UndefOr[stdLib.RegExp] = js.undefined
  var notifier: js.UndefOr[
    js.Function4[
      /* groupByComponent */ scala.Boolean, 
      /* collapseComponentGroups */ scala.Boolean, 
      /* displayName */ java.lang.String, 
      /* diffs */ js.Array[Diffs], 
      scala.Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    collapseComponentGroups: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: stdLib.RegExp = null,
    groupByComment: js.UndefOr[scala.Boolean] = js.undefined,
    include: stdLib.RegExp = null,
    notifier: (/* groupByComponent */ scala.Boolean, /* collapseComponentGroups */ scala.Boolean, /* displayName */ java.lang.String, /* diffs */ js.Array[Diffs]) => scala.Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseComponentGroups)) __obj.updateDynamic("collapseComponentGroups")(collapseComponentGroups)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (!js.isUndefined(groupByComment)) __obj.updateDynamic("groupByComment")(groupByComment)
    if (include != null) __obj.updateDynamic("include")(include)
    if (notifier != null) __obj.updateDynamic("notifier")(js.Any.fromFunction4(notifier))
    __obj.asInstanceOf[Options]
  }
}

