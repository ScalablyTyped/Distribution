package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashNavigationOptions extends js.Object {
  /**
    * Works in addition to hashnav to replace current url state with the
    * new one instead of adding it to history
    *
    * @default 	false
    */
  var replaceState: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to enable also navigation through slides (when hashnav
    * is enabled) by browser history or by setting directly hash on document location
    *
    * @default false
    */
  var watchState: js.UndefOr[Boolean] = js.undefined
}

object HashNavigationOptions {
  @scala.inline
  def apply(replaceState: js.UndefOr[Boolean] = js.undefined, watchState: js.UndefOr[Boolean] = js.undefined): HashNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(replaceState)) __obj.updateDynamic("replaceState")(replaceState.asInstanceOf[js.Any])
    if (!js.isUndefined(watchState)) __obj.updateDynamic("watchState")(watchState.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashNavigationOptions]
  }
}

