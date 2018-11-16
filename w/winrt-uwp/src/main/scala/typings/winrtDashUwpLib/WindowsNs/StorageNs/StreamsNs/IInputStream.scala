package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sequential stream of bytes to be read. */

trait IInputStream
  extends winrtDashUwpLib.WindowsNs.FoundationNs.IClosable {
  /**
                   * Reads data from the stream asynchronously.
                   * @param buffer A buffer that may be used to return the bytes that are read. The return value contains the buffer that holds the results.
                   * @param count The number of bytes to read that is less than or equal to the Capacity value.
                   * @param options Specifies the type of the asynchronous read operation.
                   * @return The asynchronous operation.
                   */
  def readAsync(buffer: IBuffer, count: scala.Double, options: InputStreamOptions): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[IBuffer, scala.Double]
}

