package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemLayoutData extends StObject {
  
  var bank: String
  
  var clockSpeed: Double | Null
  
  var ecc: js.UndefOr[Boolean | Null] = js.undefined
  
  var formFactor: String
  
  var manufacturer: js.UndefOr[String] = js.undefined
  
  var partNum: String
  
  var serialNum: String
  
  var size: Double
  
  var `type`: String
  
  var voltageConfigured: Double | Null
  
  var voltageMax: Double | Null
  
  var voltageMin: Double | Null
}
object MemLayoutData {
  
  inline def apply(bank: String, formFactor: String, partNum: String, serialNum: String, size: Double, `type`: String): MemLayoutData = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any], formFactor = formFactor.asInstanceOf[js.Any], partNum = partNum.asInstanceOf[js.Any], serialNum = serialNum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], clockSpeed = null, voltageConfigured = null, voltageMax = null, voltageMin = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemLayoutData]
  }
  
  extension [Self <: MemLayoutData](x: Self) {
    
    inline def setBank(value: String): Self = StObject.set(x, "bank", value.asInstanceOf[js.Any])
    
    inline def setClockSpeed(value: Double): Self = StObject.set(x, "clockSpeed", value.asInstanceOf[js.Any])
    
    inline def setClockSpeedNull: Self = StObject.set(x, "clockSpeed", null)
    
    inline def setEcc(value: Boolean): Self = StObject.set(x, "ecc", value.asInstanceOf[js.Any])
    
    inline def setEccNull: Self = StObject.set(x, "ecc", null)
    
    inline def setEccUndefined: Self = StObject.set(x, "ecc", js.undefined)
    
    inline def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setPartNum(value: String): Self = StObject.set(x, "partNum", value.asInstanceOf[js.Any])
    
    inline def setSerialNum(value: String): Self = StObject.set(x, "serialNum", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVoltageConfigured(value: Double): Self = StObject.set(x, "voltageConfigured", value.asInstanceOf[js.Any])
    
    inline def setVoltageConfiguredNull: Self = StObject.set(x, "voltageConfigured", null)
    
    inline def setVoltageMax(value: Double): Self = StObject.set(x, "voltageMax", value.asInstanceOf[js.Any])
    
    inline def setVoltageMaxNull: Self = StObject.set(x, "voltageMax", null)
    
    inline def setVoltageMin(value: Double): Self = StObject.set(x, "voltageMin", value.asInstanceOf[js.Any])
    
    inline def setVoltageMinNull: Self = StObject.set(x, "voltageMin", null)
  }
}
