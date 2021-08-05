package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerDeviceUsage extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: PointerDeviceUsage](x: Self) {
    
    inline def setMaxLogical(value: Double): Self = StObject.set(x, "maxLogical", value.asInstanceOf[js.Any])
    
    inline def setMaxPhysical(value: Double): Self = StObject.set(x, "maxPhysical", value.asInstanceOf[js.Any])
    
    inline def setMinLogical(value: Double): Self = StObject.set(x, "minLogical", value.asInstanceOf[js.Any])
    
    inline def setMinPhysical(value: Double): Self = StObject.set(x, "minPhysical", value.asInstanceOf[js.Any])
    
    inline def setPhysicalMultiplier(value: Double): Self = StObject.set(x, "physicalMultiplier", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsagePage(value: Double): Self = StObject.set(x, "usagePage", value.asInstanceOf[js.Any])
  }
}
