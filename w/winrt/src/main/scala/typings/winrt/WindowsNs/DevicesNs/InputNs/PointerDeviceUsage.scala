package typings.winrt.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerDeviceUsage extends js.Object {
  var maxLogical: Double
  var maxPhysical: Double
  var minLogical: Double
  var minPhysical: Double
  var physicalMultiplier: Double
  var unit: Double
  var usage: Double
  var usagePage: Double
}

object PointerDeviceUsage {
  @scala.inline
  def apply(
    maxLogical: Double,
    maxPhysical: Double,
    minLogical: Double,
    minPhysical: Double,
    physicalMultiplier: Double,
    unit: Double,
    usage: Double,
    usagePage: Double
  ): PointerDeviceUsage = {
    val __obj = js.Dynamic.literal(maxLogical = maxLogical, maxPhysical = maxPhysical, minLogical = minLogical, minPhysical = minPhysical, physicalMultiplier = physicalMultiplier, unit = unit, usage = usage, usagePage = usagePage)
  
    __obj.asInstanceOf[PointerDeviceUsage]
  }
}

