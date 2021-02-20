package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkOperatorEventMessageType extends StObject
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType")
@js.native
object NetworkOperatorEventMessageType extends StObject {
  
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
