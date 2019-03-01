package typings
package tokenizrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: scala.Double
  var len: scala.Double
  var line: scala.Double
  var pos: scala.Double
}

object Anon_Column {
  @scala.inline
  def apply(column: scala.Double, len: scala.Double, line: scala.Double, pos: scala.Double): Anon_Column = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("len")(len)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("pos")(pos)
    __obj.asInstanceOf[Anon_Column]
  }
}

