package typings
package atWordpressDateLib.atWordpressDateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateSettings extends js.Object {
  var formats: atWordpressDateLib.Anon_Date
  var l10n: atWordpressDateLib.Anon_Locale
  var timezone: atWordpressDateLib.Anon_Offset
}

object DateSettings {
  @scala.inline
  def apply(
    formats: atWordpressDateLib.Anon_Date,
    l10n: atWordpressDateLib.Anon_Locale,
    timezone: atWordpressDateLib.Anon_Offset
  ): DateSettings = {
    val __obj = js.Dynamic.literal(formats = formats, l10n = l10n, timezone = timezone)
  
    __obj.asInstanceOf[DateSettings]
  }
}

