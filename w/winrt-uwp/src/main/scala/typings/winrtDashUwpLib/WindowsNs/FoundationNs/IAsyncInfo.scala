package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports asynchronous actions and operations. IAsyncInfo is a base interface for IAsyncAction , IAsyncActionWithProgress<TProgress> , IAsyncOperation<TResult> and IAsyncOperationWithProgress<TResult,TProgress> , each of which support combinations of return type and progress for an asynchronous method. */
trait IAsyncInfo extends js.Object {
  /** Gets a string that describes an error condition of the asynchronous operation. */
  var errorCode: winrtDashUwpLib.WindowsNs.WinRTError
  /** Gets the handle of the asynchronous operation. */
  var id: scala.Double
  /** Gets a value that indicates the status of the asynchronous operation. */
  var status: AsyncStatus
  /** Cancels the asynchronous operation. */
  def cancel(): scala.Unit
  /** Closes the asynchronous operation. */
  def close(): scala.Unit
}

