package typings
package unzipperLib.unzipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CentralDirectory extends js.Object {
  var commentLength: scala.Double
  var diskNumber: scala.Double
  var diskStart: scala.Double
  var files: js.Array[unzipperLib.Anon_Buffer]
  var numberOfRecords: scala.Double
  var numberOfRecordsOnDisk: scala.Double
  var offsetToStartOfCentralDirectory: scala.Double
  var signature: scala.Double
  var sizeOfCentralDirectory: scala.Double
}

object CentralDirectory {
  @scala.inline
  def apply(
    commentLength: scala.Double,
    diskNumber: scala.Double,
    diskStart: scala.Double,
    files: js.Array[unzipperLib.Anon_Buffer],
    numberOfRecords: scala.Double,
    numberOfRecordsOnDisk: scala.Double,
    offsetToStartOfCentralDirectory: scala.Double,
    signature: scala.Double,
    sizeOfCentralDirectory: scala.Double
  ): CentralDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commentLength")(commentLength)
    __obj.updateDynamic("diskNumber")(diskNumber)
    __obj.updateDynamic("diskStart")(diskStart)
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("numberOfRecords")(numberOfRecords)
    __obj.updateDynamic("numberOfRecordsOnDisk")(numberOfRecordsOnDisk)
    __obj.updateDynamic("offsetToStartOfCentralDirectory")(offsetToStartOfCentralDirectory)
    __obj.updateDynamic("signature")(signature)
    __obj.updateDynamic("sizeOfCentralDirectory")(sizeOfCentralDirectory)
    __obj.asInstanceOf[CentralDirectory]
  }
}

