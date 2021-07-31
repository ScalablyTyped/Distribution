package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemTriggerType extends StObject
/** Specifies the system events that can be used to trigger a background task. */
@JSGlobal("Windows.ApplicationModel.Background.SystemTriggerType")
@js.native
object SystemTriggerType extends StObject {
  
  /** The background task is triggered when the cost of background work changes. */
  @js.native
  sealed trait backgroundWorkCostChange
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when a control channel is reset. */
  @js.native
  sealed trait controlChannelReset
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when the Internet becomes available. */
  @js.native
  sealed trait internetAvailable
    extends StObject
       with SystemTriggerType
  
  /** Not a valid trigger type. */
  @js.native
  sealed trait invalid
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when a tile is added to the lock screen. */
  @js.native
  sealed trait lockScreenApplicationAdded
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when a tile is removed from the lock screen. */
  @js.native
  sealed trait lockScreenApplicationRemoved
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when a network change occurs, such as a change in cost or connectivity. */
  @js.native
  sealed trait networkStateChange
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when the Microsoft account connected to the account changes. */
  @js.native
  sealed trait onlineIdConnectedStateChange
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when the status of the battery, BatteryStatus , changes. */
  @js.native
  sealed trait powerStateChange
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when the system has finished updating an app. */
  @js.native
  sealed trait servicingComplete
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when the session is connected. */
  @js.native
  sealed trait sessionConnected
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when a new SMS message is received by an installed mobile broadband device. */
  @js.native
  sealed trait smsReceived
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when the time zone changes on the device (for example, when the system adjusts the clock for daylight saving time). */
  @js.native
  sealed trait timeZoneChange
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when the user becomes absent. */
  @js.native
  sealed trait userAway
    extends StObject
       with SystemTriggerType
  
  /** The background task is triggered when the user becomes present. */
  @js.native
  sealed trait userPresent
    extends StObject
       with SystemTriggerType
}
