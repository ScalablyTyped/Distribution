package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheTime extends js.Object {
  var cacheTime: js.UndefOr[scala.Double] = js.undefined
  var showAlert: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CacheTime {
  @scala.inline
  def apply(
    cacheTime: scala.Int | scala.Double = null,
    showAlert: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    url: java.lang.String = null
  ): Anon_CacheTime = {
    val __obj = js.Dynamic.literal()
    if (cacheTime != null) __obj.updateDynamic("cacheTime")(cacheTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showAlert)) __obj.updateDynamic("showAlert")(showAlert)
    if (text != null) __obj.updateDynamic("text")(text)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_CacheTime]
  }
}

