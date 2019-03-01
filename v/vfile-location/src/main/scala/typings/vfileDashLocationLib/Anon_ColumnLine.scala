package typings
package vfileDashLocationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnLine extends js.Object {
  var column: scala.Double
  var line: scala.Double
  var offset: scala.Double
}

object Anon_ColumnLine {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, offset: scala.Double): Anon_ColumnLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Anon_ColumnLine]
  }
}

