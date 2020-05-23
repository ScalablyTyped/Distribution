package typings.wordpressComponents.anon

import typings.react.mod.ReactNode
import typings.wordpressNotices.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/components.@wordpress/components/notice/list.default.Notice> & std.Pick<@wordpress/components.@wordpress/components/notice/list.default.Notice, 'content'> */
trait PartialNoticePickNoticeco extends js.Object {
  var actions: js.UndefOr[js.Array[typings.wordpressComponents.noticeMod.Notice.Action]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[ReactNode] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isDismissible: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[Status] = js.undefined
}

object PartialNoticePickNoticeco {
  @scala.inline
  def apply(
    actions: js.Array[typings.wordpressComponents.noticeMod.Notice.Action] = null,
    className: String = null,
    content: ReactNode = null,
    id: String = null,
    isDismissible: js.UndefOr[Boolean] = js.undefined,
    status: Status = null
  ): PartialNoticePickNoticeco = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isDismissible)) __obj.updateDynamic("isDismissible")(isDismissible.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialNoticePickNoticeco]
  }
}

