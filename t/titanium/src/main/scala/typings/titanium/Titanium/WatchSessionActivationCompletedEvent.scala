package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Called when the session has completed activation. If session state is
  * <Titanium.WatchSession.ACTIVATION_STATE_NOT_ACTIVATED> there will be an error
  * with more details.
  */
@js.native
trait WatchSessionActivationCompletedEvent extends WatchSessionBaseEvent {
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

object WatchSessionActivationCompletedEvent {
  @scala.inline
  def apply(
    activationState: Double,
    isActivated: Boolean,
    isComplicationEnabled: Boolean,
    isPaired: Boolean,
    isReachable: Boolean,
    isWatchAppInstalled: Boolean,
    source: WatchSession
  ): WatchSessionActivationCompletedEvent = {
    val __obj = js.Dynamic.literal(activationState = activationState.asInstanceOf[js.Any], isActivated = isActivated.asInstanceOf[js.Any], isComplicationEnabled = isComplicationEnabled.asInstanceOf[js.Any], isPaired = isPaired.asInstanceOf[js.Any], isReachable = isReachable.asInstanceOf[js.Any], isWatchAppInstalled = isWatchAppInstalled.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionActivationCompletedEvent]
  }
  @scala.inline
  implicit class WatchSessionActivationCompletedEventOps[Self <: WatchSessionActivationCompletedEvent] (val x: Self) extends AnyVal {
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
    def setActivationState(value: Double): Self = this.set("activationState", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActivated(value: Boolean): Self = this.set("isActivated", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsComplicationEnabled(value: Boolean): Self = this.set("isComplicationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPaired(value: Boolean): Self = this.set("isPaired", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReachable(value: Boolean): Self = this.set("isReachable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWatchAppInstalled(value: Boolean): Self = this.set("isWatchAppInstalled", value.asInstanceOf[js.Any])
  }
  
}

