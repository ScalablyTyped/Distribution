package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables a Windows Runtime component to provide sequential read access to an encapsulated stream. */
trait IInputStreamReference extends js.Object {
  /**
    * Opens a stream for sequential read access.
    * @return The asynchronous operation.
    */
  def openSequentialReadAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[IInputStream]
}

object IInputStreamReference {
  @scala.inline
  def apply(
    openSequentialReadAsync: js.Function0[winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[IInputStream]]
  ): IInputStreamReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openSequentialReadAsync")(openSequentialReadAsync)
    __obj.asInstanceOf[IInputStreamReference]
  }
}

