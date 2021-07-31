package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemLayoutData extends StObject {
  
  var bank: String
  
  var clockSpeed: Double
  
  var formFactor: String
  
  var partNum: String
  
  var serialNum: String
  
  var size: Double
  
  var `type`: String
  
  var voltageConfigured: Double
  
  var voltageMax: Double
  
  var voltageMin: Double
}
object MemLayoutData {
  
  @scala.inline
  def apply(
    bank: String,
    clockSpeed: Double,
    formFactor: String,
    partNum: String,
    serialNum: String,
    size: Double,
    `type`: String,
    voltageConfigured: Double,
    voltageMax: Double,
    voltageMin: Double
  ): MemLayoutData = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any], clockSpeed = clockSpeed.asInstanceOf[js.Any], formFactor = formFactor.asInstanceOf[js.Any], partNum = partNum.asInstanceOf[js.Any], serialNum = serialNum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], voltageConfigured = voltageConfigured.asInstanceOf[js.Any], voltageMax = voltageMax.asInstanceOf[js.Any], voltageMin = voltageMin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemLayoutData]
  }
  
  @scala.inline
  implicit class MemLayoutDataMutableBuilder[Self <: MemLayoutData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBank(value: String): Self = StObject.set(x, "bank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockSpeed(value: Double): Self = StObject.set(x, "clockSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartNum(value: String): Self = StObject.set(x, "partNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNum(value: String): Self = StObject.set(x, "serialNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoltageConfigured(value: Double): Self = StObject.set(x, "voltageConfigured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoltageMax(value: Double): Self = StObject.set(x, "voltageMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoltageMin(value: Double): Self = StObject.set(x, "voltageMin", value.asInstanceOf[js.Any])
  }
}
