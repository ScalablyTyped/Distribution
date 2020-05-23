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
  
}

