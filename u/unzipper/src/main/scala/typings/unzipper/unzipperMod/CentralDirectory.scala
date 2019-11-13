package typings.unzipper.unzipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CentralDirectory extends js.Object {
  var commentLength: Double
  var diskNumber: Double
  var diskStart: Double
  var files: js.Array[File]
  var numberOfRecords: Double
  var numberOfRecordsOnDisk: Double
  var offsetToStartOfCentralDirectory: Double
  var signature: Double
  var sizeOfCentralDirectory: Double
  def extract(opts: ParseOptions): js.Promise[Unit]
}

object CentralDirectory {
  @scala.inline
  def apply(
    commentLength: Double,
    diskNumber: Double,
    diskStart: Double,
    extract: ParseOptions => js.Promise[Unit],
    files: js.Array[File],
    numberOfRecords: Double,
    numberOfRecordsOnDisk: Double,
    offsetToStartOfCentralDirectory: Double,
    signature: Double,
    sizeOfCentralDirectory: Double
  ): CentralDirectory = {
    val __obj = js.Dynamic.literal(commentLength = commentLength, diskNumber = diskNumber, diskStart = diskStart, extract = js.Any.fromFunction1(extract), files = files, numberOfRecords = numberOfRecords, numberOfRecordsOnDisk = numberOfRecordsOnDisk, offsetToStartOfCentralDirectory = offsetToStartOfCentralDirectory, signature = signature, sizeOfCentralDirectory = sizeOfCentralDirectory)
  
    __obj.asInstanceOf[CentralDirectory]
  }
}

