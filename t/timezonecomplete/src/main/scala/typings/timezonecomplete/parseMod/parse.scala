package typings.timezonecomplete.parseMod

import typings.timezonecomplete.localeMod.PartialLocale
import typings.timezonecomplete.timezoneMod.TimeZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/parse", "parse")
@js.native
object parse extends js.Object {
  def apply(dateTimeString: String, formatString: String): AwareTimeStruct = js.native
  def apply(dateTimeString: String, formatString: String, overrideZone: Null, allowTrailing: Boolean): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  def apply(dateTimeString: String, formatString: String, overrideZone: TimeZone): AwareTimeStruct = js.native
  def apply(dateTimeString: String, formatString: String, overrideZone: TimeZone, allowTrailing: Boolean): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: TimeZone,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
}

