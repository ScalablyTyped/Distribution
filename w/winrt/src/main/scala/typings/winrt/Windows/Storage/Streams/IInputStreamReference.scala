package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputStreamReference extends js.Object {
  def openSequentialReadAsync(): IAsyncOperation[IInputStream]
}

object IInputStreamReference {
  @scala.inline
  def apply(openSequentialReadAsync: () => IAsyncOperation[IInputStream]): IInputStreamReference = {
    val __obj = js.Dynamic.literal(openSequentialReadAsync = js.Any.fromFunction0(openSequentialReadAsync))
  
    __obj.asInstanceOf[IInputStreamReference]
  }
}

