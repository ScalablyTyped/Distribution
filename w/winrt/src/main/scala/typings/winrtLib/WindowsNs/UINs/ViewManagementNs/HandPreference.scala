package typings
package winrtLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HandPreference extends js.Object

@JSGlobal("Windows.UI.ViewManagement.HandPreference")
@js.native
object HandPreference extends js.Object {
  @js.native
  sealed trait leftHanded
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.HandPreference
  
  @js.native
  sealed trait rightHanded
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.HandPreference
  
  /* 0 */ val leftHanded: leftHanded with scala.Double = js.native
  /* 1 */ val rightHanded: rightHanded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.ViewManagementNs.HandPreference with scala.Double] = js.native
}

