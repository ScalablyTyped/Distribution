package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaptionDuration extends js.Object {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var notification: js.UndefOr[scala.Boolean] = js.undefined
  var performer: js.UndefOr[java.lang.String] = js.undefined
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[scala.Double] = js.undefined
  var serverDownload: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CaptionDuration {
  @scala.inline
  def apply(
    caption: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    fileName: java.lang.String = null,
    notification: js.UndefOr[scala.Boolean] = js.undefined,
    performer: java.lang.String = null,
    replyMarkup: js.Any = null,
    replyToMessage: scala.Int | scala.Double = null,
    serverDownload: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): Anon_CaptionDuration = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification)
    if (performer != null) __obj.updateDynamic("performer")(performer)
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup)
    if (replyToMessage != null) __obj.updateDynamic("replyToMessage")(replyToMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(serverDownload)) __obj.updateDynamic("serverDownload")(serverDownload)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_CaptionDuration]
  }
}

