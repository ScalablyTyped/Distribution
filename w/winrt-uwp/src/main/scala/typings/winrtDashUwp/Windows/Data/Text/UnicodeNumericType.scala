package typings.winrtDashUwp.Windows.Data.Text

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Data.Text.UnicodeNumericType.decimal
import typings.winrtDashUwp.Windows.Data.Text.UnicodeNumericType.digit
import typings.winrtDashUwp.Windows.Data.Text.UnicodeNumericType.none
import typings.winrtDashUwp.Windows.Data.Text.UnicodeNumericType.numeric
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnicodeNumericType with Double] = js.native
  /* 1 */ @js.native
  object decimal extends TopLevel[decimal with Double]
  
  /* 2 */ @js.native
  object digit extends TopLevel[digit with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object numeric extends TopLevel[numeric with Double]
  
}

