package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned when a WiFiDirectServiceAdvertiser.AutoAcceptSessionConnected event is raised. */
trait WiFiDirectServiceAutoAcceptSessionConnectedEventArgs extends js.Object {
  /** Gets the WiFiDirectServiceSession that was created when the connection was automatically accepted. */
  var session: WiFiDirectServiceSession
  /** Gets the session information buffer that corresponds to this automatically accepted connection. */
  var sessionInfo: IBuffer
}

object WiFiDirectServiceAutoAcceptSessionConnectedEventArgs {
  @scala.inline
  def apply(session: WiFiDirectServiceSession, sessionInfo: IBuffer): WiFiDirectServiceAutoAcceptSessionConnectedEventArgs = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionInfo = sessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceAutoAcceptSessionConnectedEventArgs]
  }
}

