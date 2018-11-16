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
  
  val accessDenied: accessDenied with java.lang.String = js.native
  val alreadyPaired: alreadyPaired with java.lang.String = js.native
  val authenticationFailure: authenticationFailure with java.lang.String = js.native
  val authenticationNotAllowed: authenticationNotAllowed with java.lang.String = js.native
  val authenticationTimeout: authenticationTimeout with java.lang.String = js.native
  val connectionRejected: connectionRejected with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val hardwareFailure: hardwareFailure with java.lang.String = js.native
  val invalidCeremonyData: invalidCeremonyData with java.lang.String = js.native
  val noSupportedProfiles: noSupportedProfiles with java.lang.String = js.native
  val notPaired: notPaired with java.lang.String = js.native
  val notReadyToPair: notReadyToPair with java.lang.String = js.native
  val operationAlreadyInProgress: operationAlreadyInProgress with java.lang.String = js.native
  val paired: paired with java.lang.String = js.native
  val pairingCanceled: pairingCanceled with java.lang.String = js.native
  val protectionLevelCouldNotBeMet: protectionLevelCouldNotBeMet with java.lang.String = js.native
  val rejectedByHandler: rejectedByHandler with java.lang.String = js.native
  val remoteDeviceHasAssociation: remoteDeviceHasAssociation with java.lang.String = js.native
  val requiredHandlerNotRegistered: requiredHandlerNotRegistered with java.lang.String = js.native
  val tooManyConnections: tooManyConnections with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePairingResultStatus with java.lang.String
  ] = js.native
}

