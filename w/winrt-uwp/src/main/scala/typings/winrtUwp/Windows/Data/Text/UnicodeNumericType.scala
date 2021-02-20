package typings.winrtUwp.Windows.Data.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnicodeNumericType extends StObject
/** Defines the type of numeral when a Unicode character represents a number. */
@JSGlobal("Windows.Data.Text.UnicodeNumericType")
@js.native
object UnicodeNumericType extends StObject {
  
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
}
