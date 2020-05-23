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
    localZone: js.UndefOr[Null | TimeZone],
    formatString: String
  ): String = js.native
  def format(
    dateTime: TimeStruct,
    utcTime: TimeStruct,
    localZone: js.UndefOr[Null | TimeZone],
    formatString: String,
    locale: PartialLocale
  ): String = js.native
}

