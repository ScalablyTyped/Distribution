package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkRegistrationState extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.NetworkRegistrationState")
@js.native
object NetworkRegistrationState extends js.Object {
  @js.native
  sealed trait denied extends NetworkRegistrationState
  
  @js.native
  sealed trait deregistered extends NetworkRegistrationState
  
  @js.native
  sealed trait home extends NetworkRegistrationState
  
  @js.native
  sealed trait none extends NetworkRegistrationState
  
  @js.native
  sealed trait partner extends NetworkRegistrationState
  
  @js.native
  sealed trait roaming extends NetworkRegistrationState
  
  @js.native
  sealed trait searching extends NetworkRegistrationState
  
  /* 6 */ val denied: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.denied with Double = js.native
  /* 1 */ val deregistered: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.deregistered with Double = js.native
  /* 3 */ val home: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.home with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.none with Double = js.native
  /* 5 */ val partner: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.partner with Double = js.native
  /* 4 */ val roaming: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.roaming with Double = js.native
  /* 2 */ val searching: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.searching with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkRegistrationState with Double] = js.native
}

