package typings.winrtDashUwp.Windows.Storage.Streams

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables a Windows Runtime component to provide sequential read access to an encapsulated stream. */
trait IInputStreamReference extends js.Object {
  /**
    * Opens a stream for sequential read access.
    * @return The asynchronous operation.
    */
  def openSequentialReadAsync(): IPromiseWithIAsyncOperation[IInputStream]
}

object IInputStreamReference {
  @scala.inline
  def apply(openSequentialReadAsync: () => IPromiseWithIAsyncOperation[IInputStream]): IInputStreamReference = {
    val __obj = js.Dynamic.literal(openSequentialReadAsync = js.Any.fromFunction0(openSequentialReadAsync))
  
    __obj.asInstanceOf[IInputStreamReference]
  }
}

