package typings
package vueDashI18nLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateTimeFormats extends js.Object {
  var dateTimeFormats: js.UndefOr[vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormats] = js.undefined
  var messages: js.UndefOr[vueDashI18nLib.vueDashI18nMod.VueI18nNs.LocaleMessages] = js.undefined
  var numberFormats: js.UndefOr[vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormats] = js.undefined
  var sharedMessages: js.UndefOr[vueDashI18nLib.vueDashI18nMod.VueI18nNs.LocaleMessages] = js.undefined
}

object Anon_DateTimeFormats {
  @scala.inline
  def apply(
    dateTimeFormats: vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormats = null,
    messages: vueDashI18nLib.vueDashI18nMod.VueI18nNs.LocaleMessages = null,
    numberFormats: vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormats = null,
    sharedMessages: vueDashI18nLib.vueDashI18nMod.VueI18nNs.LocaleMessages = null
  ): Anon_DateTimeFormats = {
    val __obj = js.Dynamic.literal()
    if (dateTimeFormats != null) __obj.updateDynamic("dateTimeFormats")(dateTimeFormats)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (numberFormats != null) __obj.updateDynamic("numberFormats")(numberFormats)
    if (sharedMessages != null) __obj.updateDynamic("sharedMessages")(sharedMessages)
    __obj.asInstanceOf[Anon_DateTimeFormats]
  }
}

