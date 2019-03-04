package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerDeviceUsage extends js.Object {
  var maxLogical: scala.Double
  var maxPhysical: scala.Double
  var minLogical: scala.Double
  var minPhysical: scala.Double
  var physicalMultiplier: scala.Double
  var unit: scala.Double
  var usage: scala.Double
  var usagePage: scala.Double
}

object PointerDeviceUsage {
  @scala.inline
  def apply(
    maxLogical: scala.Double,
    maxPhysical: scala.Double,
    minLogical: scala.Double,
    minPhysical: scala.Double,
    physicalMultiplier: scala.Double,
    unit: scala.Double,
    usage: scala.Double,
    usagePage: scala.Double
  ): PointerDeviceUsage = {
    val __obj = js.Dynamic.literal(maxLogical = maxLogical, maxPhysical = maxPhysical, minLogical = minLogical, minPhysical = minPhysical, physicalMultiplier = physicalMultiplier, unit = unit, usage = usage, usagePage = usagePage)
  
    __obj.asInstanceOf[PointerDeviceUsage]
  }
}

