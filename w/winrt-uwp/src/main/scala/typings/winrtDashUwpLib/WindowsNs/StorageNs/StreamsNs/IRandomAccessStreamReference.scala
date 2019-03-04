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

object IRandomAccessStreamReference {
  @scala.inline
  def apply(
    openReadAsync: js.Function0[
      winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
    ]
  ): IRandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = openReadAsync)
  
    __obj.asInstanceOf[IRandomAccessStreamReference]
  }
}

