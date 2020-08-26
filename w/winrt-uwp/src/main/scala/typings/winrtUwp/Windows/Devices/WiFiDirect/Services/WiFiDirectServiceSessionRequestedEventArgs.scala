package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned when a WiFiDirectServiceAdvertiser.SessionRequested event is raised. */
@js.native
trait WiFiDirectServiceSessionRequestedEventArgs extends js.Object {
  /**
    * Gets information about the session request that raised a WiFiDirectServiceAdvertiser.SessionRequested event.
    * @return Information about a new session request.
    */
  def getSessionRequest(): WiFiDirectServiceSessionRequest = js.native
}

object WiFiDirectServiceSessionRequestedEventArgs {
  @scala.inline
  def apply(getSessionRequest: () => WiFiDirectServiceSessionRequest): WiFiDirectServiceSessionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(getSessionRequest = js.Any.fromFunction0(getSessionRequest))
    __obj.asInstanceOf[WiFiDirectServiceSessionRequestedEventArgs]
  }
  @scala.inline
  implicit class WiFiDirectServiceSessionRequestedEventArgsOps[Self <: WiFiDirectServiceSessionRequestedEventArgs] (val x: Self) extends AnyVal {
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
    def setGetSessionRequest(value: () => WiFiDirectServiceSessionRequest): Self = this.set("getSessionRequest", js.Any.fromFunction0(value))
  }
  
}

