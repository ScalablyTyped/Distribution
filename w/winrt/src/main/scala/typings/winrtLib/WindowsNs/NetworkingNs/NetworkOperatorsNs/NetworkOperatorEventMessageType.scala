package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkOperatorEventMessageType extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType")
@js.native
object NetworkOperatorEventMessageType extends js.Object {
  @js.native
  sealed trait cdma
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  @js.native
  sealed trait dataPlanDeleted
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  @js.native
  sealed trait dataPlanReset
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  @js.native
  sealed trait dataPlanThresholdReached
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  @js.native
  sealed trait gsm
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  @js.native
  sealed trait profileConnected
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  @js.native
  sealed trait profileDisconnected
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  @js.native
  sealed trait registeredHome
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  @js.native
  sealed trait registeredRoaming
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  @js.native
  sealed trait ussd
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /* 1 */ val cdma: cdma with scala.Double = js.native
  /* 5 */ val dataPlanDeleted: dataPlanDeleted with scala.Double = js.native
  /* 4 */ val dataPlanReset: dataPlanReset with scala.Double = js.native
  /* 3 */ val dataPlanThresholdReached: dataPlanThresholdReached with scala.Double = js.native
  /* 0 */ val gsm: gsm with scala.Double = js.native
  /* 6 */ val profileConnected: profileConnected with scala.Double = js.native
  /* 7 */ val profileDisconnected: profileDisconnected with scala.Double = js.native
  /* 9 */ val registeredHome: registeredHome with scala.Double = js.native
  /* 8 */ val registeredRoaming: registeredRoaming with scala.Double = js.native
  /* 2 */ val ussd: ussd with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType with scala.Double
  ] = js.native
}

