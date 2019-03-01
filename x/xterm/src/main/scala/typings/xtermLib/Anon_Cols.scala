package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cols extends js.Object {
  var cols: scala.Double
  var rows: scala.Double
}

object Anon_Cols {
  @scala.inline
  def apply(cols: scala.Double, rows: scala.Double): Anon_Cols = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cols")(cols)
    __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[Anon_Cols]
  }
}

