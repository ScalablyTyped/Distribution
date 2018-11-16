package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewBoundsMode extends js.Object

/** The bounds used by the framework to lay out the contents of a window (app view). */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewBoundsMode")
@js.native
object ApplicationViewBoundsMode extends js.Object {
  /** Lay out the window's content within the region occupied by the core window (that is, including any occluded areas). */
  @js.native
  sealed trait useCoreWindow
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewBoundsMode
  
  /** Lay out the window's content within the visible region (that is, the region not occluded by chrome such as the status bar and app bar). */
  @js.native
  sealed trait useVisible
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewBoundsMode
  
  val useCoreWindow: useCoreWindow with java.lang.String = js.native
  val useVisible: useVisible with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewBoundsMode with java.lang.String
  ] = js.native
}

