package typings.wordpressComponents.listMod.NoticeList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /**
    * Array of notices to render.
    */
  var notices: js.Array[Notice]
  /**
    * Function called when a notice should be removed / dismissed.
    */
  var onRemove: js.UndefOr[js.Function1[/* noticeId */ String, Unit]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    notices: js.Array[Notice],
    className: String = null,
    onRemove: /* noticeId */ String => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal(notices = notices.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    __obj.asInstanceOf[Props]
  }
}

