package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a Windows Runtime output stream for an IStream base implementation. */
@JSGlobal("Windows.Storage.Streams.OutputStreamOverStream")
@js.native
abstract class OutputStreamOverStream () extends js.Object {
  /** Closes the current stream and releases system resources. */
  def close(): scala.Unit = js.native
  /**
                   * Flushes data asynchronously in a sequential stream.
                   * @return The stream flush operation.
                   */
  def flushAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Writes data asynchronously in a sequential stream.
                   * @param buffer The buffer into which the asynchronous writer operation writes.
                   * @return The byte writer operation.
                   */
  def writeAsync(buffer: IBuffer): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

