package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sorter extends js.Object {
  var column: java.lang.String
  var dir: SortDirection
}

object Sorter {
  @scala.inline
  def apply(column: java.lang.String, dir: SortDirection): Sorter = {
    val __obj = js.Dynamic.literal(column = column, dir = dir)
  
    __obj.asInstanceOf[Sorter]
  }
}

