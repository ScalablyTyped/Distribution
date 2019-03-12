package typings
package timezonecompleteLib.distLibParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/parse", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(dateTimeString: java.lang.String, formatString: java.lang.String): AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: scala.Boolean
  ): AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: scala.Boolean,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale
  ): AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: scala.Null,
    allowTrailing: scala.Boolean
  ): AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: scala.Null,
    allowTrailing: scala.Boolean,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale
  ): AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: timezonecompleteLib.distLibTimezoneMod.TimeZone
  ): AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: timezonecompleteLib.distLibTimezoneMod.TimeZone,
    allowTrailing: scala.Boolean
  ): AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: timezonecompleteLib.distLibTimezoneMod.TimeZone,
    allowTrailing: scala.Boolean,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale
  ): AwareTimeStruct = js.native
  def parseable(dateTimeString: java.lang.String, formatString: java.lang.String): scala.Boolean = js.native
  def parseable(dateTimeString: java.lang.String, formatString: java.lang.String, allowTrailing: scala.Boolean): scala.Boolean = js.native
  def parseable(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    allowTrailing: scala.Boolean,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale
  ): scala.Boolean = js.native
}

