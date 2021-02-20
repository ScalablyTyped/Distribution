package typings.titanium.global.Titanium

import typings.titanium.MessageReply
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.WatchSessionActivationCompletedEvent
import typings.titanium.Titanium.WatchSessionDeactivateEvent
import typings.titanium.Titanium.WatchSessionFinishfiletransferEvent
import typings.titanium.Titanium.WatchSessionFinishuserinfotransferEvent
import typings.titanium.Titanium.WatchSessionInactiveEvent
import typings.titanium.Titanium.WatchSessionReachabilitychangedEvent
import typings.titanium.Titanium.WatchSessionReceiveapplicationcontextEvent
import typings.titanium.Titanium.WatchSessionReceivefileEvent
import typings.titanium.Titanium.WatchSessionReceivemessageEvent
import typings.titanium.Titanium.WatchSessionReceiveuserinfoEvent
import typings.titanium.Titanium.WatchSessionWatchstatechangedEvent
import typings.titanium.titaniumStrings.activationCompleted
import typings.titanium.titaniumStrings.deactivate
import typings.titanium.titaniumStrings.finishfiletransfer
import typings.titanium.titaniumStrings.finishuserinfotransfer
import typings.titanium.titaniumStrings.inactive
import typings.titanium.titaniumStrings.reachabilitychanged
import typings.titanium.titaniumStrings.receiveapplicationcontext
import typings.titanium.titaniumStrings.receivefile
import typings.titanium.titaniumStrings.receivemessage
import typings.titanium.titaniumStrings.receiveuserinfo
import typings.titanium.titaniumStrings.watchstatechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to enable data and file transfers between a watchOS and iOS application.
  */
@JSGlobal("Titanium.WatchSession")
@js.native
class WatchSession ()
  extends typings.titanium.Titanium.Proxy
object WatchSession {
  
  @JSGlobal("Titanium.WatchSession")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The watch is currently activated.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.ACTIVATION_STATE_ACTIVATED")
  @js.native
  val ACTIVATION_STATE_ACTIVATED: Double = js.native
  
