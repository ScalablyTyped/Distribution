package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Called when the session can no longer be used to modify or add any new transfers and,
  * all interactive messages will be cancelled, but events for background transfers can still fire.
  * This will happen when the selected watch is being changed.
  */
trait WatchSessionInactiveEvent extends WatchSessionBaseEvent {
  /**
    * Returns the current activation state of the watch.  Only available on iOS 9.3
    * and later. See <Titanium.WatchSession.activationState> for more infos.
    */
  var activationState: Double
  /**
    * If the apple watch is currently activated. Only available on iOS 9.3
    * and later. See <Titanium.WatchSession.isActivated> for more infos.
    */
  var isActivated: Boolean
  /**
    * If the complication is enabled in the apple watch.
    */
  var isComplicationEnabled: Boolean
  /**
    * If the device is paired with the apple watch.
    */
  var isPaired: Boolean
  /**
    * If apple watch is currently reachable.
    */
  var isReachable: Boolean
  /**
    * If the watch app is installed in the apple watch.
    */
  var isWatchAppInstalled: Boolean
}

object WatchSessionInactiveEvent {
  @scala.inline
  def apply(
    activationState: Double,
    isActivated: Boolean,
    isComplicationEnabled: Boolean,
    isPaired: Boolean,
    isReachable: Boolean,
    isWatchAppInstalled: Boolean,
    source: WatchSession
  ): WatchSessionInactiveEvent = {
    val __obj = js.Dynamic.literal(activationState = activationState.asInstanceOf[js.Any], isActivated = isActivated.asInstanceOf[js.Any], isComplicationEnabled = isComplicationEnabled.asInstanceOf[js.Any], isPaired = isPaired.asInstanceOf[js.Any], isReachable = isReachable.asInstanceOf[js.Any], isWatchAppInstalled = isWatchAppInstalled.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionInactiveEvent]
  }
}

