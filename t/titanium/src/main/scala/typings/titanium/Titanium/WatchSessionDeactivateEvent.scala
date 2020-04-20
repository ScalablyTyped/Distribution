package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Called when all events for the previously selected watch has occurred.
	 * The session can be re-activated for the now selected watch using activateSession.
	 */
trait WatchSessionDeactivateEvent extends WatchSessionBaseEvent {
  /**
  		 * Returns the current activation state of the watch.  Only available on iOS 9.3
  		 * and later. See <Titanium.WatchSession.activationState> for more infos.
  		 */
  var activationState: Double
  /**
  		 * If the apple watch has currently content pending. Only available on iOS 10.0
  		 * and later. See <Titanium.WatchSession.hasContentPending> for more infos.
  		 */
  var hasContentPending: Boolean
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
  /**
  		 * If the apple watch has complication userInfo transfers left. Only available on iOS 10.0
  		 * and later. See <Titanium.WatchSession.remainingComplicationUserInfoTransfers> for more infos.
  		 */
  var remainingComplicationUserInfoTransfers: Boolean
}

object WatchSessionDeactivateEvent {
  @scala.inline
  def apply(
    activationState: Double,
    hasContentPending: Boolean,
    isActivated: Boolean,
    isComplicationEnabled: Boolean,
    isPaired: Boolean,
    isReachable: Boolean,
    isWatchAppInstalled: Boolean,
    remainingComplicationUserInfoTransfers: Boolean,
    source: WatchSession
  ): WatchSessionDeactivateEvent = {
    val __obj = js.Dynamic.literal(activationState = activationState.asInstanceOf[js.Any], hasContentPending = hasContentPending.asInstanceOf[js.Any], isActivated = isActivated.asInstanceOf[js.Any], isComplicationEnabled = isComplicationEnabled.asInstanceOf[js.Any], isPaired = isPaired.asInstanceOf[js.Any], isReachable = isReachable.asInstanceOf[js.Any], isWatchAppInstalled = isWatchAppInstalled.asInstanceOf[js.Any], remainingComplicationUserInfoTransfers = remainingComplicationUserInfoTransfers.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionDeactivateEvent]
  }
}

