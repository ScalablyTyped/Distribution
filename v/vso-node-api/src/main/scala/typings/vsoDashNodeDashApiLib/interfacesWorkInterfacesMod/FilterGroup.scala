package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterGroup extends js.Object {
  var end: scala.Double
  var level: scala.Double
  var start: scala.Double
}

object FilterGroup {
  @scala.inline
  def apply(end: scala.Double, level: scala.Double, start: scala.Double): FilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[FilterGroup]
  }
}

