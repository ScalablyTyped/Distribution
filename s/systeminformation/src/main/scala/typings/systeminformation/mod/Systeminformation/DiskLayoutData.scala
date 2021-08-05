package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskLayoutData extends StObject {
  
  var bytesPerSector: Double
  
  var device: String
  
  var firmwareRevision: String
  
  var interfaceType: String
  
  var name: String
  
  var sectorsPerTrack: Double
  
  var serialNum: String
  
  var size: Double
  
  var smartData: js.UndefOr[SmartData] = js.undefined
  
  var smartStatus: String
  
  var totalCylinders: Double
  
  var totalHeads: Double
  
  var totalSectors: Double
  
  var totalTracks: Double
  
  var tracksPerCylinder: Double
  
  var `type`: String
  
  var vendor: String
}
object DiskLayoutData {
  
  inline def apply(
    bytesPerSector: Double,
    device: String,
    firmwareRevision: String,
    interfaceType: String,
    name: String,
    sectorsPerTrack: Double,
    serialNum: String,
    size: Double,
    smartStatus: String,
    totalCylinders: Double,
    totalHeads: Double,
    totalSectors: Double,
    totalTracks: Double,
    tracksPerCylinder: Double,
    `type`: String,
    vendor: String
  ): DiskLayoutData = {
    val __obj = js.Dynamic.literal(bytesPerSector = bytesPerSector.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], firmwareRevision = firmwareRevision.asInstanceOf[js.Any], interfaceType = interfaceType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sectorsPerTrack = sectorsPerTrack.asInstanceOf[js.Any], serialNum = serialNum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], smartStatus = smartStatus.asInstanceOf[js.Any], totalCylinders = totalCylinders.asInstanceOf[js.Any], totalHeads = totalHeads.asInstanceOf[js.Any], totalSectors = totalSectors.asInstanceOf[js.Any], totalTracks = totalTracks.asInstanceOf[js.Any], tracksPerCylinder = tracksPerCylinder.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskLayoutData]
  }
  
  extension [Self <: DiskLayoutData](x: Self) {
    
    inline def setBytesPerSector(value: Double): Self = StObject.set(x, "bytesPerSector", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setFirmwareRevision(value: String): Self = StObject.set(x, "firmwareRevision", value.asInstanceOf[js.Any])
    
    inline def setInterfaceType(value: String): Self = StObject.set(x, "interfaceType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSectorsPerTrack(value: Double): Self = StObject.set(x, "sectorsPerTrack", value.asInstanceOf[js.Any])
    
    inline def setSerialNum(value: String): Self = StObject.set(x, "serialNum", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSmartData(value: SmartData): Self = StObject.set(x, "smartData", value.asInstanceOf[js.Any])
    
    inline def setSmartDataUndefined: Self = StObject.set(x, "smartData", js.undefined)
    
    inline def setSmartStatus(value: String): Self = StObject.set(x, "smartStatus", value.asInstanceOf[js.Any])
    
    inline def setTotalCylinders(value: Double): Self = StObject.set(x, "totalCylinders", value.asInstanceOf[js.Any])
    
    inline def setTotalHeads(value: Double): Self = StObject.set(x, "totalHeads", value.asInstanceOf[js.Any])
    
    inline def setTotalSectors(value: Double): Self = StObject.set(x, "totalSectors", value.asInstanceOf[js.Any])
    
    inline def setTotalTracks(value: Double): Self = StObject.set(x, "totalTracks", value.asInstanceOf[js.Any])
    
    inline def setTracksPerCylinder(value: Double): Self = StObject.set(x, "tracksPerCylinder", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
