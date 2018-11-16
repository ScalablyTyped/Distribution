package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

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
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.FocusPreset
  
  /** Indicates that the capture device uses a hyperfocal autofocus range. */
  @js.native
  sealed trait autoHyperfocal
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.FocusPreset
  
  /** Indicates that the capture device uses an infinite autofocus range. */
  @js.native
  sealed trait autoInfinity
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.FocusPreset
  
  /** Indicates that the capture device uses a close autofocus range. */
  @js.native
  sealed trait autoMacro
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.FocusPreset
  
  /** Indicates that the capture device uses a normal autofocus range. */
  @js.native
  sealed trait autoNormal
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.FocusPreset
  
  /** Indicates that focus is manually set. */
  @js.native
  sealed trait manual
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.FocusPreset
  
  val auto: auto with java.lang.String = js.native
  val autoHyperfocal: autoHyperfocal with java.lang.String = js.native
  val autoInfinity: autoInfinity with java.lang.String = js.native
  val autoMacro: autoMacro with java.lang.String = js.native
  val autoNormal: autoNormal with java.lang.String = js.native
  val manual: manual with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.FocusPreset with java.lang.String] = js.native
}

