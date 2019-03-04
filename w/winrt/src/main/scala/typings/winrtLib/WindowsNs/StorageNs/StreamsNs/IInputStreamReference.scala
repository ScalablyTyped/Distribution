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
  def apply(
    openSequentialReadAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IInputStream]]
  ): IInputStreamReference = {
    val __obj = js.Dynamic.literal(openSequentialReadAsync = openSequentialReadAsync)
  
    __obj.asInstanceOf[IInputStreamReference]
  }
}

