package typings
package winrtDashUwpLib.WindowsNs.DataNs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnicodeNumericType extends js.Object

/** Defines the type of numeral when a Unicode character represents a number. */
@JSGlobal("Windows.Data.Text.UnicodeNumericType")
@js.native
object UnicodeNumericType extends js.Object {
  /** A decimal digit in a decimal system that uses 0 through 9. */
  @js.native
  sealed trait decimal
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeNumericType
  
  /** A digit in the range 0 through 9 that is used in special contexts. */
  @js.native
  sealed trait digit
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeNumericType
  
  /** Not a numeric character. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeNumericType
  
  /** A character that represents another type of numeric value, such as a fraction. */
  @js.native
  sealed trait numeric
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeNumericType
  
  val decimal: decimal with java.lang.String = js.native
  val digit: digit with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val numeric: numeric with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeNumericType with java.lang.String] = js.native
}

