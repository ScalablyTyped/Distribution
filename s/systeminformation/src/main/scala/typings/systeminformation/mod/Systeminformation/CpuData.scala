package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3. CPU, Memory, Disks, Battery, Graphics
trait CpuData extends StObject {
  
  var brand: String
  
  var cache: CpuCacheData
  
  var cores: Double
  
  var family: String
  
  var governor: String
  
  var manufacturer: String
  
  var model: String
  
  var physicalCores: Double
  
  var processors: Double
  
  var revision: String
  
  var socket: String
  
  var speed: String
  
  var speedmax: String
  
  var speedmin: String
  
  var stepping: String
  
  var vendor: String
  
  var voltage: String
}
object CpuData {
  
  @scala.inline
  def apply(
    brand: String,
    cache: CpuCacheData,
    cores: Double,
    family: String,
    governor: String,
    manufacturer: String,
    model: String,
    physicalCores: Double,
    processors: Double,
    revision: String,
    socket: String,
    speed: String,
    speedmax: String,
    speedmin: String,
    stepping: String,
    vendor: String,
    voltage: String
  ): CpuData = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cores = cores.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], governor = governor.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], physicalCores = physicalCores.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], speedmax = speedmax.asInstanceOf[js.Any], speedmin = speedmin.asInstanceOf[js.Any], stepping = stepping.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], voltage = voltage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuData]
  }
  
  @scala.inline
  implicit class CpuDataMutableBuilder[Self <: CpuData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache(value: CpuCacheData): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCores(value: Double): Self = StObject.set(x, "cores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGovernor(value: String): Self = StObject.set(x, "governor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalCores(value: Double): Self = StObject.set(x, "physicalCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessors(value: Double): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocket(value: String): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedmax(value: String): Self = StObject.set(x, "speedmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedmin(value: String): Self = StObject.set(x, "speedmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepping(value: String): Self = StObject.set(x, "stepping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoltage(value: String): Self = StObject.set(x, "voltage", value.asInstanceOf[js.Any])
  }
}
