package typings.winrtUwp.Windows.Networking.Connectivity

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the start time and duration for an established or prior connection. */
@js.native
trait ConnectivityInterval extends js.Object {
  /** Indicates the duration of connectivity. */
  var connectionDuration: Double = js.native
  /** Indicates when the connection was initially established. */
  var startTime: Date = js.native
}

object ConnectivityInterval {
  @scala.inline
  def apply(connectionDuration: Double, startTime: Date): ConnectivityInterval = {
    val __obj = js.Dynamic.literal(connectionDuration = connectionDuration.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectivityInterval]
  }
  @scala.inline
  implicit class ConnectivityIntervalOps[Self <: ConnectivityInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectionDuration(value: Double): Self = this.set("connectionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
  
}

