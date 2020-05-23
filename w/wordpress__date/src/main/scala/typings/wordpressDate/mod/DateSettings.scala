package typings.wordpressDate.mod

import typings.wordpressDate.anon.Date
import typings.wordpressDate.anon.Locale
import typings.wordpressDate.anon.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateSettings extends js.Object {
  var formats: Date
  var l10n: Locale
  var timezone: Offset
}

object DateSettings {
  @scala.inline
  def apply(formats: Date, l10n: Locale, timezone: Offset): DateSettings = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateSettings]
  }
}

