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
    val __obj = js.Dynamic.literal(commentLength = commentLength, diskNumber = diskNumber, diskStart = diskStart, files = files, numberOfRecords = numberOfRecords, numberOfRecordsOnDisk = numberOfRecordsOnDisk, offsetToStartOfCentralDirectory = offsetToStartOfCentralDirectory, signature = signature, sizeOfCentralDirectory = sizeOfCentralDirectory)
  
    __obj.asInstanceOf[CentralDirectory]
  }
}

