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
  
  val brandingOptions: brandingOptions with java.lang.String = js.native
  val canDial: canDial with java.lang.String = js.native
  val cellularDetails: cellularDetails with java.lang.String = js.native
  val displayColor: displayColor with java.lang.String = js.native
  val displayName: displayName with java.lang.String = js.native
  val networkName: networkName with java.lang.String = js.native
  val networkState: networkState with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val transport: transport with java.lang.String = js.native
  val voicemail: voicemail with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties with java.lang.String
  ] = js.native
}

