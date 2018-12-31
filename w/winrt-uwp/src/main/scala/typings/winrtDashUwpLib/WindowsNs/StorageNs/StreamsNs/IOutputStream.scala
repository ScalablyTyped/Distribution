package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sequential stream of bytes to be written. */
trait IOutputStream
  extends winrtDashUwpLib.WindowsNs.FoundationNs.IClosable {
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  def flushAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean]
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer A buffer that contains the data to be written.
    * @return The byte writer operation.
    */
  def writeAsync(buffer: IBuffer): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double]
}

