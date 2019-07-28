package typings.winrtDashUwp.WindowsNs.SystemNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the disk usage of the process. */
@JSGlobal("Windows.System.Diagnostics.ProcessDiskUsageReport")
@js.native
abstract class ProcessDiskUsageReport () extends js.Object {
  /** Gets the number of bytes the process has read from disk. */
  var bytesReadCount: Double = js.native
  /** Gets the number of bytes the process has written to disk. */
  var bytesWrittenCount: Double = js.native
  /** Gets the number of bytes used by the process in disk operations that were not read or write operations. */
  var otherBytesCount: Double = js.native
  /** Gets the number of disk operations performed by the process that were not read or write operations. */
  var otherOperationCount: Double = js.native
  /** Gets the number of disk read operations performed by the process. */
  var readOperationCount: Double = js.native
  /** Gets the number of disk write operations performed by the process. */
  var writeOperationCount: Double = js.native
}

