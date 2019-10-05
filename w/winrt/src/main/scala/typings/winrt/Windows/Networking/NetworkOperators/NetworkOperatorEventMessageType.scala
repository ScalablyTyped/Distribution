package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkOperatorEventMessageType extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType")
@js.native
object NetworkOperatorEventMessageType extends js.Object {
  @js.native
  sealed trait cdma extends NetworkOperatorEventMessageType
  
  @js.native
  sealed trait dataPlanDeleted extends NetworkOperatorEventMessageType
  
  @js.native
  sealed trait dataPlanReset extends NetworkOperatorEventMessageType
  
  @js.native
  sealed trait dataPlanThresholdReached extends NetworkOperatorEventMessageType
  
  @js.native
  sealed trait gsm extends NetworkOperatorEventMessageType
  
  @js.native
  sealed trait profileConnected extends NetworkOperatorEventMessageType
  
  @js.native
  sealed trait profileDisconnected extends NetworkOperatorEventMessageType
  
  @js.native
  sealed trait registeredHome extends NetworkOperatorEventMessageType
  
  @js.native
  sealed trait registeredRoaming extends NetworkOperatorEventMessageType
  
  @js.native
  sealed trait ussd extends NetworkOperatorEventMessageType
  
  /* 1 */ val cdma: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.cdma with Double = js.native
  /* 5 */ val dataPlanDeleted: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanDeleted with Double = js.native
  /* 4 */ val dataPlanReset: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanReset with Double = js.native
  /* 3 */ val dataPlanThresholdReached: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanThresholdReached with Double = js.native
  /* 0 */ val gsm: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.gsm with Double = js.native
  /* 6 */ val profileConnected: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.profileConnected with Double = js.native
  /* 7 */ val profileDisconnected: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.profileDisconnected with Double = js.native
  /* 9 */ val registeredHome: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.registeredHome with Double = js.native
  /* 8 */ val registeredRoaming: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.registeredRoaming with Double = js.native
  /* 2 */ val ussd: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.ussd with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkOperatorEventMessageType with Double] = js.native
}

