package typings.timezonecomplete.timezonecompleteMod

import typings.timezonecomplete.distLibLocaleMod.PartialLocale
import typings.timezonecomplete.distLibParseMod.AwareTimeStruct
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
    overrideZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
  ): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    allowTrailing: Boolean
  ): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
}

