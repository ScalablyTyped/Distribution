package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a write transaction for a random-access stream. */
@JSGlobal("Windows.Storage.StorageStreamTransaction")
@js.native
abstract class StorageStreamTransaction () extends js.Object {
  /** Gets the random-access stream used in the transaction. */
  var stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /** Releases system resources that are exposed by the stream, indicating that the data request is complete. */
  def close(): scala.Unit = js.native
  /**
               * Save the stream to the underlying file.
               * @return No object or value is returned by this method.
               */
  def commitAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

