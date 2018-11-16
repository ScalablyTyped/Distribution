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
  
  val leftHanded: leftHanded with java.lang.String = js.native
  val rightHanded: rightHanded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.ViewManagementNs.HandPreference with java.lang.String] = js.native
}

