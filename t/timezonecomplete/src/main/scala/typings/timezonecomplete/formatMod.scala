package typings.timezonecomplete

import typings.timezonecomplete.basicsMod.TimeStruct
import typings.timezonecomplete.localeMod.PartialLocale
import typings.timezonecomplete.timezoneMod.TimeZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/format", JSImport.Namespace)
@js.native
object formatMod extends js.Object {
  def format(
    dateTime: TimeStruct,
    utcTime: TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String
  ): String = js.native
  def format(
    dateTime: TimeStruct,
    utcTime: TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  def format(dateTime: TimeStruct, utcTime: TimeStruct, localZone: Null, formatString: String): String = js.native
  def format(
    dateTime: TimeStruct,
    utcTime: TimeStruct,
    localZone: Null,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  def format(dateTime: TimeStruct, utcTime: TimeStruct, localZone: TimeZone, formatString: String): String = js.native
  def format(
    dateTime: TimeStruct,
    utcTime: TimeStruct,
    localZone: TimeZone,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
}

