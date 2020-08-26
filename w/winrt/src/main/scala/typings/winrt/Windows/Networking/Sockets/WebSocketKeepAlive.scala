package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTask
import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTaskInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocketKeepAlive extends IBackgroundTask

object WebSocketKeepAlive {
  @scala.inline
  def apply(run: IBackgroundTaskInstance => Unit): WebSocketKeepAlive = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[WebSocketKeepAlive]
  }
}

