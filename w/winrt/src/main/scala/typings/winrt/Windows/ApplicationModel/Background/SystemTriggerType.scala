package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemTriggerType extends StObject
@JSGlobal("Windows.ApplicationModel.Background.SystemTriggerType")
@js.native
object SystemTriggerType extends StObject {
  
  @js.native
  sealed trait controlChannelReset extends SystemTriggerType
  
  @js.native
  sealed trait internetAvailable extends SystemTriggerType
  
  @js.native
  sealed trait invalid extends SystemTriggerType
  
  @js.native
  sealed trait lockScreenApplicationAdded extends SystemTriggerType
  
  @js.native
  sealed trait lockScreenApplicationRemoved extends SystemTriggerType
  
  @js.native
  sealed trait networkStateChange extends SystemTriggerType
  
  @js.native
  sealed trait onlineIdConnectedStateChange extends SystemTriggerType
  
  @js.native
  sealed trait servicingComplete extends SystemTriggerType
  
  @js.native
  sealed trait sessionConnected extends SystemTriggerType
  
  @js.native
  sealed trait smsReceived extends SystemTriggerType
  
  @js.native
  sealed trait timeZoneChange extends SystemTriggerType
  
  @js.native
  sealed trait userAway extends SystemTriggerType
  
  @js.native
  sealed trait userPresent extends SystemTriggerType
}
