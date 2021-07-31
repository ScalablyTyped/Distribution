package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DevicePairingResultStatus extends StObject
/** The result of the pairing action with an Association Endpoint (AEP) device object. For more information about AEP objects, see DeviceInformationKind . */
@JSGlobal("Windows.Devices.Enumeration.DevicePairingResultStatus")
@js.native
object DevicePairingResultStatus extends StObject {
  
  /** Your application does not have the appropriate permissions level to pair the device object. */
  @js.native
  sealed trait accessDenied
    extends StObject
       with DevicePairingResultStatus
  
  /** The device object has already been paired. */
  @js.native
  sealed trait alreadyPaired
    extends StObject
       with DevicePairingResultStatus
  
  /** Authentication failed, so the device is not paired. Either the device object or the application rejected the authentication. */
  @js.native
  sealed trait authenticationFailure
    extends StObject
       with DevicePairingResultStatus
  
  /** The authentication protocol is not supported, so the device is not paired. */
  @js.native
  sealed trait authenticationNotAllowed
    extends StObject
       with DevicePairingResultStatus
  
  /** The authentication process timed out before it could complete. */
  @js.native
  sealed trait authenticationTimeout
    extends StObject
       with DevicePairingResultStatus
  
  /** The device object rejected the connection. */
  @js.native
  sealed trait connectionRejected
    extends StObject
       with DevicePairingResultStatus
  
  /** An unknown failure occurred. */
  @js.native
  sealed trait failed
    extends StObject
       with DevicePairingResultStatus
  
  /** The device object indicated there was a hardware failure. */
  @js.native
  sealed trait hardwareFailure
    extends StObject
       with DevicePairingResultStatus
  
  /** The ceremony data was incorrect. */
  @js.native
  sealed trait invalidCeremonyData
    extends StObject
       with DevicePairingResultStatus
  
  /** There are no network profiles for this device object to use. */
  @js.native
  sealed trait noSupportedProfiles
    extends StObject
       with DevicePairingResultStatus
  
  /** The device object is not currently paired. */
  @js.native
  sealed trait notPaired
    extends StObject
       with DevicePairingResultStatus
  
  /** The device object is not in a state where it can be paired. */
  @js.native
  sealed trait notReadyToPair
    extends StObject
       with DevicePairingResultStatus
  
  /** The device object is already attempting to pair or unpair. */
  @js.native
  sealed trait operationAlreadyInProgress
    extends StObject
       with DevicePairingResultStatus
  
  /** The device object is now paired. */
  @js.native
  sealed trait paired
    extends StObject
       with DevicePairingResultStatus
  
  /** The pairing action was canceled before completion. */
  @js.native
  sealed trait pairingCanceled
    extends StObject
       with DevicePairingResultStatus
  
  /** The minimum level of protection is not supported by the device object or the application. */
  @js.native
  sealed trait protectionLevelCouldNotBeMet
    extends StObject
       with DevicePairingResultStatus
  
  /** The application handler rejected the pairing. */
  @js.native
  sealed trait rejectedByHandler
    extends StObject
       with DevicePairingResultStatus
  
  /** The remove device already has an association. */
  @js.native
  sealed trait remoteDeviceHasAssociation
    extends StObject
       with DevicePairingResultStatus
  
  /** Either the event handler wasn't registered or a required DevicePairingKinds was not supported. */
  @js.native
  sealed trait requiredHandlerNotRegistered
    extends StObject
       with DevicePairingResultStatus
  
  /** The device object indicated it cannot accept any more incoming connections. */
  @js.native
  sealed trait tooManyConnections
    extends StObject
       with DevicePairingResultStatus
}
