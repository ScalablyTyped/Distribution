package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaptionDurationFileName extends js.Object {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var notification: js.UndefOr[scala.Boolean] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[scala.Double] = js.undefined
  var serverDownload: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CaptionDurationFileName {
  @scala.inline
  def apply(
    caption: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    fileName: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    notification: js.UndefOr[scala.Boolean] = js.undefined,
    replyMarkup: js.Any = null,
    replyToMessage: scala.Int | scala.Double = null,
    serverDownload: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Anon_CaptionDurationFileName = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification)
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup)
    if (replyToMessage != null) __obj.updateDynamic("replyToMessage")(replyToMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(serverDownload)) __obj.updateDynamic("serverDownload")(serverDownload)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CaptionDurationFileName]
  }
}

