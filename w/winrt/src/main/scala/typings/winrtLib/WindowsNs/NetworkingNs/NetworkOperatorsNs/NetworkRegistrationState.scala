package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkRegistrationState extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.NetworkRegistrationState")
@js.native
object NetworkRegistrationState extends js.Object {
  @js.native
  sealed trait denied
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  @js.native
  sealed trait deregistered
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  @js.native
  sealed trait home
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  @js.native
  sealed trait partner
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  @js.native
  sealed trait roaming
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  @js.native
  sealed trait searching
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState
  
  /* 6 */ val denied: denied with scala.Double = js.native
  /* 1 */ val deregistered: deregistered with scala.Double = js.native
  /* 3 */ val home: home with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 5 */ val partner: partner with scala.Double = js.native
  /* 4 */ val roaming: roaming with scala.Double = js.native
  /* 2 */ val searching: searching with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState with scala.Double
  ] = js.native
}

