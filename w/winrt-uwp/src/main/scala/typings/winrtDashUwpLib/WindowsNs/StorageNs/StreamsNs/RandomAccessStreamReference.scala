package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides random access of data in input and output streams for a file. */
@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
abstract class RandomAccessStreamReference () extends js.Object {
  /**
    * Opens a stream for random access.
    * @return The asynchronous operation.
    */
  def openReadAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
}

/* static members */
@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
object RandomAccessStreamReference extends js.Object {
  /**
    * Creates a random access stream around a file.
    * @param file The file to create a stream around.
    * @return The stream that encapsulates file.
    */
  def createFromFile(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference = js.native
  /**
    * Creates a random access stream around the specified stream.
    * @param stream The source stream.
    * @return The random access stream that encapsulates stream.
    */
  def createFromStream(stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference = js.native
  /**
    * Creates a random access stream around the specified URI.
    * @param uri The URI to create the stream around. The valid URI schemes are http, https, ms-appx, and ms-appdata.
    * @return The random access stream that encapsulates uri.
    */
  def createFromUri(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference = js.native
}

