package typings.tableau.global.tableau

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.Pair")
@js.native
class Pair protected ()
  extends StObject
     with typings.tableau.tableau.Pair {
  /** Creates a new Pair with the specified field name/value pairing */
  def this(fieldName: String, value: String) = this()
  def this(fieldName: String, value: Boolean) = this()
  def this(fieldName: String, value: Double) = this()
  def this(fieldName: String, value: Date) = this()
  
  /** The field name to which the value is applied. */
  /* CompleteClass */
  var fieldName: String = js.native
  
  /** The value formatted according to the locale and the formatting applied to the field. */
  /* CompleteClass */
  var formattedValue: String = js.native
  
  /** Contains the raw native value for the field as a JavaScript type, which is one of String, Number, Boolean, or Date. */
  /* CompleteClass */
  var value: String | Double | Boolean | Date = js.native
}
