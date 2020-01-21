package typings.vueI18n

import typings.vueI18n.mod.VueI18n.DateTimeFormats
import typings.vueI18n.mod.VueI18n.LocaleMessages
import typings.vueI18n.mod.VueI18n.NumberFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateTimeFormats extends js.Object {
  var dateTimeFormats: js.UndefOr[DateTimeFormats] = js.undefined
  var messages: js.UndefOr[LocaleMessages] = js.undefined
  var numberFormats: js.UndefOr[NumberFormats] = js.undefined
  var sharedMessages: js.UndefOr[LocaleMessages] = js.undefined
}

object AnonDateTimeFormats {
  @scala.inline
  def apply(
    dateTimeFormats: DateTimeFormats = null,
    messages: LocaleMessages = null,
    numberFormats: NumberFormats = null,
    sharedMessages: LocaleMessages = null
  ): AnonDateTimeFormats = {
    val __obj = js.Dynamic.literal()
    if (dateTimeFormats != null) __obj.updateDynamic("dateTimeFormats")(dateTimeFormats.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (numberFormats != null) __obj.updateDynamic("numberFormats")(numberFormats.asInstanceOf[js.Any])
    if (sharedMessages != null) __obj.updateDynamic("sharedMessages")(sharedMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDateTimeFormats]
  }
}

