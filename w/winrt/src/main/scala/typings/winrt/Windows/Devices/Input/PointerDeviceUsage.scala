package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerDeviceUsage extends js.Object {
  
  var maxLogical: Double = js.native
  
  var maxPhysical: Double = js.native
  
  var minLogical: Double = js.native
  
  var minPhysical: Double = js.native
  
  var physicalMultiplier: Double = js.native
  
  var unit: Double = js.native
  
  var usage: Double = js.native
  
  var usagePage: Double = js.native
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
    val __obj = js.Dynamic.literal(maxLogical = maxLogical.asInstanceOf[js.Any], maxPhysical = maxPhysical.asInstanceOf[js.Any], minLogical = minLogical.asInstanceOf[js.Any], minPhysical = minPhysical.asInstanceOf[js.Any], physicalMultiplier = physicalMultiplier.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerDeviceUsage]
  }
  
  @scala.inline
  implicit class PointerDeviceUsageOps[Self <: PointerDeviceUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxLogical(value: Double): Self = this.set("maxLogical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPhysical(value: Double): Self = this.set("maxPhysical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLogical(value: Double): Self = this.set("minLogical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPhysical(value: Double): Self = this.set("minPhysical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalMultiplier(value: Double): Self = this.set("physicalMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: Double): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: Double): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePage(value: Double): Self = this.set("usagePage", value.asInstanceOf[js.Any])
  }
}
