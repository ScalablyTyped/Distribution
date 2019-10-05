package typings.winrtDashUwp.Windows.Globalization.NumberFormatting

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
  sealed trait useCurrencyCode extends CurrencyFormatterMode
  
  /** Default behavior. Currencies are formatted with the appropriate currency symbol (for example, $15). */
  @js.native
  sealed trait useSymbol extends CurrencyFormatterMode
  
  /* 1 */ val useCurrencyCode: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.CurrencyFormatterMode.useCurrencyCode with Double = js.native
  /* 0 */ val useSymbol: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.CurrencyFormatterMode.useSymbol with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CurrencyFormatterMode with Double] = js.native
}

