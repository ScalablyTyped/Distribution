package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemLayoutData extends js.Object {
  
  var bank: String = js.native
  
  var clockSpeed: Double = js.native
  
  var formFactor: String = js.native
  
  var partNum: String = js.native
  
  var serialNum: String = js.native
  
  var size: Double = js.native
  
  var `type`: String = js.native
  
  var voltageConfigured: Double = js.native
  
  var voltageMax: Double = js.native
  
  var voltageMin: Double = js.native
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
  implicit class MemLayoutDataOps[Self <: MemLayoutData] (val x: Self) extends AnyVal {
    
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
    def setBank(value: String): Self = this.set("bank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockSpeed(value: Double): Self = this.set("clockSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormFactor(value: String): Self = this.set("formFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartNum(value: String): Self = this.set("partNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNum(value: String): Self = this.set("serialNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoltageConfigured(value: Double): Self = this.set("voltageConfigured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoltageMax(value: Double): Self = this.set("voltageMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoltageMin(value: Double): Self = this.set("voltageMin", value.asInstanceOf[js.Any])
  }
}
