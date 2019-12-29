package typings.winrtDashUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaCaptureThermalStatus extends js.Object

/** Specifies the thermal status of a media capture device. */
@JSGlobal("Windows.Media.Capture.MediaCaptureThermalStatus")
@js.native
object MediaCaptureThermalStatus extends js.Object {
  /** The thermal state is normal. */
  @js.native
  sealed trait normal extends MediaCaptureThermalStatus
  
  /** The capture device is overheated. You should stop the current capture session and save any captured media. */
  @js.native
  sealed trait overheated extends MediaCaptureThermalStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaCaptureThermalStatus with Double] = js.native
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 1 */ @js.native
  object overheated extends TopLevel[overheated with Double]
  
}

