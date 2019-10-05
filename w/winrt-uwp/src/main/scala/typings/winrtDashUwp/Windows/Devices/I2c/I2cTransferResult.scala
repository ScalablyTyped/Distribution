package typings.winrtDashUwp.Windows.Devices.I2c

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about whether the data transfers that the ReadPartial , WritePartial , or WriteReadPartial method performed succeeded, and the actual number of bytes the method transferred. */
trait I2cTransferResult extends js.Object {
  /** The actual number of bytes that the operation actually transferred. The following table describes what this value represents for each method. */
  var bytesTransferred: Double
  /** An enumeration value that indicates if the read or write operation transferred the full number of bytes that the method requested, or the reason that the full transfer did not succeed. For WriteReadPartial , the value indicates whether the data for both the write and the read operations was entirely transferred. */
  var status: I2cTransferStatus
}

object I2cTransferResult {
  @scala.inline
  def apply(bytesTransferred: Double, status: I2cTransferStatus): I2cTransferResult = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred, status = status)
  
    __obj.asInstanceOf[I2cTransferResult]
  }
}

