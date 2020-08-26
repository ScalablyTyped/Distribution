package typings.whyDidYouUpdate.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var collapseComponentGroups: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[RegExp] = js.native
  var groupByComment: js.UndefOr[Boolean] = js.native
  var include: js.UndefOr[RegExp] = js.native
  var notifier: js.UndefOr[
    js.Function4[
      /* groupByComponent */ Boolean, 
      /* collapseComponentGroups */ Boolean, 
      /* displayName */ String, 
      /* diffs */ js.Array[Diffs], 
      Unit
    ]
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollapseComponentGroups(value: Boolean): Self = this.set("collapseComponentGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseComponentGroups: Self = this.set("collapseComponentGroups", js.undefined)
    @scala.inline
    def setExclude(value: RegExp): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setGroupByComment(value: Boolean): Self = this.set("groupByComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupByComment: Self = this.set("groupByComment", js.undefined)
    @scala.inline
    def setInclude(value: RegExp): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setNotifier(
      value: (/* groupByComponent */ Boolean, /* collapseComponentGroups */ Boolean, /* displayName */ String, /* diffs */ js.Array[Diffs]) => Unit
    ): Self = this.set("notifier", js.Any.fromFunction4(value))
    @scala.inline
    def deleteNotifier: Self = this.set("notifier", js.undefined)
  }
  
}

