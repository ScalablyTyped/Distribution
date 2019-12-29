package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ManualFocusDistance extends js.Object

/** Defines the options for manual focus distance. */
@JSGlobal("Windows.Media.Devices.ManualFocusDistance")
@js.native
object ManualFocusDistance extends js.Object {
  /** Focus to the hyperfocal distance. */
  @js.native
  sealed trait hyperfocal extends ManualFocusDistance
  
  /** Focus to infinity. */
  @js.native
  sealed trait infinity extends ManualFocusDistance
  
  /** Focus to the nearest distance. */
  @js.native
  sealed trait nearest extends ManualFocusDistance
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ManualFocusDistance with Double] = js.native
  /* 1 */ @js.native
  object hyperfocal extends TopLevel[hyperfocal with Double]
  
  /* 0 */ @js.native
  object infinity extends TopLevel[infinity with Double]
  
  /* 2 */ @js.native
  object nearest extends TopLevel[nearest with Double]
  
}

