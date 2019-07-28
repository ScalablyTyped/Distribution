package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs

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
  sealed trait brandingOptions extends PhoneLineProperties
  
  /** The ability to dial outgoing calls on the phone line. */
  @js.native
  sealed trait canDial extends PhoneLineProperties
  
  /** The cellular details for the phone line. */
  @js.native
  sealed trait cellularDetails extends PhoneLineProperties
  
  /** The preferred display color for the phone line. */
  @js.native
  sealed trait displayColor extends PhoneLineProperties
  
  /** The user assigned friendly name of the phone line. */
  @js.native
  sealed trait displayName extends PhoneLineProperties
  
  /** The name of the current network that is being used by the phone line. */
  @js.native
  sealed trait networkName extends PhoneLineProperties
  
  /** The current network status of the phone line. */
  @js.native
  sealed trait networkState extends PhoneLineProperties
  
  /** No property. */
  @js.native
  sealed trait none extends PhoneLineProperties
  
  /** The transport (cellular or voice over IP) for the phone line. */
  @js.native
  sealed trait transport extends PhoneLineProperties
  
  /** The voice mail account associated with the phone line. */
  @js.native
  sealed trait voicemail extends PhoneLineProperties
  
  /* 1 */ val brandingOptions: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties.brandingOptions with Double = js.native
  /* 2 */ val canDial: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties.canDial with Double = js.native
  /* 3 */ val cellularDetails: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties.cellularDetails with Double = js.native
  /* 4 */ val displayColor: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties.displayColor with Double = js.native
  /* 5 */ val displayName: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties.displayName with Double = js.native
  /* 6 */ val networkName: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties.networkName with Double = js.native
  /* 7 */ val networkState: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties.networkState with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties.none with Double = js.native
  /* 8 */ val transport: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties.transport with Double = js.native
  /* 9 */ val voicemail: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneLineProperties.voicemail with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneLineProperties with Double] = js.native
}

