package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatteryData extends StObject {
  
  var acConnected: Boolean
  
  var additionalBatteries: js.UndefOr[js.Array[BatteryData]] = js.undefined
  
  var capacityUnit: String
  
  var currentCapacity: Double
  
  var cycleCount: Double
  
  var designedCapacity: Double
  
  var hasBattery: Boolean
  
  var isCharging: Boolean
  
  var manufacturer: String
  
  var maxCapacity: Double
  
  var model: String
  
  var percent: Double
  
  var serial: String
  
  var timeRemaining: Double
  
  var `type`: String
  
  var voltage: Double
}
object BatteryData {
  
  inline def apply(
    acConnected: Boolean,
    capacityUnit: String,
    currentCapacity: Double,
    cycleCount: Double,
    designedCapacity: Double,
    hasBattery: Boolean,
    isCharging: Boolean,
    manufacturer: String,
    maxCapacity: Double,
    model: String,
    percent: Double,
    serial: String,
    timeRemaining: Double,
    `type`: String,
    voltage: Double
  ): BatteryData = {
    val __obj = js.Dynamic.literal(acConnected = acConnected.asInstanceOf[js.Any], capacityUnit = capacityUnit.asInstanceOf[js.Any], currentCapacity = currentCapacity.asInstanceOf[js.Any], cycleCount = cycleCount.asInstanceOf[js.Any], designedCapacity = designedCapacity.asInstanceOf[js.Any], hasBattery = hasBattery.asInstanceOf[js.Any], isCharging = isCharging.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], maxCapacity = maxCapacity.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], timeRemaining = timeRemaining.asInstanceOf[js.Any], voltage = voltage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatteryData]
  }
  
  extension [Self <: BatteryData](x: Self) {
    
    inline def setAcConnected(value: Boolean): Self = StObject.set(x, "acConnected", value.asInstanceOf[js.Any])
    
    inline def setAdditionalBatteries(value: js.Array[BatteryData]): Self = StObject.set(x, "additionalBatteries", value.asInstanceOf[js.Any])
    
    inline def setAdditionalBatteriesUndefined: Self = StObject.set(x, "additionalBatteries", js.undefined)
    
    inline def setAdditionalBatteriesVarargs(value: BatteryData*): Self = StObject.set(x, "additionalBatteries", js.Array(value*))
    
    inline def setCapacityUnit(value: String): Self = StObject.set(x, "capacityUnit", value.asInstanceOf[js.Any])
    
    inline def setCurrentCapacity(value: Double): Self = StObject.set(x, "currentCapacity", value.asInstanceOf[js.Any])
    
    inline def setCycleCount(value: Double): Self = StObject.set(x, "cycleCount", value.asInstanceOf[js.Any])
    
    inline def setDesignedCapacity(value: Double): Self = StObject.set(x, "designedCapacity", value.asInstanceOf[js.Any])
    
    inline def setHasBattery(value: Boolean): Self = StObject.set(x, "hasBattery", value.asInstanceOf[js.Any])
    
    inline def setIsCharging(value: Boolean): Self = StObject.set(x, "isCharging", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacity(value: Double): Self = StObject.set(x, "maxCapacity", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setTimeRemaining(value: Double): Self = StObject.set(x, "timeRemaining", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVoltage(value: Double): Self = StObject.set(x, "voltage", value.asInstanceOf[js.Any])
  }
}
