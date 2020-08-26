package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashNavigationOptions extends js.Object {
  /**
    * Works in addition to hashnav to replace current url state with the
    * new one instead of adding it to history
    *
    * @default     false
    */
  var replaceState: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to enable also navigation through slides (when hashnav
    * is enabled) by browser history or by setting directly hash on document location
    *
    * @default false
    */
  var watchState: js.UndefOr[Boolean] = js.native
}

object HashNavigationOptions {
  @scala.inline
  def apply(): HashNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashNavigationOptions]
  }
  @scala.inline
  implicit class HashNavigationOptionsOps[Self <: HashNavigationOptions] (val x: Self) extends AnyVal {
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
    def setReplaceState(value: Boolean): Self = this.set("replaceState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceState: Self = this.set("replaceState", js.undefined)
    @scala.inline
    def setWatchState(value: Boolean): Self = this.set("watchState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchState: Self = this.set("watchState", js.undefined)
  }
  
}

