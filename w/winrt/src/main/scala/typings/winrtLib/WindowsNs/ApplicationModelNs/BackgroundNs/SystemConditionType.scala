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
  
  val internetAvailable: internetAvailable with java.lang.String = js.native
  val internetNotAvailable: internetNotAvailable with java.lang.String = js.native
  val invalid: invalid with java.lang.String = js.native
  val sessionConnected: sessionConnected with java.lang.String = js.native
  val sessionDisconnected: sessionDisconnected with java.lang.String = js.native
  val userNotPresent: userNotPresent with java.lang.String = js.native
  val userPresent: userPresent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.SystemConditionType with java.lang.String
  ] = js.native
}

