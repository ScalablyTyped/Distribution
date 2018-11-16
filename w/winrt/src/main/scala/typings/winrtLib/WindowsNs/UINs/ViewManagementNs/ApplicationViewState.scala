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
  
  val filled: filled with java.lang.String = js.native
  val fullScreenLandscape: fullScreenLandscape with java.lang.String = js.native
  val fullScreenPortrait: fullScreenPortrait with java.lang.String = js.native
  val snapped: snapped with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState with java.lang.String
  ] = js.native
}

