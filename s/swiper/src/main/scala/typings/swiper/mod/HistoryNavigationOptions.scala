package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryNavigationOptions extends js.Object {
  /**
    * Url key for slides
    *
    * @default 'slides'
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Works in addition to hashnav or history to replace current url state with the
    * new one instead of adding it to history
    *
    * @default false
    */
  var replaceState: js.UndefOr[Boolean] = js.native
}

object HistoryNavigationOptions {
  @scala.inline
  def apply(): HistoryNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryNavigationOptions]
  }
  @scala.inline
  implicit class HistoryNavigationOptionsOps[Self <: HistoryNavigationOptions] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setReplaceState(value: Boolean): Self = this.set("replaceState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceState: Self = this.set("replaceState", js.undefined)
  }
  
}

