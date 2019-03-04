package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskLayoutData extends js.Object {
  var bytesPerSector: scala.Double
  var firmwareRevision: java.lang.String
  var interfaceType: java.lang.String
  var name: java.lang.String
  var sectorsPerTrack: scala.Double
  var serialNum: java.lang.String
  var size: scala.Double
  var totalCylinders: scala.Double
  var totalHeads: scala.Double
  var totalSectors: scala.Double
  var totalTracks: scala.Double
  var tracksPerCylinder: scala.Double
  var `type`: java.lang.String
  var vendor: java.lang.String
}

object DiskLayoutData {
  @scala.inline
  def apply(
    bytesPerSector: scala.Double,
    firmwareRevision: java.lang.String,
    interfaceType: java.lang.String,
    name: java.lang.String,
    sectorsPerTrack: scala.Double,
    serialNum: java.lang.String,
    size: scala.Double,
    totalCylinders: scala.Double,
    totalHeads: scala.Double,
    totalSectors: scala.Double,
    totalTracks: scala.Double,
    tracksPerCylinder: scala.Double,
    `type`: java.lang.String,
    vendor: java.lang.String
  ): DiskLayoutData = {
    val __obj = js.Dynamic.literal(bytesPerSector = bytesPerSector, firmwareRevision = firmwareRevision, interfaceType = interfaceType, name = name, sectorsPerTrack = sectorsPerTrack, serialNum = serialNum, size = size, totalCylinders = totalCylinders, totalHeads = totalHeads, totalSectors = totalSectors, totalTracks = totalTracks, tracksPerCylinder = tracksPerCylinder, vendor = vendor)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DiskLayoutData]
  }
}

