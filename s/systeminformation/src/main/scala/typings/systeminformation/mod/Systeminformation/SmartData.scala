package typings.systeminformation.mod.Systeminformation

import typings.systeminformation.anon.Argv
import typings.systeminformation.anon.Current
import typings.systeminformation.anon.Hours
import typings.systeminformation.anon.Infoname
import typings.systeminformation.anon.Passed
import typings.systeminformation.anon.Revision
import typings.systeminformation.anon.Standard
import typings.systeminformation.anon.Summary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartData extends StObject {
  
  var ata_smart_attributes: Revision
  
  var ata_smart_error_log: Summary
  
  var ata_smart_self_test_log: Standard
  
  var device: Infoname
  
  var json_format_version: js.Array[Double]
  
  var power_cycle_count: Double
  
  var power_on_time: Hours
  
  var smart_status: Passed
  
  var smartctl: Argv
  
  var temperature: Current
}
object SmartData {
  
  @scala.inline
  def apply(
    ata_smart_attributes: Revision,
    ata_smart_error_log: Summary,
    ata_smart_self_test_log: Standard,
    device: Infoname,
    json_format_version: js.Array[Double],
    power_cycle_count: Double,
    power_on_time: Hours,
    smart_status: Passed,
    smartctl: Argv,
    temperature: Current
  ): SmartData = {
    val __obj = js.Dynamic.literal(ata_smart_attributes = ata_smart_attributes.asInstanceOf[js.Any], ata_smart_error_log = ata_smart_error_log.asInstanceOf[js.Any], ata_smart_self_test_log = ata_smart_self_test_log.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], json_format_version = json_format_version.asInstanceOf[js.Any], power_cycle_count = power_cycle_count.asInstanceOf[js.Any], power_on_time = power_on_time.asInstanceOf[js.Any], smart_status = smart_status.asInstanceOf[js.Any], smartctl = smartctl.asInstanceOf[js.Any], temperature = temperature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartData]
  }
  
  @scala.inline
  implicit class SmartDataMutableBuilder[Self <: SmartData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAta_smart_attributes(value: Revision): Self = StObject.set(x, "ata_smart_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAta_smart_error_log(value: Summary): Self = StObject.set(x, "ata_smart_error_log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAta_smart_self_test_log(value: Standard): Self = StObject.set(x, "ata_smart_self_test_log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: Infoname): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson_format_version(value: js.Array[Double]): Self = StObject.set(x, "json_format_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson_format_versionVarargs(value: Double*): Self = StObject.set(x, "json_format_version", js.Array(value :_*))
    
    @scala.inline
    def setPower_cycle_count(value: Double): Self = StObject.set(x, "power_cycle_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPower_on_time(value: Hours): Self = StObject.set(x, "power_on_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmart_status(value: Passed): Self = StObject.set(x, "smart_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartctl(value: Argv): Self = StObject.set(x, "smartctl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemperature(value: Current): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
  }
}
