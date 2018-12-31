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

