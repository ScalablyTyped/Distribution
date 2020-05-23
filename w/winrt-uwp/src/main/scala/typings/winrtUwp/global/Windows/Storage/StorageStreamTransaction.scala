package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a write transaction for a random-access stream. */
@JSGlobal("Windows.Storage.StorageStreamTransaction")
@js.native
abstract class StorageStreamTransaction ()
  extends typings.winrtUwp.Windows.Storage.StorageStreamTransaction {
  /** Gets the random-access stream used in the transaction. */
  /* CompleteClass */
  override var stream: IRandomAccessStream = js.native
  /** Releases system resources that are exposed by the stream, indicating that the data request is complete. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Save the stream to the underlying file.
    * @return No object or value is returned by this method.
    */
  /* CompleteClass */
  override def commitAsync(): IPromiseWithIAsyncAction = js.native
}

