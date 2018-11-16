package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Pair")
@js.native
class Pair protected () extends js.Object {
  /** Creates a new Pair with the specified field name/value pairing */
  def this(fieldName: java.lang.String, value: java.lang.String) = this()
  /** Creates a new Pair with the specified field name/value pairing */
  def this(fieldName: java.lang.String, value: scala.Boolean) = this()
  /** Creates a new Pair with the specified field name/value pairing */
  def this(fieldName: java.lang.String, value: scala.Double) = this()
  /** Creates a new Pair with the specified field name/value pairing */
  def this(fieldName: java.lang.String, value: stdLib.Date) = this()
  /** The field name to which the value is applied. */
  var fieldName: java.lang.String = js.native
  /** The value formatted according to the locale and the formatting applied to the field. */
  var formattedValue: java.lang.String = js.native
  /** Contains the raw native value for the field as a JavaScript type, which is one of String, Number, Boolean, or Date. */
  var value: java.lang.String | scala.Double | scala.Boolean | stdLib.Date = js.native
}

