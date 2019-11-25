package typings.swiper.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryNavigationOptions extends js.Object {
  /**
    * Url key for slides
    *
    * @default 'slides'
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * Works in addition to hashnav or history to replace current url state with the
    * new one instead of adding it to history
    *
    * @default false
    */
  var replaceState: js.UndefOr[Boolean] = js.undefined
}

object HistoryNavigationOptions {
  @scala.inline
  def apply(key: String = null, replaceState: js.UndefOr[Boolean] = js.undefined): HistoryNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceState)) __obj.updateDynamic("replaceState")(replaceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryNavigationOptions]
  }
}

