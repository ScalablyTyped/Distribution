package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneLineProperties extends js.Object

/** Indicates a set of property flags that are part of a phone line changed trigger. Multiple properties can be set at one time. */
@JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneLineProperties")
@js.native
object PhoneLineProperties extends js.Object {
  /** The branding options for the phone line. */
  @js.native
  sealed trait brandingOptions
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties
  
  /** The ability to dial outgoing calls on the phone line. */
  @js.native
  sealed trait canDial
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties
  
  /** The cellular details for the phone line. */
  @js.native
  sealed trait cellularDetails
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties
  
  /** The preferred display color for the phone line. */
  @js.native
  sealed trait displayColor
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties
  
  /** The user assigned friendly name of the phone line. */
  @js.native
  sealed trait displayName
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties
  
  /** The name of the current network that is being used by the phone line. */
  @js.native
  sealed trait networkName
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties
  
  /** The current network status of the phone line. */
  @js.native
  sealed trait networkState
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties
  
  /** No property. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties
  
  /** The transport (cellular or voice over IP) for the phone line. */
  @js.native
  sealed trait transport
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties
  
  /** The voice mail account associated with the phone line. */
  @js.native
  sealed trait voicemail
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties
  
  /* 1 */ val brandingOptions: brandingOptions with scala.Double = js.native
  /* 2 */ val canDial: canDial with scala.Double = js.native
  /* 3 */ val cellularDetails: cellularDetails with scala.Double = js.native
  /* 4 */ val displayColor: displayColor with scala.Double = js.native
  /* 5 */ val displayName: displayName with scala.Double = js.native
  /* 6 */ val networkName: networkName with scala.Double = js.native
  /* 7 */ val networkState: networkState with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 8 */ val transport: transport with scala.Double = js.native
  /* 9 */ val voicemail: voicemail with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties with scala.Double
  ] = js.native
}

