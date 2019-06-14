package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemConditionType extends js.Object

@JSGlobal("Windows.ApplicationModel.Background.SystemConditionType")
@js.native
object SystemConditionType extends js.Object {
  @js.native
  sealed trait internetAvailable
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  @js.native
  sealed trait internetNotAvailable
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  @js.native
  sealed trait invalid
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  @js.native
  sealed trait sessionConnected
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  @js.native
  sealed trait sessionDisconnected
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  @js.native
  sealed trait userNotPresent
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  @js.native
  sealed trait userPresent
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType
  
  /* 3 */ val internetAvailable: internetAvailable with scala.Double = js.native
  /* 4 */ val internetNotAvailable: internetNotAvailable with scala.Double = js.native
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 5 */ val sessionConnected: sessionConnected with scala.Double = js.native
  /* 6 */ val sessionDisconnected: sessionDisconnected with scala.Double = js.native
  /* 2 */ val userNotPresent: userNotPresent with scala.Double = js.native
  /* 1 */ val userPresent: userPresent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType with scala.Double
  ] = js.native
}

