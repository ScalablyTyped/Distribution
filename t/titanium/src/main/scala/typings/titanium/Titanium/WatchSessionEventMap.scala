package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchSessionEventMap extends ProxyEventMap {
  var activationCompleted: WatchSessionActivationCompletedEvent
  var deactivate: WatchSessionDeactivateEvent
  var finishfiletransfer: WatchSessionFinishfiletransferEvent
  var finishuserinfotransfer: WatchSessionFinishuserinfotransferEvent
  var inactive: WatchSessionInactiveEvent
  var reachabilitychanged: WatchSessionReachabilitychangedEvent
  var receiveapplicationcontext: WatchSessionReceiveapplicationcontextEvent
  var receivefile: WatchSessionReceivefileEvent
  var receivemessage: WatchSessionReceivemessageEvent
  var receiveuserinfo: WatchSessionReceiveuserinfoEvent
  var watchstatechanged: WatchSessionWatchstatechangedEvent
}

object WatchSessionEventMap {
  @scala.inline
  def apply(
    activationCompleted: WatchSessionActivationCompletedEvent,
    deactivate: WatchSessionDeactivateEvent,
    finishfiletransfer: WatchSessionFinishfiletransferEvent,
    finishuserinfotransfer: WatchSessionFinishuserinfotransferEvent,
    inactive: WatchSessionInactiveEvent,
    reachabilitychanged: WatchSessionReachabilitychangedEvent,
    receiveapplicationcontext: WatchSessionReceiveapplicationcontextEvent,
    receivefile: WatchSessionReceivefileEvent,
    receivemessage: WatchSessionReceivemessageEvent,
    receiveuserinfo: WatchSessionReceiveuserinfoEvent,
    watchstatechanged: WatchSessionWatchstatechangedEvent
  ): WatchSessionEventMap = {
    val __obj = js.Dynamic.literal(activationCompleted = activationCompleted.asInstanceOf[js.Any], deactivate = deactivate.asInstanceOf[js.Any], finishfiletransfer = finishfiletransfer.asInstanceOf[js.Any], finishuserinfotransfer = finishuserinfotransfer.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], reachabilitychanged = reachabilitychanged.asInstanceOf[js.Any], receiveapplicationcontext = receiveapplicationcontext.asInstanceOf[js.Any], receivefile = receivefile.asInstanceOf[js.Any], receivemessage = receivemessage.asInstanceOf[js.Any], receiveuserinfo = receiveuserinfo.asInstanceOf[js.Any], watchstatechanged = watchstatechanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionEventMap]
  }
}

