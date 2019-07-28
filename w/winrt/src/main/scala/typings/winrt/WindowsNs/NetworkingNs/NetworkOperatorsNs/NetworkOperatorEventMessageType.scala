package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

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
  
  /* 1 */ val cdma: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.cdma with Double = js.native
  /* 5 */ val dataPlanDeleted: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.dataPlanDeleted with Double = js.native
  /* 4 */ val dataPlanReset: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.dataPlanReset with Double = js.native
  /* 3 */ val dataPlanThresholdReached: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.dataPlanThresholdReached with Double = js.native
  /* 0 */ val gsm: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.gsm with Double = js.native
  /* 6 */ val profileConnected: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.profileConnected with Double = js.native
  /* 7 */ val profileDisconnected: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.profileDisconnected with Double = js.native
  /* 9 */ val registeredHome: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.registeredHome with Double = js.native
  /* 8 */ val registeredRoaming: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.registeredRoaming with Double = js.native
  /* 2 */ val ussd: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.ussd with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkOperatorEventMessageType with Double] = js.native
}

