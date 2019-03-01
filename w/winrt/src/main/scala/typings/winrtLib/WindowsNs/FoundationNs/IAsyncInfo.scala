package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsyncInfo extends js.Object {
  var errorCode: scala.Double
  var id: scala.Double
  var status: AsyncStatus
  def cancel(): scala.Unit
  def close(): scala.Unit
}

object IAsyncInfo {
  @scala.inline
  def apply(
    cancel: js.Function0[scala.Unit],
    close: js.Function0[scala.Unit],
    errorCode: scala.Double,
    id: scala.Double,
    status: AsyncStatus
  ): IAsyncInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[IAsyncInfo]
  }
}

