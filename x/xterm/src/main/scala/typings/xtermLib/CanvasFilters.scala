package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasFilters extends js.Object {
  var filter: java.lang.String
}

object CanvasFilters {
  @scala.inline
  def apply(filter: java.lang.String): CanvasFilters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[CanvasFilters]
  }
}

