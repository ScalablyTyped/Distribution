package typings.winrt.Windows.ApplicationModel.Background

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
  
  /* 3 */ val internetAvailable: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.internetAvailable with Double = js.native
  /* 4 */ val internetNotAvailable: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.internetNotAvailable with Double = js.native
  /* 0 */ val invalid: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.invalid with Double = js.native
  /* 5 */ val sessionConnected: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.sessionConnected with Double = js.native
  /* 6 */ val sessionDisconnected: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.sessionDisconnected with Double = js.native
  /* 2 */ val userNotPresent: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.userNotPresent with Double = js.native
  /* 1 */ val userPresent: typings.winrt.Windows.ApplicationModel.Background.SystemConditionType.userPresent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SystemConditionType with Double] = js.native
}

