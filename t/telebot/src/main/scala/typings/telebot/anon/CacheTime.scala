package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheTime extends js.Object {
  var cacheTime: js.UndefOr[Double] = js.undefined
  var showAlert: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object CacheTime {
  @scala.inline
  def apply(
    cacheTime: js.UndefOr[Double] = js.undefined,
    showAlert: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    url: String = null
  ): CacheTime = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheTime)) __obj.updateDynamic("cacheTime")(cacheTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAlert)) __obj.updateDynamic("showAlert")(showAlert.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheTime]
  }
}

