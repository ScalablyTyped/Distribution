package typings.vueI18n.anon

import typings.vueI18n.mod.VueI18n.LocaleMessages
import typings.vueI18n.mod.VueI18n.NumberFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormats extends js.Object {
  var dateTimeFormats: js.UndefOr[typings.vueI18n.mod.VueI18n.DateTimeFormats] = js.native
  var messages: js.UndefOr[LocaleMessages] = js.native
  var numberFormats: js.UndefOr[NumberFormats] = js.native
  var sharedMessages: js.UndefOr[LocaleMessages] = js.native
}

object DateTimeFormats {
  @scala.inline
  def apply(): DateTimeFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeFormats]
  }
  @scala.inline
  implicit class DateTimeFormatsOps[Self <: DateTimeFormats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDateTimeFormats(value: typings.vueI18n.mod.VueI18n.DateTimeFormats): Self = this.set("dateTimeFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTimeFormats: Self = this.set("dateTimeFormats", js.undefined)
    @scala.inline
    def setMessages(value: LocaleMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setNumberFormats(value: NumberFormats): Self = this.set("numberFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormats: Self = this.set("numberFormats", js.undefined)
    @scala.inline
    def setSharedMessages(value: LocaleMessages): Self = this.set("sharedMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedMessages: Self = this.set("sharedMessages", js.undefined)
  }
  
}

