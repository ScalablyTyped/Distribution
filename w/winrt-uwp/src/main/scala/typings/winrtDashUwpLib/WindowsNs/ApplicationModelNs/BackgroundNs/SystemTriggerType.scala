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
  
  val backgroundWorkCostChange: backgroundWorkCostChange with java.lang.String = js.native
  val controlChannelReset: controlChannelReset with java.lang.String = js.native
  val internetAvailable: internetAvailable with java.lang.String = js.native
  val invalid: invalid with java.lang.String = js.native
  val lockScreenApplicationAdded: lockScreenApplicationAdded with java.lang.String = js.native
  val lockScreenApplicationRemoved: lockScreenApplicationRemoved with java.lang.String = js.native
  val networkStateChange: networkStateChange with java.lang.String = js.native
  val onlineIdConnectedStateChange: onlineIdConnectedStateChange with java.lang.String = js.native
  val powerStateChange: powerStateChange with java.lang.String = js.native
  val servicingComplete: servicingComplete with java.lang.String = js.native
  val sessionConnected: sessionConnected with java.lang.String = js.native
  val smsReceived: smsReceived with java.lang.String = js.native
  val timeZoneChange: timeZoneChange with java.lang.String = js.native
  val userAway: userAway with java.lang.String = js.native
  val userPresent: userPresent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType with java.lang.String
  ] = js.native
}

