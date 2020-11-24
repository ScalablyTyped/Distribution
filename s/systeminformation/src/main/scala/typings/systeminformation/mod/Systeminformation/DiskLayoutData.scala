package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskLayoutData extends js.Object {
  
  var bytesPerSector: Double = js.native
  
  var device: String = js.native
  
  var firmwareRevision: String = js.native
  
  var interfaceType: String = js.native
  
  var name: String = js.native
  
  var sectorsPerTrack: Double = js.native
  
  var serialNum: String = js.native
  
  var size: Double = js.native
  
  var smartData: js.UndefOr[SmartData] = js.native
  
  var smartStatus: String = js.native
  
  var totalCylinders: Double = js.native
  
  var totalHeads: Double = js.native
  
  var totalSectors: Double = js.native
  
  var totalTracks: Double = js.native
  
  var tracksPerCylinder: Double = js.native
  
  var `type`: String = js.native
  
  var vendor: String = js.native
}
object DiskLayoutData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class DiskLayoutDataOps[Self <: DiskLayoutData] (val x: Self) extends AnyVal {
    
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
    def setBytesPerSector(value: Double): Self = this.set("bytesPerSector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirmwareRevision(value: String): Self = this.set("firmwareRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceType(value: String): Self = this.set("interfaceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectorsPerTrack(value: Double): Self = this.set("sectorsPerTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNum(value: String): Self = this.set("serialNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartStatus(value: String): Self = this.set("smartStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCylinders(value: Double): Self = this.set("totalCylinders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalHeads(value: Double): Self = this.set("totalHeads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSectors(value: Double): Self = this.set("totalSectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTracks(value: Double): Self = this.set("totalTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksPerCylinder(value: Double): Self = this.set("tracksPerCylinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartData(value: SmartData): Self = this.set("smartData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartData: Self = this.set("smartData", js.undefined)
  }
}
