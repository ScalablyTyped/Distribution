package typings.tableau.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.DataValue")
@js.native
class DataValue () extends js.Object {
  /** The value formatted according to the locale and the formatting applied to the field or parameter. */
  var formattedValue: String = js.native
  /** Contains the raw native value as a JavaScript type, which is one of String, Number, Boolean, or Date */
  var value: js.Any = js.native
}

