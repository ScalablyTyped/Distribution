package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsyncInfo extends js.Object {
  var errorCode: Double
  var id: Double
  var status: AsyncStatus
  def cancel(): Unit
  def close(): Unit
}

object IAsyncInfo {
  @scala.inline
  def apply(cancel: () => Unit, close: () => Unit, errorCode: Double, id: Double, status: AsyncStatus): IAsyncInfo = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAsyncInfo]
  }
}

