package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRandomAccessStreamReference extends js.Object {
  def openReadAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IRandomAccessStreamWithContentType]
}

object IRandomAccessStreamReference {
  @scala.inline
  def apply(
    openReadAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IRandomAccessStreamWithContentType]
  ): IRandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = js.Any.fromFunction0(openReadAsync))
  
    __obj.asInstanceOf[IRandomAccessStreamReference]
  }
}

