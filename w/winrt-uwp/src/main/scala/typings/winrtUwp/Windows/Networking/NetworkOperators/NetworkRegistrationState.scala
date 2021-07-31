package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkRegistrationState extends StObject
/** Describes the network registration state of a mobile broadband device. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkRegistrationState")
@js.native
object NetworkRegistrationState extends StObject {
  
  /** The device was denied registration. Emergency voice calls may be made. This applies to voice and not data. */
  @js.native
  sealed trait denied
    extends StObject
       with NetworkRegistrationState
  
  /** The device is not registered and is not searching for a network provider. */
  @js.native
  sealed trait deregistered
    extends StObject
       with NetworkRegistrationState
  
  /** The device is on a home network provider. */
  @js.native
  sealed trait home
    extends StObject
       with NetworkRegistrationState
  
  /** No connectivity. */
  @js.native
  sealed trait none
    extends StObject
       with NetworkRegistrationState
  
  /** The device is on a roaming partner network provider. */
  @js.native
  sealed trait partner
    extends StObject
       with NetworkRegistrationState
  
  /** The device is on a roaming network provider. */
  @js.native
  sealed trait roaming
    extends StObject
       with NetworkRegistrationState
  
  /** The device is not registered and is searching for a network provider. */
  @js.native
  sealed trait searching
    extends StObject
       with NetworkRegistrationState
}
