package typings.tableau.global.tableau

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Pair")
@js.native
class Pair protected ()
  extends typings.tableau.tableau.Pair {
  /** Creates a new Pair with the specified field name/value pairing */
  def this(fieldName: String, value: String) = this()
  def this(fieldName: String, value: Boolean) = this()
  def this(fieldName: String, value: Double) = this()
  def this(fieldName: String, value: Date) = this()
}

