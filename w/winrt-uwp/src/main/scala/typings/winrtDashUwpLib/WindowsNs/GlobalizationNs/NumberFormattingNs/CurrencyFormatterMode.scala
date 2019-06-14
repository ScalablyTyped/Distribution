package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CurrencyFormatterMode extends js.Object

/** Specifies the use of symbols or codes when currency is formatted. */
@JSGlobal("Windows.Globalization.NumberFormatting.CurrencyFormatterMode")
@js.native
object CurrencyFormatterMode extends js.Object {
  /** Currencies are formatted with the Currency code provided to the CurrencyFormatter object (for example, 15 USD). */
  @js.native
  sealed trait useCurrencyCode
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.CurrencyFormatterMode
  
  /** Default behavior. Currencies are formatted with the appropriate currency symbol (for example, $15). */
  @js.native
  sealed trait useSymbol
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.CurrencyFormatterMode
  
  /* 1 */ val useCurrencyCode: useCurrencyCode with scala.Double = js.native
  /* 0 */ val useSymbol: useSymbol with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.CurrencyFormatterMode with scala.Double
  ] = js.native
}

