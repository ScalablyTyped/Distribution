package typings
package webpackDashNotifierLib.webpackDashNotifierMod.WebpackNotifierPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var alwaysNotify: js.UndefOr[scala.Boolean] = js.undefined
  var contentImage: js.UndefOr[java.lang.String] = js.undefined
  var excludeWarnings: js.UndefOr[scala.Boolean] = js.undefined
  var skipFirstNotification: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alwaysNotify: js.UndefOr[scala.Boolean] = js.undefined,
    contentImage: java.lang.String = null,
    excludeWarnings: js.UndefOr[scala.Boolean] = js.undefined,
    skipFirstNotification: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysNotify)) __obj.updateDynamic("alwaysNotify")(alwaysNotify)
    if (contentImage != null) __obj.updateDynamic("contentImage")(contentImage)
    if (!js.isUndefined(excludeWarnings)) __obj.updateDynamic("excludeWarnings")(excludeWarnings)
    if (!js.isUndefined(skipFirstNotification)) __obj.updateDynamic("skipFirstNotification")(skipFirstNotification)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Options]
  }
}

