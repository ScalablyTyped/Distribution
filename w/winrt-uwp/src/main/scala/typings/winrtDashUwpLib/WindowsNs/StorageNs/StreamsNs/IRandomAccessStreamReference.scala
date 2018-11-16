package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables a Windows Runtime component to provide access to an encapsulated stream. */

trait IRandomAccessStreamReference extends js.Object {
  /**
                   * Opens a stream for random access.
                   * @return The asynchronous operation.
                   */
  def openReadAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
}

