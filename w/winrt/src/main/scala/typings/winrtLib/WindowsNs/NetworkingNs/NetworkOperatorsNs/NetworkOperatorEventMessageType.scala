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
  
  val cdma: cdma with java.lang.String = js.native
  val dataPlanDeleted: dataPlanDeleted with java.lang.String = js.native
  val dataPlanReset: dataPlanReset with java.lang.String = js.native
  val dataPlanThresholdReached: dataPlanThresholdReached with java.lang.String = js.native
  val gsm: gsm with java.lang.String = js.native
  val profileConnected: profileConnected with java.lang.String = js.native
  val profileDisconnected: profileDisconnected with java.lang.String = js.native
  val registeredHome: registeredHome with java.lang.String = js.native
  val registeredRoaming: registeredRoaming with java.lang.String = js.native
  val ussd: ussd with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType with java.lang.String
  ] = js.native
}

