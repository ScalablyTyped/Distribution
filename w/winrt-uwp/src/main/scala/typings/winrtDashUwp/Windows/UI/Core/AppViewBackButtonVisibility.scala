package typings.winrtDashUwp.Windows.UI.Core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppViewBackButtonVisibility extends js.Object

/** Defines constants that specify whether the back button is shown in the system UI. */
@JSGlobal("Windows.UI.Core.AppViewBackButtonVisibility")
@js.native
object AppViewBackButtonVisibility extends js.Object {
  /** The back button is not shown and space is not reserved for it in the layout. */
  @js.native
  sealed trait collapsed extends AppViewBackButtonVisibility
  
  /** The back button is shown. */
  @js.native
  sealed trait visible extends AppViewBackButtonVisibility
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppViewBackButtonVisibility with Double] = js.native
  /* 1 */ @js.native
  object collapsed extends TopLevel[collapsed with Double]
  
  /* 0 */ @js.native
  object visible extends TopLevel[visible with Double]
  
}

