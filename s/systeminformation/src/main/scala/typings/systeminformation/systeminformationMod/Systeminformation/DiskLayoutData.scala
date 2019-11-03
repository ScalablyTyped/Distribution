package typings.systeminformation.systeminformationMod.Systeminformation

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
    val __obj = js.Dynamic.literal(bytesPerSector = bytesPerSector, device = device, firmwareRevision = firmwareRevision, interfaceType = interfaceType, name = name, sectorsPerTrack = sectorsPerTrack, serialNum = serialNum, size = size, smartStatus = smartStatus, totalCylinders = totalCylinders, totalHeads = totalHeads, totalSectors = totalSectors, totalTracks = totalTracks, tracksPerCylinder = tracksPerCylinder, vendor = vendor)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DiskLayoutData]
  }
}

