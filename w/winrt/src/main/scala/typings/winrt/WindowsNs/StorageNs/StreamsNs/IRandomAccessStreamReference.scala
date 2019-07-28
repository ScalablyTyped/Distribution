package typings.winrt.WindowsNs.StorageNs.StreamsNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRandomAccessStreamReference extends js.Object {
  def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType]
}

object IRandomAccessStreamReference {
  @scala.inline
  def apply(openReadAsync: () => IAsyncOperation[IRandomAccessStreamWithContentType]): IRandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = js.Any.fromFunction0(openReadAsync))
  
    __obj.asInstanceOf[IRandomAccessStreamReference]
  }
}

