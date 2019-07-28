package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

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
    val __obj = js.Dynamic.literal(end = end, level = level, start = start)
  
    __obj.asInstanceOf[FilterGroup]
  }
}

