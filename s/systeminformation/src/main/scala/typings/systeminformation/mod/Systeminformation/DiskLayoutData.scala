package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskLayoutData extends js.Object {
  var bytesPerSector: Double
  var device: String
  var firmwareRevision: String
  var interfaceType: String
  var name: String
  var sectorsPerTrack: Double
  var serialNum: String
  var size: Double
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
}

