package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkRegistrationState extends js.Object

/** Describes the network registration state of a mobile broadband device. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkRegistrationState")
@js.native
object NetworkRegistrationState extends js.Object {
  /** The device was denied registration. Emergency voice calls may be made. This applies to voice and not data. */
  @js.native
  sealed trait denied extends NetworkRegistrationState
  
  /** The device is not registered and is not searching for a network provider. */
  @js.native
  sealed trait deregistered extends NetworkRegistrationState
  
  /** The device is on a home network provider. */
  @js.native
  sealed trait home extends NetworkRegistrationState
  
  /** No connectivity. */
  @js.native
  sealed trait none extends NetworkRegistrationState
  
  /** The device is on a roaming partner network provider. */
  @js.native
  sealed trait partner extends NetworkRegistrationState
  
  /** The device is on a roaming network provider. */
  @js.native
  sealed trait roaming extends NetworkRegistrationState
  
  /** The device is not registered and is searching for a network provider. */
  @js.native
  sealed trait searching extends NetworkRegistrationState
  
  /* 6 */ val denied: typings.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkRegistrationState.denied with Double = js.native
  /* 1 */ val deregistered: typings.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkRegistrationState.deregistered with Double = js.native
  /* 3 */ val home: typings.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkRegistrationState.home with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkRegistrationState.none with Double = js.native
  /* 5 */ val partner: typings.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkRegistrationState.partner with Double = js.native
  /* 4 */ val roaming: typings.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkRegistrationState.roaming with Double = js.native
  /* 2 */ val searching: typings.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkRegistrationState.searching with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkRegistrationState with Double] = js.native
}

