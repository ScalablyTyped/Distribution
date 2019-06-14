package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

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
  sealed trait backgroundWorkCostChange
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when a control channel is reset. */
  @js.native
  sealed trait controlChannelReset
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when the Internet becomes available. */
  @js.native
  sealed trait internetAvailable
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** Not a valid trigger type. */
  @js.native
  sealed trait invalid
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when a tile is added to the lock screen. */
  @js.native
  sealed trait lockScreenApplicationAdded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when a tile is removed from the lock screen. */
  @js.native
  sealed trait lockScreenApplicationRemoved
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when a network change occurs, such as a change in cost or connectivity. */
  @js.native
  sealed trait networkStateChange
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when the Microsoft account connected to the account changes. */
  @js.native
  sealed trait onlineIdConnectedStateChange
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when the status of the battery, BatteryStatus , changes. */
  @js.native
  sealed trait powerStateChange
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when the system has finished updating an app. */
  @js.native
  sealed trait servicingComplete
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when the session is connected. */
  @js.native
  sealed trait sessionConnected
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when a new SMS message is received by an installed mobile broadband device. */
  @js.native
  sealed trait smsReceived
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when the time zone changes on the device (for example, when the system adjusts the clock for daylight saving time). */
  @js.native
  sealed trait timeZoneChange
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when the user becomes absent. */
  @js.native
  sealed trait userAway
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /** The background task is triggered when the user becomes present. */
  @js.native
  sealed trait userPresent
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /* 13 */ val backgroundWorkCostChange: backgroundWorkCostChange with scala.Double = js.native
  /* 5 */ val controlChannelReset: controlChannelReset with scala.Double = js.native
  /* 6 */ val internetAvailable: internetAvailable with scala.Double = js.native
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 9 */ val lockScreenApplicationAdded: lockScreenApplicationAdded with scala.Double = js.native
  /* 10 */ val lockScreenApplicationRemoved: lockScreenApplicationRemoved with scala.Double = js.native
  /* 4 */ val networkStateChange: networkStateChange with scala.Double = js.native
  /* 12 */ val onlineIdConnectedStateChange: onlineIdConnectedStateChange with scala.Double = js.native
  /* 14 */ val powerStateChange: powerStateChange with scala.Double = js.native
  /* 8 */ val servicingComplete: servicingComplete with scala.Double = js.native
  /* 7 */ val sessionConnected: sessionConnected with scala.Double = js.native
  /* 1 */ val smsReceived: smsReceived with scala.Double = js.native
  /* 11 */ val timeZoneChange: timeZoneChange with scala.Double = js.native
  /* 3 */ val userAway: userAway with scala.Double = js.native
  /* 2 */ val userPresent: userPresent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType with scala.Double
  ] = js.native
}

