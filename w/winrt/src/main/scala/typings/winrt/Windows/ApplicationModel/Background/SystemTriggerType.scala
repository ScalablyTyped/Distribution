package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemTriggerType extends js.Object

@JSGlobal("Windows.ApplicationModel.Background.SystemTriggerType")
@js.native
object SystemTriggerType extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SystemTriggerType with Double] = js.native
  /* 5 */ @js.native
  object controlChannelReset extends TopLevel[controlChannelReset with Double]
  
  /* 6 */ @js.native
  object internetAvailable extends TopLevel[internetAvailable with Double]
  
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 9 */ @js.native
  object lockScreenApplicationAdded extends TopLevel[lockScreenApplicationAdded with Double]
  
  /* 10 */ @js.native
  object lockScreenApplicationRemoved extends TopLevel[lockScreenApplicationRemoved with Double]
  
  /* 4 */ @js.native
  object networkStateChange extends TopLevel[networkStateChange with Double]
  
  /* 12 */ @js.native
  object onlineIdConnectedStateChange extends TopLevel[onlineIdConnectedStateChange with Double]
  
  /* 8 */ @js.native
  object servicingComplete extends TopLevel[servicingComplete with Double]
  
  /* 7 */ @js.native
  object sessionConnected extends TopLevel[sessionConnected with Double]
  
  /* 1 */ @js.native
  object smsReceived extends TopLevel[smsReceived with Double]
  
  /* 11 */ @js.native
  object timeZoneChange extends TopLevel[timeZoneChange with Double]
  
  /* 3 */ @js.native
  object userAway extends TopLevel[userAway with Double]
  
  /* 2 */ @js.native
  object userPresent extends TopLevel[userPresent with Double]
  
}

