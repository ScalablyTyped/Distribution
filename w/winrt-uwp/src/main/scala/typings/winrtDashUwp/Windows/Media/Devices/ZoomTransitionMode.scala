package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZoomTransitionMode extends js.Object

/** Defines the zoom transition modes. */
@JSGlobal("Windows.Media.Devices.ZoomTransitionMode")
@js.native
object ZoomTransitionMode extends js.Object {
  /** The default zoom transition mode for the device. Can be Direct or Smooth, depending on the device. */
  @js.native
  sealed trait auto extends ZoomTransitionMode
  
  /** The zoom transition is instantaneous. */
  @js.native
  sealed trait direct extends ZoomTransitionMode
  
  /** The zoom transition is smooth. */
  @js.native
  sealed trait smooth extends ZoomTransitionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ZoomTransitionMode with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 1 */ @js.native
  object direct extends TopLevel[direct with Double]
  
  /* 2 */ @js.native
  object smooth extends TopLevel[smooth with Double]
  
}

