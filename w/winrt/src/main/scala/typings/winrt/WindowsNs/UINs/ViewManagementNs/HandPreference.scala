package typings.winrt.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HandPreference extends js.Object

@JSGlobal("Windows.UI.ViewManagement.HandPreference")
@js.native
object HandPreference extends js.Object {
  @js.native
  sealed trait leftHanded extends HandPreference
  
  @js.native
  sealed trait rightHanded extends HandPreference
  
  /* 0 */ val leftHanded: typings.winrt.WindowsNs.UINs.ViewManagementNs.HandPreference.leftHanded with Double = js.native
  /* 1 */ val rightHanded: typings.winrt.WindowsNs.UINs.ViewManagementNs.HandPreference.rightHanded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HandPreference with Double] = js.native
}

