package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkOperatorEventMessageType extends StObject
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType")
@js.native
object NetworkOperatorEventMessageType extends StObject {
  
  @js.native
  sealed trait cdma
    extends StObject
       with NetworkOperatorEventMessageType
  
  @js.native
  sealed trait dataPlanDeleted
    extends StObject
       with NetworkOperatorEventMessageType
  
  @js.native
  sealed trait dataPlanReset
    extends StObject
       with NetworkOperatorEventMessageType
  
  @js.native
  sealed trait dataPlanThresholdReached
    extends StObject
       with NetworkOperatorEventMessageType
  
  @js.native
  sealed trait gsm
    extends StObject
       with NetworkOperatorEventMessageType
  
  @js.native
  sealed trait profileConnected
    extends StObject
       with NetworkOperatorEventMessageType
  
  @js.native
  sealed trait profileDisconnected
    extends StObject
       with NetworkOperatorEventMessageType
  
  @js.native
  sealed trait registeredHome
    extends StObject
       with NetworkOperatorEventMessageType
  
  @js.native
  sealed trait registeredRoaming
    extends StObject
       with NetworkOperatorEventMessageType
  
  @js.native
  sealed trait ussd
    extends StObject
       with NetworkOperatorEventMessageType
}
