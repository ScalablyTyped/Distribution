package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemConditionType extends js.Object

@JSGlobal("Windows.ApplicationModel.Background.SystemConditionType")
@js.native
object SystemConditionType extends js.Object {
  @js.native
  sealed trait internetAvailable extends SystemConditionType
  
  @js.native
  sealed trait internetNotAvailable extends SystemConditionType
  
  @js.native
  sealed trait invalid extends SystemConditionType
  
  @js.native
  sealed trait sessionConnected extends SystemConditionType
  
  @js.native
  sealed trait sessionDisconnected extends SystemConditionType
  
  @js.native
  sealed trait userNotPresent extends SystemConditionType
  
  @js.native
  sealed trait userPresent extends SystemConditionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SystemConditionType with Double] = js.native
  /* 3 */ @js.native
  object internetAvailable extends TopLevel[internetAvailable with Double]
  
  /* 4 */ @js.native
  object internetNotAvailable extends TopLevel[internetNotAvailable with Double]
  
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 5 */ @js.native
  object sessionConnected extends TopLevel[sessionConnected with Double]
  
  /* 6 */ @js.native
  object sessionDisconnected extends TopLevel[sessionDisconnected with Double]
  
  /* 2 */ @js.native
  object userNotPresent extends TopLevel[userNotPresent with Double]
  
  /* 1 */ @js.native
  object userPresent extends TopLevel[userPresent with Double]
  
}

