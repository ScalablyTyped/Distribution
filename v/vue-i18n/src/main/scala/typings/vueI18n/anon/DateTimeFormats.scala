package typings.vueI18n.anon

import typings.vueI18n.mod.VueI18n.LocaleMessages
import typings.vueI18n.mod.VueI18n.NumberFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeFormats extends js.Object {
  var dateTimeFormats: js.UndefOr[typings.vueI18n.mod.VueI18n.DateTimeFormats] = js.undefined
  var messages: js.UndefOr[LocaleMessages] = js.undefined
  var numberFormats: js.UndefOr[NumberFormats] = js.undefined
  var sharedMessages: js.UndefOr[LocaleMessages] = js.undefined
}

object DateTimeFormats {
  @scala.inline
  def apply(
    dateTimeFormats: typings.vueI18n.mod.VueI18n.DateTimeFormats = null,
    messages: LocaleMessages = null,
    numberFormats: NumberFormats = null,
    sharedMessages: LocaleMessages = null
  ): DateTimeFormats = {
    val __obj = js.Dynamic.literal()
    if (dateTimeFormats != null) __obj.updateDynamic("dateTimeFormats")(dateTimeFormats.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (numberFormats != null) __obj.updateDynamic("numberFormats")(numberFormats.asInstanceOf[js.Any])
    if (sharedMessages != null) __obj.updateDynamic("sharedMessages")(sharedMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeFormats]
  }
}

