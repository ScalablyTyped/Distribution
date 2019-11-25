package typings.tabulatorDashTables.Tabulator

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
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Sorter]
  }
}

