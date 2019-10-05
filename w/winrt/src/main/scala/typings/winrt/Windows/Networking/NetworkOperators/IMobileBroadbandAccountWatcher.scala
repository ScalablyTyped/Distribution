package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandAccountWatcher extends js.Object {
  var onaccountadded: js.Any
  var onaccountremoved: js.Any
  var onaccountupdated: js.Any
  var onenumerationcompleted: js.Any
  var onstopped: js.Any
  var status: MobileBroadbandAccountWatcherStatus
  def start(): Unit
  def stop(): Unit
}

object IMobileBroadbandAccountWatcher {
  @scala.inline
  def apply(
    onaccountadded: js.Any,
    onaccountremoved: js.Any,
    onaccountupdated: js.Any,
    onenumerationcompleted: js.Any,
    onstopped: js.Any,
    start: () => Unit,
    status: MobileBroadbandAccountWatcherStatus,
    stop: () => Unit
  ): IMobileBroadbandAccountWatcher = {
    val __obj = js.Dynamic.literal(onaccountadded = onaccountadded, onaccountremoved = onaccountremoved, onaccountupdated = onaccountupdated, onenumerationcompleted = onenumerationcompleted, onstopped = onstopped, start = js.Any.fromFunction0(start), status = status, stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[IMobileBroadbandAccountWatcher]
  }
}

