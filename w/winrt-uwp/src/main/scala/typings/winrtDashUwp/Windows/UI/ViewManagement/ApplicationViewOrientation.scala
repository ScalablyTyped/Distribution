package typings.winrtDashUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewOrientation.landscape
import typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewOrientation.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewOrientation extends js.Object

/** Defines the set of display orientation modes for a window (app view). */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewOrientation")
@js.native
object ApplicationViewOrientation extends js.Object {
  /** The window is in landscape orientation, with the display width greater than the height. */
  @js.native
  sealed trait landscape extends ApplicationViewOrientation
  
  /** The window is in portrait orientation, with the display height greater than the width. */
  @js.native
  sealed trait portrait extends ApplicationViewOrientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationViewOrientation with Double] = js.native
  /* 0 */ @js.native
  object landscape extends TopLevel[landscape with Double]
  
  /* 1 */ @js.native
  object portrait extends TopLevel[portrait with Double]
  
}

