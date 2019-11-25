package typings.vueDashI18n

import typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormats
import typings.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessages
import typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateTimeFormats extends js.Object {
  var dateTimeFormats: js.UndefOr[DateTimeFormats] = js.undefined
  var messages: js.UndefOr[LocaleMessages] = js.undefined
  var numberFormats: js.UndefOr[NumberFormats] = js.undefined
  var sharedMessages: js.UndefOr[LocaleMessages] = js.undefined
}

object Anon_DateTimeFormats {
  @scala.inline
  def apply(
    dateTimeFormats: DateTimeFormats = null,
    messages: LocaleMessages = null,
    numberFormats: NumberFormats = null,
    sharedMessages: LocaleMessages = null
  ): Anon_DateTimeFormats = {
    val __obj = js.Dynamic.literal()
    if (dateTimeFormats != null) __obj.updateDynamic("dateTimeFormats")(dateTimeFormats.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (numberFormats != null) __obj.updateDynamic("numberFormats")(numberFormats.asInstanceOf[js.Any])
    if (sharedMessages != null) __obj.updateDynamic("sharedMessages")(sharedMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateTimeFormats]
  }
}

