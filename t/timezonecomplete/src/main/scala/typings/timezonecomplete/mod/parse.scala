package typings.timezonecomplete.mod

import typings.timezonecomplete.localeMod.PartialLocale
import typings.timezonecomplete.parseMod.AwareTimeStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "parse")
@js.native
object parse extends js.Object {
  def apply(dateTimeString: String, formatString: String): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: Boolean
  ): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  def apply(dateTimeString: String, formatString: String, overrideZone: Null, allowTrailing: Boolean): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: typings.timezonecomplete.timezoneMod.TimeZone
  ): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: typings.timezonecomplete.timezoneMod.TimeZone,
    allowTrailing: Boolean
  ): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: typings.timezonecomplete.timezoneMod.TimeZone,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
}

