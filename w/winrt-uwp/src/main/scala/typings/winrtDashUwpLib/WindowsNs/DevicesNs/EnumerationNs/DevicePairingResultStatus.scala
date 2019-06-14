package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DevicePairingResultStatus extends js.Object

/** The result of the pairing action with an Association Endpoint (AEP) device object. For more information about AEP objects, see DeviceInformationKind . */
@JSGlobal("Windows.Devices.Enumeration.DevicePairingResultStatus")
@js.native
object DevicePairingResultStatus extends js.Object {
  /** Your application does not have the appropriate permissions level to pair the device object. */
  @js.native
  sealed trait accessDenied
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The device object has already been paired. */
  @js.native
  sealed trait alreadyPaired
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** Authentication failed, so the device is not paired. Either the device object or the application rejected the authentication. */
  @js.native
  sealed trait authenticationFailure
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The authentication protocol is not supported, so the device is not paired. */
  @js.native
  sealed trait authenticationNotAllowed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The authentication process timed out before it could complete. */
  @js.native
  sealed trait authenticationTimeout
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The device object rejected the connection. */
  @js.native
  sealed trait connectionRejected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** An unknown failure occurred. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The device object indicated there was a hardware failure. */
  @js.native
  sealed trait hardwareFailure
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The ceremony data was incorrect. */
  @js.native
  sealed trait invalidCeremonyData
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** There are no network profiles for this device object to use. */
  @js.native
  sealed trait noSupportedProfiles
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The device object is not currently paired. */
  @js.native
  sealed trait notPaired
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The device object is not in a state where it can be paired. */
  @js.native
  sealed trait notReadyToPair
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The device object is already attempting to pair or unpair. */
  @js.native
  sealed trait operationAlreadyInProgress
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The device object is now paired. */
  @js.native
  sealed trait paired
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The pairing action was canceled before completion. */
  @js.native
  sealed trait pairingCanceled
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The minimum level of protection is not supported by the device object or the application. */
  @js.native
  sealed trait protectionLevelCouldNotBeMet
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The application handler rejected the pairing. */
  @js.native
  sealed trait rejectedByHandler
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The remove device already has an association. */
  @js.native
  sealed trait remoteDeviceHasAssociation
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** Either the event handler wasn't registered or a required DevicePairingKinds was not supported. */
  @js.native
  sealed trait requiredHandlerNotRegistered
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /** The device object indicated it cannot accept any more incoming connections. */
  @js.native
  sealed trait tooManyConnections
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus
  
  /* 12 */ val accessDenied: accessDenied with scala.Double = js.native
  /* 3 */ val alreadyPaired: alreadyPaired with scala.Double = js.native
  /* 9 */ val authenticationFailure: authenticationFailure with scala.Double = js.native
  /* 8 */ val authenticationNotAllowed: authenticationNotAllowed with scala.Double = js.native
  /* 7 */ val authenticationTimeout: authenticationTimeout with scala.Double = js.native
  /* 4 */ val connectionRejected: connectionRejected with scala.Double = js.native
  /* 19 */ val failed: failed with scala.Double = js.native
  /* 6 */ val hardwareFailure: hardwareFailure with scala.Double = js.native
  /* 13 */ val invalidCeremonyData: invalidCeremonyData with scala.Double = js.native
  /* 10 */ val noSupportedProfiles: noSupportedProfiles with scala.Double = js.native
  /* 2 */ val notPaired: notPaired with scala.Double = js.native
  /* 1 */ val notReadyToPair: notReadyToPair with scala.Double = js.native
  /* 15 */ val operationAlreadyInProgress: operationAlreadyInProgress with scala.Double = js.native
  /* 0 */ val paired: paired with scala.Double = js.native
  /* 14 */ val pairingCanceled: pairingCanceled with scala.Double = js.native
  /* 11 */ val protectionLevelCouldNotBeMet: protectionLevelCouldNotBeMet with scala.Double = js.native
  /* 17 */ val rejectedByHandler: rejectedByHandler with scala.Double = js.native
  /* 18 */ val remoteDeviceHasAssociation: remoteDeviceHasAssociation with scala.Double = js.native
  /* 16 */ val requiredHandlerNotRegistered: requiredHandlerNotRegistered with scala.Double = js.native
  /* 5 */ val tooManyConnections: tooManyConnections with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus with scala.Double
  ] = js.native
}

