package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The watch state has changed.
  */
@js.native
trait WatchSessionWatchstatechangedEvent extends WatchSessionBaseEvent {
  
  /**
    * Returns the current activation state of the watch.  Only available on iOS 9.3
    * and later. See <Titanium.WatchSession.activationState> for more infos.
    */
  var activationState: Double = js.native
  
  /**
    * If the apple watch is currently activated. Only available on iOS 9.3
    * and later. See <Titanium.WatchSession.isActivated> for more infos.
    */
  var isActivated: Boolean = js.native
  
  /**
    * If the complication is enabled in the apple watch.
    */
  var isComplicationEnabled: Boolean = js.native
  
  /**
    * If the device is paired with the apple watch.
    */
  var isPaired: Boolean = js.native
  
  /**
    * If apple watch is currently reachable.
    */
  var isReachable: Boolean = js.native
  
  /**
    * If the watch app is installed in the apple watch.
    */
  var isWatchAppInstalled: Boolean = js.native
}
object WatchSessionWatchstatechangedEvent {
  
  @scala.inline
  def apply(
    activationState: Double,
    isActivated: Boolean,
    isComplicationEnabled: Boolean,
    isPaired: Boolean,
    isReachable: Boolean,
    isWatchAppInstalled: Boolean,
    source: WatchSession
  ): WatchSessionWatchstatechangedEvent = {
    val __obj = js.Dynamic.literal(activationState = activationState.asInstanceOf[js.Any], isActivated = isActivated.asInstanceOf[js.Any], isComplicationEnabled = isComplicationEnabled.asInstanceOf[js.Any], isPaired = isPaired.asInstanceOf[js.Any], isReachable = isReachable.asInstanceOf[js.Any], isWatchAppInstalled = isWatchAppInstalled.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionWatchstatechangedEvent]
  }
  
  @scala.inline
  implicit class WatchSessionWatchstatechangedEventMutableBuilder[Self <: WatchSessionWatchstatechangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationState(value: Double): Self = StObject.set(x, "activationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActivated(value: Boolean): Self = StObject.set(x, "isActivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComplicationEnabled(value: Boolean): Self = StObject.set(x, "isComplicationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaired(value: Boolean): Self = StObject.set(x, "isPaired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReachable(value: Boolean): Self = StObject.set(x, "isReachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWatchAppInstalled(value: Boolean): Self = StObject.set(x, "isWatchAppInstalled", value.asInstanceOf[js.Any])
  }
}
