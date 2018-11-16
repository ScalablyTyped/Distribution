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
  
  val controlChannelReset: controlChannelReset with java.lang.String = js.native
  val internetAvailable: internetAvailable with java.lang.String = js.native
  val invalid: invalid with java.lang.String = js.native
  val lockScreenApplicationAdded: lockScreenApplicationAdded with java.lang.String = js.native
  val lockScreenApplicationRemoved: lockScreenApplicationRemoved with java.lang.String = js.native
  val networkStateChange: networkStateChange with java.lang.String = js.native
  val onlineIdConnectedStateChange: onlineIdConnectedStateChange with java.lang.String = js.native
  val servicingComplete: servicingComplete with java.lang.String = js.native
  val sessionConnected: sessionConnected with java.lang.String = js.native
  val smsReceived: smsReceived with java.lang.String = js.native
  val timeZoneChange: timeZoneChange with java.lang.String = js.native
  val userAway: userAway with java.lang.String = js.native
  val userPresent: userPresent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemTriggerType with java.lang.String
  ] = js.native
}

