package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FocusPreset with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 5 */ @js.native
  object autoHyperfocal extends TopLevel[autoHyperfocal with Double]
  
  /* 4 */ @js.native
  object autoInfinity extends TopLevel[autoInfinity with Double]
  
  /* 2 */ @js.native
  object autoMacro extends TopLevel[autoMacro with Double]
  
  /* 3 */ @js.native
  object autoNormal extends TopLevel[autoNormal with Double]
  
  /* 1 */ @js.native
  object manual extends TopLevel[manual with Double]
  
}

