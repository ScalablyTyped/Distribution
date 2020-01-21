package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HdrVideoMode extends js.Object

/** Defines the High Dynamic Range (HDR) video modes. */
@JSGlobal("Windows.Media.Devices.HdrVideoMode")
@js.native
object HdrVideoMode extends js.Object {
  /** The system dynamically enables HDR video capture when appropriate. */
  @js.native
  sealed trait auto extends HdrVideoMode
  
  /** HDR video capture is disabled. */
  @js.native
  sealed trait off extends HdrVideoMode
  
  /** HDR video capture is enabled. */
  @js.native
  sealed trait on extends HdrVideoMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HdrVideoMode with Double] = js.native
  /* 2 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 0 */ @js.native
  object off extends TopLevel[off with Double]
  
  /* 1 */ @js.native
  object on extends TopLevel[on with Double]
  
}

