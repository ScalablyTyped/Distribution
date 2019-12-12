package typings.winrtDashUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewBoundsMode.useCoreWindow
import typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewBoundsMode.useVisible
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
  sealed trait useCoreWindow extends ApplicationViewBoundsMode
  
  /** Lay out the window's content within the visible region (that is, the region not occluded by chrome such as the status bar and app bar). */
  @js.native
  sealed trait useVisible extends ApplicationViewBoundsMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationViewBoundsMode with Double] = js.native
  /* 1 */ @js.native
  object useCoreWindow extends TopLevel[useCoreWindow with Double]
  
  /* 0 */ @js.native
  object useVisible extends TopLevel[useVisible with Double]
  
}

