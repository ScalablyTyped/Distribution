package typings.tableau.tableau

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Pair")
@js.native
class Pair protected () extends js.Object {
  /** Creates a new Pair with the specified field name/value pairing */
  def this(fieldName: String, value: String) = this()
  def this(fieldName: String, value: Boolean) = this()
  def this(fieldName: String, value: Double) = this()
  def this(fieldName: String, value: Date) = this()
  /** The field name to which the value is applied. */
  var fieldName: String = js.native
  /** The value formatted according to the locale and the formatting applied to the field. */
  var formattedValue: String = js.native
  /** Contains the raw native value for the field as a JavaScript type, which is one of String, Number, Boolean, or Date. */
  var value: String | Double | Boolean | Date = js.native
}

