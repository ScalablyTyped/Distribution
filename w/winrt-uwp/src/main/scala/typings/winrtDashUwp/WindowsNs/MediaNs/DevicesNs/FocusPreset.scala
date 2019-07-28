package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FocusPreset extends js.Object

/** Defines the values for the possible focus presets. */
@JSGlobal("Windows.Media.Devices.FocusPreset")
@js.native
object FocusPreset extends js.Object {
  /** Indicates that focus is automatically set by the capture. */
  @js.native
  sealed trait auto extends FocusPreset
  
  /** Indicates that the capture device uses a hyperfocal autofocus range. */
  @js.native
  sealed trait autoHyperfocal extends FocusPreset
  
  /** Indicates that the capture device uses an infinite autofocus range. */
  @js.native
  sealed trait autoInfinity extends FocusPreset
  
  /** Indicates that the capture device uses a close autofocus range. */
  @js.native
  sealed trait autoMacro extends FocusPreset
  
  /** Indicates that the capture device uses a normal autofocus range. */
  @js.native
  sealed trait autoNormal extends FocusPreset
  
  /** Indicates that focus is manually set. */
  @js.native
  sealed trait manual extends FocusPreset
  
  /* 0 */ val auto: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.FocusPreset.auto with Double = js.native
  /* 5 */ val autoHyperfocal: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.FocusPreset.autoHyperfocal with Double = js.native
  /* 4 */ val autoInfinity: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.FocusPreset.autoInfinity with Double = js.native
  /* 2 */ val autoMacro: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.FocusPreset.autoMacro with Double = js.native
  /* 3 */ val autoNormal: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.FocusPreset.autoNormal with Double = js.native
  /* 1 */ val manual: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.FocusPreset.manual with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FocusPreset with Double] = js.native
}

