package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheTime extends js.Object {
  var cacheTime: js.UndefOr[Double] = js.undefined
  var showAlert: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_CacheTime {
  @scala.inline
  def apply(
    cacheTime: Int | Double = null,
    showAlert: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    url: String = null
  ): Anon_CacheTime = {
    val __obj = js.Dynamic.literal()
    if (cacheTime != null) __obj.updateDynamic("cacheTime")(cacheTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showAlert)) __obj.updateDynamic("showAlert")(showAlert)
    if (text != null) __obj.updateDynamic("text")(text)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_CacheTime]
  }
}

