package typings.webpackDashNotifier.webpackDashNotifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var alwaysNotify: js.UndefOr[Boolean] = js.undefined
  var contentImage: js.UndefOr[String] = js.undefined
  var excludeWarnings: js.UndefOr[Boolean] = js.undefined
  var skipFirstNotification: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alwaysNotify: js.UndefOr[Boolean] = js.undefined,
    contentImage: String = null,
    excludeWarnings: js.UndefOr[Boolean] = js.undefined,
    skipFirstNotification: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysNotify)) __obj.updateDynamic("alwaysNotify")(alwaysNotify.asInstanceOf[js.Any])
    if (contentImage != null) __obj.updateDynamic("contentImage")(contentImage.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeWarnings)) __obj.updateDynamic("excludeWarnings")(excludeWarnings.asInstanceOf[js.Any])
    if (!js.isUndefined(skipFirstNotification)) __obj.updateDynamic("skipFirstNotification")(skipFirstNotification.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

