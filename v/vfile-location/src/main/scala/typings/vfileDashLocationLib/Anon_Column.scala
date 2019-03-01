package typings
package vfileDashLocationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: scala.Double
  var line: scala.Double
}

object Anon_Column {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double): Anon_Column = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[Anon_Column]
  }
}

