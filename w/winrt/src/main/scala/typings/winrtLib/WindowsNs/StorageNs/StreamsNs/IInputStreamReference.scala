package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputStreamReference extends js.Object {
  def openSequentialReadAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IInputStream]
}

object IInputStreamReference {
  @scala.inline
  def apply(openSequentialReadAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IInputStream]): IInputStreamReference = {
    val __obj = js.Dynamic.literal(openSequentialReadAsync = js.Any.fromFunction0(openSequentialReadAsync))
  
    __obj.asInstanceOf[IInputStreamReference]
  }
}

