package typings.tablesorter.mod._Global_

import typings.tablesorter.tablesorterMod.Tablesorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic[TElement] extends js.Object {
  /**
    * The tablesorter.
    */
  var tablesorter: Tablesorter[TElement]
}

object JQueryStatic {
  @scala.inline
  def apply[TElement](tablesorter: Tablesorter[TElement]): JQueryStatic[TElement] = {
    val __obj = js.Dynamic.literal(tablesorter = tablesorter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQueryStatic[TElement]]
  }
}

