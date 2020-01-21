package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterGroup extends js.Object {
  var end: Double
  var level: Double
  var start: Double
}

object FilterGroup {
  @scala.inline
  def apply(end: Double, level: Double, start: Double): FilterGroup = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilterGroup]
  }
}

