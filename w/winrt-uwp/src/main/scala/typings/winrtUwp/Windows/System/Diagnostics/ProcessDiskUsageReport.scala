package typings.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the disk usage of the process. */
trait ProcessDiskUsageReport extends js.Object {
  /** Gets the number of bytes the process has read from disk. */
  var bytesReadCount: Double
  /** Gets the number of bytes the process has written to disk. */
  var bytesWrittenCount: Double
  /** Gets the number of bytes used by the process in disk operations that were not read or write operations. */
  var otherBytesCount: Double
  /** Gets the number of disk operations performed by the process that were not read or write operations. */
  var otherOperationCount: Double
  /** Gets the number of disk read operations performed by the process. */
  var readOperationCount: Double
  /** Gets the number of disk write operations performed by the process. */
  var writeOperationCount: Double
}

object ProcessDiskUsageReport {
  @scala.inline
  def apply(
    bytesReadCount: Double,
    bytesWrittenCount: Double,
    otherBytesCount: Double,
    otherOperationCount: Double,
    readOperationCount: Double,
    writeOperationCount: Double
  ): ProcessDiskUsageReport = {
    val __obj = js.Dynamic.literal(bytesReadCount = bytesReadCount.asInstanceOf[js.Any], bytesWrittenCount = bytesWrittenCount.asInstanceOf[js.Any], otherBytesCount = otherBytesCount.asInstanceOf[js.Any], otherOperationCount = otherOperationCount.asInstanceOf[js.Any], readOperationCount = readOperationCount.asInstanceOf[js.Any], writeOperationCount = writeOperationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessDiskUsageReport]
  }
}

