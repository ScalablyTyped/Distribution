package typings.timezonecomplete

import typings.timezonecomplete.basicsMod.TimeStruct
import typings.timezonecomplete.localeMod.PartialLocale
import typings.timezonecomplete.timezoneMod.TimeZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  @JSImport("timezonecomplete/dist/lib/format", "format")
  @js.native
  def format(
    dateTime: TimeStruct,
    utcTime: TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String
  ): String = js.native
  @JSImport("timezonecomplete/dist/lib/format", "format")
  @js.native
  def format(
    dateTime: TimeStruct,
    utcTime: TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  @JSImport("timezonecomplete/dist/lib/format", "format")
  @js.native
  def format(dateTime: TimeStruct, utcTime: TimeStruct, localZone: Null, formatString: String): String = js.native
  @JSImport("timezonecomplete/dist/lib/format", "format")
  @js.native
  def format(
    dateTime: TimeStruct,
    utcTime: TimeStruct,
    localZone: Null,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  @JSImport("timezonecomplete/dist/lib/format", "format")
  @js.native
  def format(dateTime: TimeStruct, utcTime: TimeStruct, localZone: TimeZone, formatString: String): String = js.native
  @JSImport("timezonecomplete/dist/lib/format", "format")
  @js.native
  def format(
    dateTime: TimeStruct,
    utcTime: TimeStruct,
    localZone: TimeZone,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
}
