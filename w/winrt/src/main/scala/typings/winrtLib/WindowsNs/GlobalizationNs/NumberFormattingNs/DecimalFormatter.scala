package typings
package winrtLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.NumberFormatting.DecimalFormatter")
@js.native
class DecimalFormatter ()
  extends INumberFormatterOptions
     with INumberFormatter
     with INumberFormatter2
     with INumberParser {
  def this(languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], geographicRegion: java.lang.String) = this()
  /* CompleteClass */
  override var fractionDigits: scala.Double = js.native
  /* CompleteClass */
  override var geographicRegion: java.lang.String = js.native
  /* CompleteClass */
  override var integerDigits: scala.Double = js.native
  /* CompleteClass */
  override var isDecimalPointAlwaysDisplayed: scala.Boolean = js.native
  /* CompleteClass */
  override var isGrouped: scala.Boolean = js.native
  /* CompleteClass */
  override var languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /* CompleteClass */
  override var numeralSystem: java.lang.String = js.native
  /* CompleteClass */
  override var resolvedGeographicRegion: java.lang.String = js.native
  /* CompleteClass */
  override var resolvedLanguage: java.lang.String = js.native
  /* CompleteClass */
  override def format(value: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def formatDouble(value: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def formatInt(value: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def formatUInt(value: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def parseDouble(text: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def parseInt(text: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def parseUInt(text: java.lang.String): scala.Double = js.native
}

