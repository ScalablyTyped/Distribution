package typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.brandingOptions
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.canDial
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.cellularDetails
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.displayColor
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.displayName
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.networkName
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.networkState
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.none
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.transport
import typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.voicemail
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneLineProperties with Double] = js.native
  /* 1 */ @js.native
  object brandingOptions extends TopLevel[brandingOptions with Double]
  
  /* 2 */ @js.native
  object canDial extends TopLevel[canDial with Double]
  
  /* 3 */ @js.native
  object cellularDetails extends TopLevel[cellularDetails with Double]
  
  /* 4 */ @js.native
  object displayColor extends TopLevel[displayColor with Double]
  
  /* 5 */ @js.native
  object displayName extends TopLevel[displayName with Double]
  
  /* 6 */ @js.native
  object networkName extends TopLevel[networkName with Double]
  
  /* 7 */ @js.native
  object networkState extends TopLevel[networkState with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 8 */ @js.native
  object transport extends TopLevel[transport with Double]
  
  /* 9 */ @js.native
  object voicemail extends TopLevel[voicemail with Double]
  
}

