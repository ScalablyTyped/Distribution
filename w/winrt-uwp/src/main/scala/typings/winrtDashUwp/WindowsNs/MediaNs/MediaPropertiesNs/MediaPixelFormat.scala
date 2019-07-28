package typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPixelFormat extends js.Object

/** Defines values for media pixel formats. */
@JSGlobal("Windows.Media.MediaProperties.MediaPixelFormat")
@js.native
object MediaPixelFormat extends js.Object {
  /** BGRA8 media pixel format. */
  @js.native
  sealed trait bgra8 extends MediaPixelFormat
  
  /** NV12 media pixel format. */
  @js.native
  sealed trait nv12 extends MediaPixelFormat
  
  /* 1 */ val bgra8: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaPixelFormat.bgra8 with Double = js.native
  /* 0 */ val nv12: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaPixelFormat.nv12 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPixelFormat with Double] = js.native
}

