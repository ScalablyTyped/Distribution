package typings.winrtUwp.Windows.ApplicationModel.Background

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
  
}

