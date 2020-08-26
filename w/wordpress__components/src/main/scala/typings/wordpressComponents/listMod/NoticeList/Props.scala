package typings.wordpressComponents.listMod.NoticeList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var className: js.UndefOr[String] = js.native
  /**
    * Array of notices to render.
    */
  var notices: js.Array[Notice] = js.native
  /**
    * Function called when a notice should be removed / dismissed.
    */
  var onRemove: js.UndefOr[js.Function1[/* noticeId */ String, Unit]] = js.native
}

object Props {
  @scala.inline
  def apply(notices: js.Array[Notice]): Props = {
    val __obj = js.Dynamic.literal(notices = notices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setNoticesVarargs(value: Notice*): Self = this.set("notices", js.Array(value :_*))
    @scala.inline
    def setNotices(value: js.Array[Notice]): Self = this.set("notices", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOnRemove(value: /* noticeId */ String => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
  }
  
}

