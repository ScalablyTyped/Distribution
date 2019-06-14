package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

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
  sealed trait denied
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  /** The device is not registered and is not searching for a network provider. */
  @js.native
  sealed trait deregistered
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  /** The device is on a home network provider. */
  @js.native
  sealed trait home
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  /** No connectivity. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  /** The device is on a roaming partner network provider. */
  @js.native
  sealed trait partner
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  /** The device is on a roaming network provider. */
  @js.native
  sealed trait roaming
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  /** The device is not registered and is searching for a network provider. */
  @js.native
  sealed trait searching
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  /* 6 */ val denied: denied with scala.Double = js.native
  /* 1 */ val deregistered: deregistered with scala.Double = js.native
  /* 3 */ val home: home with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 5 */ val partner: partner with scala.Double = js.native
  /* 4 */ val roaming: roaming with scala.Double = js.native
  /* 2 */ val searching: searching with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState with scala.Double
  ] = js.native
}

