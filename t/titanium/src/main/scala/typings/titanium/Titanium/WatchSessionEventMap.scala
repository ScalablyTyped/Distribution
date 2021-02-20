package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class WatchSessionEventMapMutableBuilder[Self <: WatchSessionEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationCompleted(value: WatchSessionActivationCompletedEvent): Self = StObject.set(x, "activationCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeactivate(value: WatchSessionDeactivateEvent): Self = StObject.set(x, "deactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishfiletransfer(value: WatchSessionFinishfiletransferEvent): Self = StObject.set(x, "finishfiletransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishuserinfotransfer(value: WatchSessionFinishuserinfotransferEvent): Self = StObject.set(x, "finishuserinfotransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactive(value: WatchSessionInactiveEvent): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachabilitychanged(value: WatchSessionReachabilitychangedEvent): Self = StObject.set(x, "reachabilitychanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveapplicationcontext(value: WatchSessionReceiveapplicationcontextEvent): Self = StObject.set(x, "receiveapplicationcontext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivefile(value: WatchSessionReceivefileEvent): Self = StObject.set(x, "receivefile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivemessage(value: WatchSessionReceivemessageEvent): Self = StObject.set(x, "receivemessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveuserinfo(value: WatchSessionReceiveuserinfoEvent): Self = StObject.set(x, "receiveuserinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchstatechanged(value: WatchSessionWatchstatechangedEvent): Self = StObject.set(x, "watchstatechanged", value.asInstanceOf[js.Any])
  }
}
