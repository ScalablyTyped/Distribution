package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3. CPU, Memory, Disks, Battery, Graphics
trait CpuData extends StObject {
  
  var brand: String
  
  var cache: CpuCacheData
  
  var cores: Double
  
  var efficiencyCores: js.UndefOr[Double] = js.undefined
  
  var family: String
  
  var flags: String
  
  var governor: String
  
  var manufacturer: String
  
  var model: String
  
  var performanceCores: js.UndefOr[Double] = js.undefined
  
  var physicalCores: Double
  
  var processors: Double
  
  var revision: String
  
  var socket: String
  
  var speed: Double
  
  var speedMax: Double
  
  var speedMin: Double
  
  var stepping: String
  
  var vendor: String
  
  var virtualization: Boolean
  
  var voltage: String
}
object CpuData {
  
  inline def apply(
    brand: String,
    cache: CpuCacheData,
    cores: Double,
    family: String,
    flags: String,
    governor: String,
    manufacturer: String,
    model: String,
    physicalCores: Double,
    processors: Double,
    revision: String,
    socket: String,
    speed: Double,
    speedMax: Double,
    speedMin: Double,
    stepping: String,
    vendor: String,
    virtualization: Boolean,
    voltage: String
  ): CpuData = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cores = cores.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], governor = governor.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], physicalCores = physicalCores.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], speedMax = speedMax.asInstanceOf[js.Any], speedMin = speedMin.asInstanceOf[js.Any], stepping = stepping.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], virtualization = virtualization.asInstanceOf[js.Any], voltage = voltage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuData]
  }
  
  extension [Self <: CpuData](x: Self) {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setCache(value: CpuCacheData): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCores(value: Double): Self = StObject.set(x, "cores", value.asInstanceOf[js.Any])
    
    inline def setEfficiencyCores(value: Double): Self = StObject.set(x, "efficiencyCores", value.asInstanceOf[js.Any])
    
    inline def setEfficiencyCoresUndefined: Self = StObject.set(x, "efficiencyCores", js.undefined)
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGovernor(value: String): Self = StObject.set(x, "governor", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setPerformanceCores(value: Double): Self = StObject.set(x, "performanceCores", value.asInstanceOf[js.Any])
    
    inline def setPerformanceCoresUndefined: Self = StObject.set(x, "performanceCores", js.undefined)
    
    inline def setPhysicalCores(value: Double): Self = StObject.set(x, "physicalCores", value.asInstanceOf[js.Any])
    
    inline def setProcessors(value: Double): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setSocket(value: String): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedMax(value: Double): Self = StObject.set(x, "speedMax", value.asInstanceOf[js.Any])
    
    inline def setSpeedMin(value: Double): Self = StObject.set(x, "speedMin", value.asInstanceOf[js.Any])
    
    inline def setStepping(value: String): Self = StObject.set(x, "stepping", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVirtualization(value: Boolean): Self = StObject.set(x, "virtualization", value.asInstanceOf[js.Any])
    
    inline def setVoltage(value: String): Self = StObject.set(x, "voltage", value.asInstanceOf[js.Any])
  }
}
