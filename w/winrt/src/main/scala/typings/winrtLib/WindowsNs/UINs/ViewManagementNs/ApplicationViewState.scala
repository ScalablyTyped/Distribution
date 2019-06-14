package typings
package winrtLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewState extends js.Object

@JSGlobal("Windows.UI.ViewManagement.ApplicationViewState")
@js.native
object ApplicationViewState extends js.Object {
  @js.native
  sealed trait filled
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState
  
  @js.native
  sealed trait fullScreenLandscape
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState
  
  @js.native
  sealed trait fullScreenPortrait
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState
  
  @js.native
  sealed trait snapped
    extends winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState
  
  /* 1 */ val filled: filled with scala.Double = js.native
  /* 0 */ val fullScreenLandscape: fullScreenLandscape with scala.Double = js.native
  /* 3 */ val fullScreenPortrait: fullScreenPortrait with scala.Double = js.native
  /* 2 */ val snapped: snapped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState with scala.Double] = js.native
}

