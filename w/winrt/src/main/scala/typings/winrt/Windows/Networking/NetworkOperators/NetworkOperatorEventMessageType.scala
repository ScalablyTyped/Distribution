package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.cdma
import typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanDeleted
import typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanReset
import typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanThresholdReached
import typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.gsm
import typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.profileConnected
import typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.profileDisconnected
import typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.registeredHome
import typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.registeredRoaming
import typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.ussd
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkOperatorEventMessageType with Double] = js.native
  /* 1 */ @js.native
  object cdma extends TopLevel[cdma with Double]
  
  /* 5 */ @js.native
  object dataPlanDeleted extends TopLevel[dataPlanDeleted with Double]
  
  /* 4 */ @js.native
  object dataPlanReset extends TopLevel[dataPlanReset with Double]
  
  /* 3 */ @js.native
  object dataPlanThresholdReached extends TopLevel[dataPlanThresholdReached with Double]
  
  /* 0 */ @js.native
  object gsm extends TopLevel[gsm with Double]
  
  /* 6 */ @js.native
  object profileConnected extends TopLevel[profileConnected with Double]
  
  /* 7 */ @js.native
  object profileDisconnected extends TopLevel[profileDisconnected with Double]
  
  /* 9 */ @js.native
  object registeredHome extends TopLevel[registeredHome with Double]
  
  /* 8 */ @js.native
  object registeredRoaming extends TopLevel[registeredRoaming with Double]
  
  /* 2 */ @js.native
  object ussd extends TopLevel[ussd with Double]
  
}

