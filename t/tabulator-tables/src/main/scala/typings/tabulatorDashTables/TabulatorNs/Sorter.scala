package typings.tabulatorDashTables.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sorter extends js.Object {
  var column: String
  var dir: SortDirection
}

object Sorter {
  @scala.inline
  def apply(column: String, dir: SortDirection): Sorter = {
    val __obj = js.Dynamic.literal(column = column, dir = dir)
  
    __obj.asInstanceOf[Sorter]
  }
}

