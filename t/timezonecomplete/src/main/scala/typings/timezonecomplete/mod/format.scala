package typings.timezonecomplete.mod

import typings.timezonecomplete.localeMod.PartialLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezonecomplete", "format")
@js.native
object format extends js.Object {
  
  def apply(
    dateTime: typings.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.basicsMod.TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String
  ): String = js.native
  def apply(
    dateTime: typings.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.basicsMod.TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  def apply(
    dateTime: typings.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.basicsMod.TimeStruct,
    localZone: Null,
    formatString: String
  ): String = js.native
  def apply(
    dateTime: typings.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.basicsMod.TimeStruct,
    localZone: Null,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  def apply(
    dateTime: typings.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.basicsMod.TimeStruct,
    localZone: typings.timezonecomplete.timezoneMod.TimeZone,
    formatString: String
  ): String = js.native
  def apply(
    dateTime: typings.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.basicsMod.TimeStruct,
    localZone: typings.timezonecomplete.timezoneMod.TimeZone,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
}
