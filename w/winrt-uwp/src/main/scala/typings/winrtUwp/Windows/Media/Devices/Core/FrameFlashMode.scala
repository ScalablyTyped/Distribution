package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrameFlashMode extends js.Object

/** Specifies the flash mode for a frame in a variable photo sequence. */
@JSGlobal("Windows.Media.Devices.Core.FrameFlashMode")
@js.native
object FrameFlashMode extends js.Object {
  /** The flash is disabled. */
  @js.native
  sealed trait disable extends FrameFlashMode
  
  /** The flash is enabled. */
  @js.native
  sealed trait enable extends FrameFlashMode
  
  /** The flash uses the global flash mode. */
  @js.native
  sealed trait global extends FrameFlashMode
  
}