  /**
    * The watch is currently inactive.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.ACTIVATION_STATE_INACTIVE")
  @js.native
  val ACTIVATION_STATE_INACTIVE: Double = js.native
  
  /**
    * The watch is currently not activated.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.ACTIVATION_STATE_NOT_ACTIVATED")
  @js.native
  val ACTIVATION_STATE_NOT_ACTIVATED: Double = js.native
  
  /**
    * Activates the watch session
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.activateSession")
  @js.native
  def activateSession(): Unit = js.native
  
  /**
    * Returns the current activation state of the watch.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.activationState")
  @js.native
  val activationState: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.addEventListener")
  @js.native
  def addEventListener_activationCompleted(
    name: activationCompleted,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionActivationCompletedEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.addEventListener")
  @js.native
  def addEventListener_deactivate(
    name: deactivate,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionDeactivateEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.addEventListener")
  @js.native
  def addEventListener_finishfiletransfer(
    name: finishfiletransfer,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionFinishfiletransferEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.addEventListener")
  @js.native
  def addEventListener_finishuserinfotransfer(
    name: finishuserinfotransfer,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionFinishuserinfotransferEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.addEventListener")
  @js.native
  def addEventListener_inactive(
    name: inactive,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionInactiveEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.addEventListener")
  @js.native
  def addEventListener_reachabilitychanged(
    name: reachabilitychanged,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionReachabilitychangedEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.addEventListener")
  @js.native
  def addEventListener_receiveapplicationcontext(
    name: receiveapplicationcontext,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionReceiveapplicationcontextEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.addEventListener")
  @js.native
  def addEventListener_receivefile(
    name: receivefile,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionReceivefileEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.addEventListener")
  @js.native
  def addEventListener_receivemessage(
    name: receivemessage,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionReceivemessageEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.addEventListener")
  @js.native
  def addEventListener_receiveuserinfo(
    name: receiveuserinfo,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionReceiveuserinfoEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.addEventListener")
  @js.native
  def addEventListener_watchstatechanged(
    name: watchstatechanged,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionWatchstatechangedEvent, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Cancels all incomplete file transfers to the apple watch.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.cancelAllFileTransfers")
  @js.native
  def cancelAllFileTransfers(): Unit = js.native
  
  /**
    * Cancels all incomplete transfers to the apple watch.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.cancelAllTransfers")
  @js.native
  def cancelAllTransfers(): Unit = js.native
  
  /**
    * Cancels all incomplete user info and complication transfers to the apple watch.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.cancelAllUserInfoTransfers")
  @js.native
  def cancelAllUserInfoTransfers(): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_activationCompleted(name: activationCompleted): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_activationCompleted(name: activationCompleted, event: WatchSessionActivationCompletedEvent): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_deactivate(name: deactivate): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_deactivate(name: deactivate, event: WatchSessionDeactivateEvent): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_finishfiletransfer(name: finishfiletransfer): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_finishfiletransfer(name: finishfiletransfer, event: WatchSessionFinishfiletransferEvent): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_finishuserinfotransfer(name: finishuserinfotransfer): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_finishuserinfotransfer(name: finishuserinfotransfer, event: WatchSessionFinishuserinfotransferEvent): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_inactive(name: inactive): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_inactive(name: inactive, event: WatchSessionInactiveEvent): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_reachabilitychanged(name: reachabilitychanged): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_reachabilitychanged(name: reachabilitychanged, event: WatchSessionReachabilitychangedEvent): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_receiveapplicationcontext(name: receiveapplicationcontext): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_receiveapplicationcontext(name: receiveapplicationcontext, event: WatchSessionReceiveapplicationcontextEvent): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_receivefile(name: receivefile): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_receivefile(name: receivefile, event: WatchSessionReceivefileEvent): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_receivemessage(name: receivemessage): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_receivemessage(name: receivemessage, event: WatchSessionReceivemessageEvent): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_receiveuserinfo(name: receiveuserinfo): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_receiveuserinfo(name: receiveuserinfo, event: WatchSessionReceiveuserinfoEvent): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_watchstatechanged(name: watchstatechanged): Unit = js.native
  @JSGlobal("Titanium.WatchSession.fireEvent")
  @js.native
  def fireEvent_watchstatechanged(name: watchstatechanged, event: WatchSessionWatchstatechangedEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.activationState> property.
    * @deprecated Access <Titanium.WatchSession.activationState> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.getActivationState")
  @js.native
  def getActivationState(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.apiName> property.
    * @deprecated Access <Titanium.WatchSession.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.bubbleParent> property.
    * @deprecated Access <Titanium.WatchSession.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.hasContentPending> property.
    * @deprecated Access <Titanium.WatchSession.hasContentPending> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.getHasContentPending")
  @js.native
  def getHasContentPending(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.isActivated> property.
    * @deprecated Access <Titanium.WatchSession.isActivated> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.getIsActivated")
  @js.native
  def getIsActivated(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.isComplicationEnabled> property.
    * @deprecated Access <Titanium.WatchSession.isComplicationEnabled> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.getIsComplicationEnabled")
  @js.native
  def getIsComplicationEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.isPaired> property.
    * @deprecated Access <Titanium.WatchSession.isPaired> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.getIsPaired")
  @js.native
  def getIsPaired(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.isReachable> property.
    * @deprecated Access <Titanium.WatchSession.isReachable> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.getIsReachable")
  @js.native
  def getIsReachable(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.isSupported> property.
    * @deprecated Access <Titanium.WatchSession.isSupported> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.getIsSupported")
  @js.native
  def getIsSupported(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.isWatchAppInstalled> property.
    * @deprecated Access <Titanium.WatchSession.isWatchAppInstalled> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.getIsWatchAppInstalled")
  @js.native
  def getIsWatchAppInstalled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.recentApplicationContext> property.
    * @deprecated Access <Titanium.WatchSession.recentApplicationContext> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.getRecentApplicationContext")
  @js.native
  def getRecentApplicationContext(): js.Any = js.native
  
  /**
    * Gets the value of the <Titanium.WatchSession.remainingComplicationUserInfoTransfers> property.
    * @deprecated Access <Titanium.WatchSession.remainingComplicationUserInfoTransfers> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.getRemainingComplicationUserInfoTransfers")
  @js.native
  def getRemainingComplicationUserInfoTransfers(): Double = js.native
  
  /**
    * Returns `true` if there is more content for the session to deliver.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.hasContentPending")
  @js.native
  val hasContentPending: Boolean = js.native
  
  /**
    * Returns `true` if the watch is currently activated.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.isActivated")
  @js.native
  val isActivated: Boolean = js.native
  
  /**
    * Returns `true` if complication is enabled on the installed watch app.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.isComplicationEnabled")
  @js.native
  val isComplicationEnabled: Boolean = js.native
  
  /**
    * Returns `true` if the device is paired with a watch.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.isPaired")
  @js.native
  val isPaired: Boolean = js.native
  
  /**
    * Returns `true` if the watch is currently reachable.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.isReachable")
  @js.native
  val isReachable: Boolean = js.native
  
  /**
    * Returns `true` if the device supports watch connectivity.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.isSupported")
  @js.native
  val isSupported: Boolean = js.native
  
  /**
    * Returns `true` if the accompanying watch app is installed.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.isWatchAppInstalled")
  @js.native
  val isWatchAppInstalled: Boolean = js.native
  
  /**
    * The most recent application context sent to the watch app.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.recentApplicationContext")
  @js.native
  val recentApplicationContext: js.Any = js.native
  
  /**
    * The number of calls remaining to `transferCurrentComplication` before the system starts
    * transferring the complicationUserInfo as regular userInfos.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.remainingComplicationUserInfoTransfers")
  @js.native
  val remainingComplicationUserInfoTransfers: Double = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.removeEventListener")
  @js.native
  def removeEventListener_activationCompleted(
    name: activationCompleted,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionActivationCompletedEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.removeEventListener")
  @js.native
  def removeEventListener_deactivate(
    name: deactivate,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionDeactivateEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.removeEventListener")
  @js.native
  def removeEventListener_finishfiletransfer(
    name: finishfiletransfer,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionFinishfiletransferEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.removeEventListener")
  @js.native
  def removeEventListener_finishuserinfotransfer(
    name: finishuserinfotransfer,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionFinishuserinfotransferEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.removeEventListener")
  @js.native
  def removeEventListener_inactive(
    name: inactive,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionInactiveEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.removeEventListener")
  @js.native
  def removeEventListener_reachabilitychanged(
    name: reachabilitychanged,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionReachabilitychangedEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.removeEventListener")
  @js.native
  def removeEventListener_receiveapplicationcontext(
    name: receiveapplicationcontext,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionReceiveapplicationcontextEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.removeEventListener")
  @js.native
  def removeEventListener_receivefile(
    name: receivefile,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionReceivefileEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.removeEventListener")
  @js.native
  def removeEventListener_receivemessage(
    name: receivemessage,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionReceivemessageEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.removeEventListener")
  @js.native
  def removeEventListener_receiveuserinfo(
    name: receiveuserinfo,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionReceiveuserinfoEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.WatchSession.removeEventListener")
  @js.native
  def removeEventListener_watchstatechanged(
    name: watchstatechanged,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.WatchSession, 
      /* event */ WatchSessionWatchstatechangedEvent, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Sends a message to the apple watch.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.sendMessage")
  @js.native
  def sendMessage(message: js.Any): Unit = js.native
  @JSGlobal("Titanium.WatchSession.sendMessage")
  @js.native
  def sendMessage(message: js.Any, reply: js.Function1[/* param0 */ MessageReply, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.WatchSession.bubbleParent> property.
    * @deprecated Set the value using <Titanium.WatchSession.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Transfers complication data to the watch application.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.transferCurrentComplication")
  @js.native
  def transferCurrentComplication(params: js.Any): Unit = js.native
  
  /**
    * Transfers a file to the apple watch.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.transferFile")
  @js.native
  def transferFile(params: js.Any): Unit = js.native
  
  /**
    * Transfers an user info to the apple watch.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.transferUserInfo")
  @js.native
  def transferUserInfo(params: js.Any): Unit = js.native
  
  /**
    * Sends an app context update to the apple watch.
    */
  /* static member */
  @JSGlobal("Titanium.WatchSession.updateApplicationContext")
  @js.native
  def updateApplicationContext(params: js.Any): Unit = js.native
}
