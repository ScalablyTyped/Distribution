package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides random access of data in input and output streams. */
@JSGlobal("Windows.Storage.Streams.RandomAccessStream")
@js.native
abstract class RandomAccessStream () extends js.Object

/** Provides random access of data in input and output streams. */
@JSGlobal("Windows.Storage.Streams.RandomAccessStream")
@js.native
object RandomAccessStream extends js.Object {
  /**
    * Copies a source stream to a destination stream and waits for the copy operation to complete.
    * @param source The stream to copy data from.
    * @param destination The stream to copy data to.
    * @return The asynchronous operation.
    */
  def copyAndCloseAsync(
    source: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    destination: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  /**
    * Copies a source stream to a destination stream.
    * @param source The stream to copy data from.
    * @param destination The stream to copy data to.
    * @return The asynchronous operation.
    */
  def copyAsync(
    source: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    destination: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  /**
    * Copies the specified number of bytes from a source stream to a destination stream.
    * @param source The stream to copy data from.
    * @param destination The stream to copy data to.
    * @param bytesToCopy The number of bytes to copy.
    * @return The asynchronous operation.
    */
  def copyAsync(
    source: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    destination: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream,
    bytesToCopy: scala.Double
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

