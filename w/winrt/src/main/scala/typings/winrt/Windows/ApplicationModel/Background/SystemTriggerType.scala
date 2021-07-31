package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemTriggerType extends StObject
@JSGlobal("Windows.ApplicationModel.Background.SystemTriggerType")
@js.native
object SystemTriggerType extends StObject {
  
  @js.native
  sealed trait controlChannelReset
    extends StObject
       with SystemTriggerType
  
  @js.native
  sealed trait internetAvailable
    extends StObject
       with SystemTriggerType
  
  @js.native
  sealed trait invalid
    extends StObject
       with SystemTriggerType
  
  @js.native
  sealed trait lockScreenApplicationAdded
    extends StObject
       with SystemTriggerType
  
  @js.native
  sealed trait lockScreenApplicationRemoved
    extends StObject
       with SystemTriggerType
  
  @js.native
  sealed trait networkStateChange
    extends StObject
       with SystemTriggerType
  
  @js.native
  sealed trait onlineIdConnectedStateChange
    extends StObject
       with SystemTriggerType
  
  @js.native
  sealed trait servicingComplete
    extends StObject
       with SystemTriggerType
  
  @js.native
  sealed trait sessionConnected
    extends StObject
       with SystemTriggerType
  
  @js.native
  sealed trait smsReceived
    extends StObject
       with SystemTriggerType
  
  @js.native
  sealed trait timeZoneChange
    extends StObject
       with SystemTriggerType
  
  @js.native
  sealed trait userAway
    extends StObject
       with SystemTriggerType
  
  @js.native
  sealed trait userPresent
    extends StObject
       with SystemTriggerType
}
