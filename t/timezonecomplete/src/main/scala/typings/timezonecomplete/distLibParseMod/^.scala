package typings.timezonecomplete.distLibParseMod

import typings.timezonecomplete.distLibLocaleMod.PartialLocale
import typings.timezonecomplete.distLibTimezoneMod.TimeZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/parse", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(dateTimeString: String, formatString: String): AwareTimeStruct = js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: Boolean
  ): AwareTimeStruct = js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  def parse(dateTimeString: String, formatString: String, overrideZone: Null, allowTrailing: Boolean): AwareTimeStruct = js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  def parse(dateTimeString: String, formatString: String, overrideZone: TimeZone): AwareTimeStruct = js.native
  def parse(dateTimeString: String, formatString: String, overrideZone: TimeZone, allowTrailing: Boolean): AwareTimeStruct = js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: TimeZone,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  def parseable(dateTimeString: String, formatString: String): Boolean = js.native
  def parseable(dateTimeString: String, formatString: String, allowTrailing: Boolean): Boolean = js.native
  def parseable(dateTimeString: String, formatString: String, allowTrailing: Boolean, locale: PartialLocale): Boolean = js.native
}

