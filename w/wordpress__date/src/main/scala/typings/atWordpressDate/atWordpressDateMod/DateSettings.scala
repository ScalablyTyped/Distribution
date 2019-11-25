package typings.atWordpressDate.atWordpressDateMod

import typings.atWordpressDate.Anon_Date
import typings.atWordpressDate.Anon_Locale
import typings.atWordpressDate.Anon_Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateSettings extends js.Object {
  var formats: Anon_Date
  var l10n: Anon_Locale
  var timezone: Anon_Offset
}

object DateSettings {
  @scala.inline
  def apply(formats: Anon_Date, l10n: Anon_Locale, timezone: Anon_Offset): DateSettings = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateSettings]
  }
}

