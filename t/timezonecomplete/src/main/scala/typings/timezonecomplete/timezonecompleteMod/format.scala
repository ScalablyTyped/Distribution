package typings.timezonecomplete.timezonecompleteMod

import typings.timezonecomplete.distLibLocaleMod.PartialLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "format")
@js.native
object format extends js.Object {
  def apply(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String
  ): String = js.native
  def apply(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  def apply(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: Null,
    formatString: String
  ): String = js.native
  def apply(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: Null,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  def apply(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    formatString: String
  ): String = js.native
  def apply(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
}

