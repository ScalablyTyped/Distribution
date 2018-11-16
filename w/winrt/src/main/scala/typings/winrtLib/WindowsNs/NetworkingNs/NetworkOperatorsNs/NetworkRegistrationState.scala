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
  
  val denied: denied with java.lang.String = js.native
  val deregistered: deregistered with java.lang.String = js.native
  val home: home with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val partner: partner with java.lang.String = js.native
  val roaming: roaming with java.lang.String = js.native
  val searching: searching with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkRegistrationState with java.lang.String
  ] = js.native
}

