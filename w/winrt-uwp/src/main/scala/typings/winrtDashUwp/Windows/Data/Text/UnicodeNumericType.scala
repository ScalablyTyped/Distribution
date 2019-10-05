package typings.winrtDashUwp.Windows.Data.Text

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
  sealed trait decimal extends UnicodeNumericType
  
  /** A digit in the range 0 through 9 that is used in special contexts. */
  @js.native
  sealed trait digit extends UnicodeNumericType
  
  /** Not a numeric character. */
  @js.native
  sealed trait none extends UnicodeNumericType
  
  /** A character that represents another type of numeric value, such as a fraction. */
  @js.native
  sealed trait numeric extends UnicodeNumericType
  
  /* 1 */ val decimal: typings.winrtDashUwp.Windows.Data.Text.UnicodeNumericType.decimal with Double = js.native
  /* 2 */ val digit: typings.winrtDashUwp.Windows.Data.Text.UnicodeNumericType.digit with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Data.Text.UnicodeNumericType.none with Double = js.native
  /* 3 */ val numeric: typings.winrtDashUwp.Windows.Data.Text.UnicodeNumericType.numeric with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnicodeNumericType with Double] = js.native
}

