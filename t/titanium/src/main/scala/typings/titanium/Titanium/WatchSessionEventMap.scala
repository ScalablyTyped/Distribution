package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchSessionEventMap extends ProxyEventMap {
  var activationCompleted: WatchSessionActivationCompletedEvent = js.native
  var deactivate: WatchSessionDeactivateEvent = js.native
  var finishfiletransfer: WatchSessionFinishfiletransferEvent = js.native
  var finishuserinfotransfer: WatchSessionFinishuserinfotransferEvent = js.native
  var inactive: WatchSessionInactiveEvent = js.native
  var reachabilitychanged: WatchSessionReachabilitychangedEvent = js.native
  var receiveapplicationcontext: WatchSessionReceiveapplicationcontextEvent = js.native
  var receivefile: WatchSessionReceivefileEvent = js.native
  var receivemessage: WatchSessionReceivemessageEvent = js.native
  var receiveuserinfo: WatchSessionReceiveuserinfoEvent = js.native
  var watchstatechanged: WatchSessionWatchstatechangedEvent = js.native
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
  @scala.inline
  implicit class WatchSessionEventMapOps[Self <: WatchSessionEventMap] (val x: Self) extends AnyVal {
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
    def setActivationCompleted(value: WatchSessionActivationCompletedEvent): Self = this.set("activationCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeactivate(value: WatchSessionDeactivateEvent): Self = this.set("deactivate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinishfiletransfer(value: WatchSessionFinishfiletransferEvent): Self = this.set("finishfiletransfer", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinishuserinfotransfer(value: WatchSessionFinishuserinfotransferEvent): Self = this.set("finishuserinfotransfer", value.asInstanceOf[js.Any])
    @scala.inline
    def setInactive(value: WatchSessionInactiveEvent): Self = this.set("inactive", value.asInstanceOf[js.Any])
    @scala.inline
    def setReachabilitychanged(value: WatchSessionReachabilitychangedEvent): Self = this.set("reachabilitychanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceiveapplicationcontext(value: WatchSessionReceiveapplicationcontextEvent): Self = this.set("receiveapplicationcontext", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceivefile(value: WatchSessionReceivefileEvent): Self = this.set("receivefile", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceivemessage(value: WatchSessionReceivemessageEvent): Self = this.set("receivemessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceiveuserinfo(value: WatchSessionReceiveuserinfoEvent): Self = this.set("receiveuserinfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatchstatechanged(value: WatchSessionWatchstatechangedEvent): Self = this.set("watchstatechanged", value.asInstanceOf[js.Any])
  }
  
}

