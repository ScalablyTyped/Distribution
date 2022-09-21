package typings.systeminformation.mod.Systeminformation

import typings.systeminformation.anon.Argv
import typings.systeminformation.anon.Availablespare
import typings.systeminformation.anon.Blocks
import typings.systeminformation.anon.Current
import typings.systeminformation.anon.Hours
import typings.systeminformation.anon.Id
import typings.systeminformation.anon.Infoname
import typings.systeminformation.anon.Passed
import typings.systeminformation.anon.Revision
import typings.systeminformation.anon.Standard
import typings.systeminformation.anon.Summary
import typings.systeminformation.anon.Supported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartData extends StObject {
  
  var ata_smart_attributes: js.UndefOr[Revision] = js.undefined
  
  var ata_smart_error_log: js.UndefOr[Summary] = js.undefined
  
  var ata_smart_self_test_log: js.UndefOr[Standard] = js.undefined
  
  var device: Infoname
  
  var firmware_version: js.UndefOr[String] = js.undefined
  
  var json_format_version: js.Array[Double]
  
  var logical_block_size: js.UndefOr[Double] = js.undefined
  
  var model_family: js.UndefOr[String] = js.undefined
  
  var model_name: js.UndefOr[String] = js.undefined
  
  var nvme_pci_vendor: js.UndefOr[Id] = js.undefined
  
  var nvme_smart_health_information_log: js.UndefOr[Availablespare] = js.undefined
  
  var power_cycle_count: Double
  
  var power_on_time: Hours
  
  var serial_number: js.UndefOr[String] = js.undefined
  
  var smart_status: Passed
  
  var smartctl: Argv
  
  var temperature: Current
  
  var trim: js.UndefOr[Supported] = js.undefined
  
  var user_capacity: js.UndefOr[Blocks] = js.undefined
}
object SmartData {
  
  inline def apply(
    device: Infoname,
    json_format_version: js.Array[Double],
    power_cycle_count: Double,
    power_on_time: Hours,
    smart_status: Passed,
    smartctl: Argv,
    temperature: Current
  ): SmartData = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], json_format_version = json_format_version.asInstanceOf[js.Any], power_cycle_count = power_cycle_count.asInstanceOf[js.Any], power_on_time = power_on_time.asInstanceOf[js.Any], smart_status = smart_status.asInstanceOf[js.Any], smartctl = smartctl.asInstanceOf[js.Any], temperature = temperature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartData]
  }
  
  extension [Self <: SmartData](x: Self) {
    
    inline def setAta_smart_attributes(value: Revision): Self = StObject.set(x, "ata_smart_attributes", value.asInstanceOf[js.Any])
    
    inline def setAta_smart_attributesUndefined: Self = StObject.set(x, "ata_smart_attributes", js.undefined)
    
    inline def setAta_smart_error_log(value: Summary): Self = StObject.set(x, "ata_smart_error_log", value.asInstanceOf[js.Any])
    
    inline def setAta_smart_error_logUndefined: Self = StObject.set(x, "ata_smart_error_log", js.undefined)
    
    inline def setAta_smart_self_test_log(value: Standard): Self = StObject.set(x, "ata_smart_self_test_log", value.asInstanceOf[js.Any])
    
    inline def setAta_smart_self_test_logUndefined: Self = StObject.set(x, "ata_smart_self_test_log", js.undefined)
    
    inline def setDevice(value: Infoname): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setFirmware_version(value: String): Self = StObject.set(x, "firmware_version", value.asInstanceOf[js.Any])
    
    inline def setFirmware_versionUndefined: Self = StObject.set(x, "firmware_version", js.undefined)
    
    inline def setJson_format_version(value: js.Array[Double]): Self = StObject.set(x, "json_format_version", value.asInstanceOf[js.Any])
    
    inline def setJson_format_versionVarargs(value: Double*): Self = StObject.set(x, "json_format_version", js.Array(value*))
    
    inline def setLogical_block_size(value: Double): Self = StObject.set(x, "logical_block_size", value.asInstanceOf[js.Any])
    
    inline def setLogical_block_sizeUndefined: Self = StObject.set(x, "logical_block_size", js.undefined)
    
    inline def setModel_family(value: String): Self = StObject.set(x, "model_family", value.asInstanceOf[js.Any])
    
    inline def setModel_familyUndefined: Self = StObject.set(x, "model_family", js.undefined)
    
    inline def setModel_name(value: String): Self = StObject.set(x, "model_name", value.asInstanceOf[js.Any])
    
    inline def setModel_nameUndefined: Self = StObject.set(x, "model_name", js.undefined)
    
    inline def setNvme_pci_vendor(value: Id): Self = StObject.set(x, "nvme_pci_vendor", value.asInstanceOf[js.Any])
    
    inline def setNvme_pci_vendorUndefined: Self = StObject.set(x, "nvme_pci_vendor", js.undefined)
    
    inline def setNvme_smart_health_information_log(value: Availablespare): Self = StObject.set(x, "nvme_smart_health_information_log", value.asInstanceOf[js.Any])
    
    inline def setNvme_smart_health_information_logUndefined: Self = StObject.set(x, "nvme_smart_health_information_log", js.undefined)
    
    inline def setPower_cycle_count(value: Double): Self = StObject.set(x, "power_cycle_count", value.asInstanceOf[js.Any])
    
    inline def setPower_on_time(value: Hours): Self = StObject.set(x, "power_on_time", value.asInstanceOf[js.Any])
    
    inline def setSerial_number(value: String): Self = StObject.set(x, "serial_number", value.asInstanceOf[js.Any])
    
    inline def setSerial_numberUndefined: Self = StObject.set(x, "serial_number", js.undefined)
    
    inline def setSmart_status(value: Passed): Self = StObject.set(x, "smart_status", value.asInstanceOf[js.Any])
    
    inline def setSmartctl(value: Argv): Self = StObject.set(x, "smartctl", value.asInstanceOf[js.Any])
    
    inline def setTemperature(value: Current): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
    
    inline def setTrim(value: Supported): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    inline def setUser_capacity(value: Blocks): Self = StObject.set(x, "user_capacity", value.asInstanceOf[js.Any])
    
    inline def setUser_capacityUndefined: Self = StObject.set(x, "user_capacity", js.undefined)
  }
}
