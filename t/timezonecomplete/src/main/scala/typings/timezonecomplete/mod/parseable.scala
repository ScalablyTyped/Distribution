package typings.timezonecomplete.mod

import typings.timezonecomplete.localeMod.PartialLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "parseable")
@js.native
object parseable extends js.Object {
  def apply(dateTimeString: String, formatString: String): Boolean = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    allowTrailing: js.UndefOr[scala.Nothing],
    locale: PartialLocale
  ): Boolean = js.native
  def apply(dateTimeString: String, formatString: String, allowTrailing: Boolean): Boolean = js.native
  def apply(dateTimeString: String, formatString: String, allowTrailing: Boolean, locale: PartialLocale): Boolean = js.native
}

