package typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemTriggerType extends js.Object

@JSGlobal("Windows.ApplicationModel.Background.SystemTriggerType")
@js.native
object SystemTriggerType extends js.Object {
  @js.native
  sealed trait controlChannelReset extends SystemTriggerType
  
  @js.native
  sealed trait internetAvailable extends SystemTriggerType
  
  @js.native
  sealed trait invalid extends SystemTriggerType
  
  @js.native
  sealed trait lockScreenApplicationAdded extends SystemTriggerType
  
  @js.native
  sealed trait lockScreenApplicationRemoved extends SystemTriggerType
  
  @js.native
  sealed trait networkStateChange extends SystemTriggerType
  
  @js.native
  sealed trait onlineIdConnectedStateChange extends SystemTriggerType
  
  @js.native
  sealed trait servicingComplete extends SystemTriggerType
  
  @js.native
  sealed trait sessionConnected extends SystemTriggerType
  
  @js.native
  sealed trait smsReceived extends SystemTriggerType
  
  @js.native
  sealed trait timeZoneChange extends SystemTriggerType
  
  @js.native
  sealed trait userAway extends SystemTriggerType
  
  @js.native
  sealed trait userPresent extends SystemTriggerType
  
  /* 5 */ val controlChannelReset: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.controlChannelReset with Double = js.native
  /* 6 */ val internetAvailable: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.internetAvailable with Double = js.native
  /* 0 */ val invalid: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.invalid with Double = js.native
  /* 9 */ val lockScreenApplicationAdded: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.lockScreenApplicationAdded with Double = js.native
  /* 10 */ val lockScreenApplicationRemoved: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.lockScreenApplicationRemoved with Double = js.native
  /* 4 */ val networkStateChange: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.networkStateChange with Double = js.native
  /* 12 */ val onlineIdConnectedStateChange: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.onlineIdConnectedStateChange with Double = js.native
  /* 8 */ val servicingComplete: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.servicingComplete with Double = js.native
  /* 7 */ val sessionConnected: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.sessionConnected with Double = js.native
  /* 1 */ val smsReceived: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.smsReceived with Double = js.native
  /* 11 */ val timeZoneChange: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.timeZoneChange with Double = js.native
  /* 3 */ val userAway: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.userAway with Double = js.native
  /* 2 */ val userPresent: typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType.userPresent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SystemTriggerType with Double] = js.native
}

