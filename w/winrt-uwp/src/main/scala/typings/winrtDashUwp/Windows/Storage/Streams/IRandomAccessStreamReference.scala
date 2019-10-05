package typings.winrtDashUwp.Windows.Storage.Streams

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables a Windows Runtime component to provide access to an encapsulated stream. */
trait IRandomAccessStreamReference extends js.Object {
  /**
    * Opens a stream for random access.
    * @return The asynchronous operation.
    */
  def openReadAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
}

object IRandomAccessStreamReference {
  @scala.inline
  def apply(openReadAsync: () => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]): IRandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = js.Any.fromFunction0(openReadAsync))
  
    __obj.asInstanceOf[IRandomAccessStreamReference]
  }
}

