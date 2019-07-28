package typings.winrt.WindowsNs.GlobalizationNs.NumberFormattingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.NumberFormatting.CurrencyFormatter")
@js.native
class CurrencyFormatter protected () extends ICurrencyFormatter {
  def this(currencyCode: String) = this()
  def this(currencyCode: String, languages: IIterable[String], geographicRegion: String) = this()
  /* CompleteClass */
  override var currency: String = js.native
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

