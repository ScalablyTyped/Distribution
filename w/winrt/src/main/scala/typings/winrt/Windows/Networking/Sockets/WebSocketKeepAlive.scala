package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTask
import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTaskInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketKeepAlive
  extends StObject
     with IBackgroundTask
object WebSocketKeepAlive {
  
  @scala.inline
  def apply(run: IBackgroundTaskInstance => Unit): WebSocketKeepAlive = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[WebSocketKeepAlive]
  }
}
