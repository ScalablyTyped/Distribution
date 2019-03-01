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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bytesPerSector")(bytesPerSector)
    __obj.updateDynamic("firmwareRevision")(firmwareRevision)
    __obj.updateDynamic("interfaceType")(interfaceType)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("sectorsPerTrack")(sectorsPerTrack)
    __obj.updateDynamic("serialNum")(serialNum)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("totalCylinders")(totalCylinders)
    __obj.updateDynamic("totalHeads")(totalHeads)
    __obj.updateDynamic("totalSectors")(totalSectors)
    __obj.updateDynamic("totalTracks")(totalTracks)
    __obj.updateDynamic("tracksPerCylinder")(tracksPerCylinder)
    __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[DiskLayoutData]
  }
}

