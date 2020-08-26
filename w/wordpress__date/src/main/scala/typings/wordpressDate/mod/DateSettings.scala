package typings.wordpressDate.mod

import typings.wordpressDate.anon.Date
import typings.wordpressDate.anon.Locale
import typings.wordpressDate.anon.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateSettings extends js.Object {
  var formats: Date = js.native
  var l10n: Locale = js.native
  var timezone: Offset = js.native
}

object DateSettings {
  @scala.inline
  def apply(formats: Date, l10n: Locale, timezone: Offset): DateSettings = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateSettings]
  }
  @scala.inline
  implicit class DateSettingsOps[Self <: DateSettings] (val x: Self) extends AnyVal {
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
    def setFormats(value: Date): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def setL10n(value: Locale): Self = this.set("l10n", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimezone(value: Offset): Self = this.set("timezone", value.asInstanceOf[js.Any])
  }
  
}

