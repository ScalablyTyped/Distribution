package typings.winrtDashUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemTriggerType extends js.Object

/** Specifies the system events that can be used to trigger a background task. */
@JSGlobal("Windows.ApplicationModel.Background.SystemTriggerType")
@js.native
object SystemTriggerType extends js.Object {
  /** The background task is triggered when the cost of background work changes. */
  @js.native
  sealed trait backgroundWorkCostChange extends SystemTriggerType
  
  /** The background task is triggered when a control channel is reset. */
  @js.native
  sealed trait controlChannelReset extends SystemTriggerType
  
  /** The background task is triggered when the Internet becomes available. */
  @js.native
  sealed trait internetAvailable extends SystemTriggerType
  
  /** Not a valid trigger type. */
  @js.native
  sealed trait invalid extends SystemTriggerType
  
  /** The background task is triggered when a tile is added to the lock screen. */
  @js.native
  sealed trait lockScreenApplicationAdded extends SystemTriggerType
  
  /** The background task is triggered when a tile is removed from the lock screen. */
  @js.native
  sealed trait lockScreenApplicationRemoved extends SystemTriggerType
  
  /** The background task is triggered when a network change occurs, such as a change in cost or connectivity. */
  @js.native
  sealed trait networkStateChange extends SystemTriggerType
  
  /** The background task is triggered when the Microsoft account connected to the account changes. */
  @js.native
  sealed trait onlineIdConnectedStateChange extends SystemTriggerType
  
  /** The background task is triggered when the status of the battery, BatteryStatus , changes. */
  @js.native
  sealed trait powerStateChange extends SystemTriggerType
  
  /** The background task is triggered when the system has finished updating an app. */
  @js.native
  sealed trait servicingComplete extends SystemTriggerType
  
  /** The background task is triggered when the session is connected. */
  @js.native
  sealed trait sessionConnected extends SystemTriggerType
  
  /** The background task is triggered when a new SMS message is received by an installed mobile broadband device. */
  @js.native
  sealed trait smsReceived extends SystemTriggerType
  
  /** The background task is triggered when the time zone changes on the device (for example, when the system adjusts the clock for daylight saving time). */
  @js.native
  sealed trait timeZoneChange extends SystemTriggerType
  
  /** The background task is triggered when the user becomes absent. */
  @js.native
  sealed trait userAway extends SystemTriggerType
  
  /** The background task is triggered when the user becomes present. */
  @js.native
  sealed trait userPresent extends SystemTriggerType
  
  /* 13 */ val backgroundWorkCostChange: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.backgroundWorkCostChange with Double = js.native
  /* 5 */ val controlChannelReset: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.controlChannelReset with Double = js.native
  /* 6 */ val internetAvailable: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.internetAvailable with Double = js.native
  /* 0 */ val invalid: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.invalid with Double = js.native
  /* 9 */ val lockScreenApplicationAdded: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.lockScreenApplicationAdded with Double = js.native
  /* 10 */ val lockScreenApplicationRemoved: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.lockScreenApplicationRemoved with Double = js.native
  /* 4 */ val networkStateChange: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.networkStateChange with Double = js.native
  /* 12 */ val onlineIdConnectedStateChange: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.onlineIdConnectedStateChange with Double = js.native
  /* 14 */ val powerStateChange: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.powerStateChange with Double = js.native
  /* 8 */ val servicingComplete: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.servicingComplete with Double = js.native
  /* 7 */ val sessionConnected: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.sessionConnected with Double = js.native
  /* 1 */ val smsReceived: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.smsReceived with Double = js.native
  /* 11 */ val timeZoneChange: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.timeZoneChange with Double = js.native
  /* 3 */ val userAway: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.userAway with Double = js.native
  /* 2 */ val userPresent: typings.winrtDashUwp.Windows.ApplicationModel.Background.SystemTriggerType.userPresent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SystemTriggerType with Double] = js.native
}

