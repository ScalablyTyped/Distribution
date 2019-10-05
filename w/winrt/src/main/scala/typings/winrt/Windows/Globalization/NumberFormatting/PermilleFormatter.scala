package typings.winrt.Windows.Globalization.NumberFormatting

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.NumberFormatting.PermilleFormatter")
@js.native
class PermilleFormatter ()
  extends INumberFormatterOptions
     with INumberFormatter
     with INumberFormatter2
     with INumberParser {
  def this(languages: IIterable[String], geographicRegion: String) = this()
  /* CompleteClass */
  override var fractionDigits: Double = js.native
  /* CompleteClass */
  override var geographicRegion: String = js.native
  /* CompleteClass */
  override var integerDigits: Double = js.native
  /* CompleteClass */
  override var isDecimalPointAlwaysDisplayed: Boolean = js.native
  /* CompleteClass */
  override var isGrouped: Boolean = js.native
  /* CompleteClass */
  override var languages: IVectorView[String] = js.native
  /* CompleteClass */
  override var numeralSystem: String = js.native
  /* CompleteClass */
  override var resolvedGeographicRegion: String = js.native
  /* CompleteClass */
  override var resolvedLanguage: String = js.native
  /* CompleteClass */
  override def format(value: Double): String = js.native
  /* CompleteClass */
  override def formatDouble(value: Double): String = js.native
  /* CompleteClass */
  override def formatInt(value: Double): String = js.native
  /* CompleteClass */
  override def formatUInt(value: Double): String = js.native
  /* CompleteClass */
  override def parseDouble(text: String): Double = js.native
  /* CompleteClass */
  override def parseInt(text: String): Double = js.native
  /* CompleteClass */
  override def parseUInt(text: String): Double = js.native
}

