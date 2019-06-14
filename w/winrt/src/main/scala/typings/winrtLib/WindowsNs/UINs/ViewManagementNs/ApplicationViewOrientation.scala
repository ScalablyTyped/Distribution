package typings
package winrtLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewOrientation extends js.Object

@JSGlobal("Windows.UI.ViewManagement.ApplicationViewOrientation")
@js.native
object ApplicationViewOrientation extends js.Object {
  @js.native
  sealed trait landscape
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation
  
  @js.native
  sealed trait portrait
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation
  
  /* 0 */ val landscape: landscape with scala.Double = js.native
  /* 1 */ val portrait: portrait with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation with scala.Double
  ] = js.native
}

