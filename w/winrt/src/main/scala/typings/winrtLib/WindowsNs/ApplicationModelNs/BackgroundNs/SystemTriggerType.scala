package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemTriggerType extends js.Object

@JSGlobal("Windows.ApplicationModel.Background.SystemTriggerType")
@js.native
object SystemTriggerType extends js.Object {
  @js.native
  sealed trait controlChannelReset
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  @js.native
  sealed trait internetAvailable
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  @js.native
  sealed trait invalid
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  @js.native
  sealed trait lockScreenApplicationAdded
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  @js.native
  sealed trait lockScreenApplicationRemoved
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  @js.native
  sealed trait networkStateChange
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  @js.native
  sealed trait onlineIdConnectedStateChange
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  @js.native
  sealed trait servicingComplete
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  @js.native
  sealed trait sessionConnected
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  @js.native
  sealed trait smsReceived
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  @js.native
  sealed trait timeZoneChange
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  @js.native
  sealed trait userAway
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  @js.native
  sealed trait userPresent
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType
  
  /* 5 */ val controlChannelReset: controlChannelReset with scala.Double = js.native
  /* 6 */ val internetAvailable: internetAvailable with scala.Double = js.native
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 9 */ val lockScreenApplicationAdded: lockScreenApplicationAdded with scala.Double = js.native
  /* 10 */ val lockScreenApplicationRemoved: lockScreenApplicationRemoved with scala.Double = js.native
  /* 4 */ val networkStateChange: networkStateChange with scala.Double = js.native
  /* 12 */ val onlineIdConnectedStateChange: onlineIdConnectedStateChange with scala.Double = js.native
  /* 8 */ val servicingComplete: servicingComplete with scala.Double = js.native
  /* 7 */ val sessionConnected: sessionConnected with scala.Double = js.native
  /* 1 */ val smsReceived: smsReceived with scala.Double = js.native
  /* 11 */ val timeZoneChange: timeZoneChange with scala.Double = js.native
  /* 3 */ val userAway: userAway with scala.Double = js.native
  /* 2 */ val userPresent: userPresent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType with scala.Double
  ] = js.native
}

