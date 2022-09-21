package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphicsControllerData extends StObject {
  
  var bus: String
  
  var busAddress: js.UndefOr[String] = js.undefined
  
  var clockCore: js.UndefOr[Double] = js.undefined
  
  var clockMemory: js.UndefOr[Double] = js.undefined
  
  var cores: js.UndefOr[Double] = js.undefined
  
  var deviceId: js.UndefOr[String] = js.undefined
  
  var driverVersion: js.UndefOr[String] = js.undefined
  
  var external: js.UndefOr[Boolean] = js.undefined
  
  var fanSpeed: js.UndefOr[Double] = js.undefined
  
  var memoryFree: js.UndefOr[Double] = js.undefined
  
  var memoryTotal: js.UndefOr[Double] = js.undefined
  
  var memoryUsed: js.UndefOr[Double] = js.undefined
  
  var metalVersion: js.UndefOr[String] = js.undefined
  
  var model: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var pciBus: js.UndefOr[String] = js.undefined
  
  var pciID: js.UndefOr[String] = js.undefined
  
  var powerDraw: js.UndefOr[Double] = js.undefined
  
  var powerLimit: js.UndefOr[Double] = js.undefined
  
  var subDeviceId: js.UndefOr[String] = js.undefined
  
  var temperatureGpu: js.UndefOr[Double] = js.undefined
  
  var temperatureMemory: js.UndefOr[Double] = js.undefined
  
  var utilizationGpu: js.UndefOr[Double] = js.undefined
  
  var utilizationMemory: js.UndefOr[Double] = js.undefined
  
  var vendor: String
  
  var vendorId: js.UndefOr[String] = js.undefined
  
  var vram: Double | Null
  
  var vramDynamic: Boolean
}
object GraphicsControllerData {
  
  inline def apply(bus: String, model: String, vendor: String, vramDynamic: Boolean): GraphicsControllerData = {
    val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vramDynamic = vramDynamic.asInstanceOf[js.Any], vram = null)
    __obj.asInstanceOf[GraphicsControllerData]
  }
  
  extension [Self <: GraphicsControllerData](x: Self) {
    
    inline def setBus(value: String): Self = StObject.set(x, "bus", value.asInstanceOf[js.Any])
    
    inline def setBusAddress(value: String): Self = StObject.set(x, "busAddress", value.asInstanceOf[js.Any])
    
    inline def setBusAddressUndefined: Self = StObject.set(x, "busAddress", js.undefined)
    
    inline def setClockCore(value: Double): Self = StObject.set(x, "clockCore", value.asInstanceOf[js.Any])
    
    inline def setClockCoreUndefined: Self = StObject.set(x, "clockCore", js.undefined)
    
    inline def setClockMemory(value: Double): Self = StObject.set(x, "clockMemory", value.asInstanceOf[js.Any])
    
    inline def setClockMemoryUndefined: Self = StObject.set(x, "clockMemory", js.undefined)
    
    inline def setCores(value: Double): Self = StObject.set(x, "cores", value.asInstanceOf[js.Any])
    
    inline def setCoresUndefined: Self = StObject.set(x, "cores", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDriverVersion(value: String): Self = StObject.set(x, "driverVersion", value.asInstanceOf[js.Any])
    
    inline def setDriverVersionUndefined: Self = StObject.set(x, "driverVersion", js.undefined)
    
    inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setFanSpeed(value: Double): Self = StObject.set(x, "fanSpeed", value.asInstanceOf[js.Any])
    
    inline def setFanSpeedUndefined: Self = StObject.set(x, "fanSpeed", js.undefined)
    
    inline def setMemoryFree(value: Double): Self = StObject.set(x, "memoryFree", value.asInstanceOf[js.Any])
    
    inline def setMemoryFreeUndefined: Self = StObject.set(x, "memoryFree", js.undefined)
    
    inline def setMemoryTotal(value: Double): Self = StObject.set(x, "memoryTotal", value.asInstanceOf[js.Any])
    
    inline def setMemoryTotalUndefined: Self = StObject.set(x, "memoryTotal", js.undefined)
    
    inline def setMemoryUsed(value: Double): Self = StObject.set(x, "memoryUsed", value.asInstanceOf[js.Any])
    
    inline def setMemoryUsedUndefined: Self = StObject.set(x, "memoryUsed", js.undefined)
    
    inline def setMetalVersion(value: String): Self = StObject.set(x, "metalVersion", value.asInstanceOf[js.Any])
    
    inline def setMetalVersionUndefined: Self = StObject.set(x, "metalVersion", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPciBus(value: String): Self = StObject.set(x, "pciBus", value.asInstanceOf[js.Any])
    
    inline def setPciBusUndefined: Self = StObject.set(x, "pciBus", js.undefined)
    
    inline def setPciID(value: String): Self = StObject.set(x, "pciID", value.asInstanceOf[js.Any])
    
    inline def setPciIDUndefined: Self = StObject.set(x, "pciID", js.undefined)
    
    inline def setPowerDraw(value: Double): Self = StObject.set(x, "powerDraw", value.asInstanceOf[js.Any])
    
    inline def setPowerDrawUndefined: Self = StObject.set(x, "powerDraw", js.undefined)
    
    inline def setPowerLimit(value: Double): Self = StObject.set(x, "powerLimit", value.asInstanceOf[js.Any])
    
    inline def setPowerLimitUndefined: Self = StObject.set(x, "powerLimit", js.undefined)
    
    inline def setSubDeviceId(value: String): Self = StObject.set(x, "subDeviceId", value.asInstanceOf[js.Any])
    
    inline def setSubDeviceIdUndefined: Self = StObject.set(x, "subDeviceId", js.undefined)
    
    inline def setTemperatureGpu(value: Double): Self = StObject.set(x, "temperatureGpu", value.asInstanceOf[js.Any])
    
    inline def setTemperatureGpuUndefined: Self = StObject.set(x, "temperatureGpu", js.undefined)
    
    inline def setTemperatureMemory(value: Double): Self = StObject.set(x, "temperatureMemory", value.asInstanceOf[js.Any])
    
    inline def setTemperatureMemoryUndefined: Self = StObject.set(x, "temperatureMemory", js.undefined)
    
    inline def setUtilizationGpu(value: Double): Self = StObject.set(x, "utilizationGpu", value.asInstanceOf[js.Any])
    
    inline def setUtilizationGpuUndefined: Self = StObject.set(x, "utilizationGpu", js.undefined)
    
    inline def setUtilizationMemory(value: Double): Self = StObject.set(x, "utilizationMemory", value.asInstanceOf[js.Any])
    
    inline def setUtilizationMemoryUndefined: Self = StObject.set(x, "utilizationMemory", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
    
    inline def setVendorIdUndefined: Self = StObject.set(x, "vendorId", js.undefined)
    
    inline def setVram(value: Double): Self = StObject.set(x, "vram", value.asInstanceOf[js.Any])
    
    inline def setVramDynamic(value: Boolean): Self = StObject.set(x, "vramDynamic", value.asInstanceOf[js.Any])
    
    inline def setVramNull: Self = StObject.set(x, "vram", null)
  }
}
