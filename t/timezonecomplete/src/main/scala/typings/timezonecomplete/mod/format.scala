package typings.timezonecomplete.mod

import typings.timezonecomplete.localeMod.PartialLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "format")
@js.native
object format extends js.Object {
  def apply(
    dateTime: typings.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.basicsMod.TimeStruct,
    localZone: js.UndefOr[Null | typings.timezonecomplete.timezoneMod.TimeZone],
    formatString: String
  ): String = js.native
  def apply(
    dateTime: typings.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.basicsMod.TimeStruct,
    localZone: js.UndefOr[Null | typings.timezonecomplete.timezoneMod.TimeZone],
    formatString: String,
    locale: PartialLocale
  ): String = js.native
}

