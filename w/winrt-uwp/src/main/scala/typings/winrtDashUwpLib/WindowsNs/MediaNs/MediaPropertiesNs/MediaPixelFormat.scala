package typings
package winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs

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
  sealed trait bgra8
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaPixelFormat
  
  /** NV12 media pixel format. */
  @js.native
  sealed trait nv12
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaPixelFormat
  
  val bgra8: bgra8 with java.lang.String = js.native
  val nv12: nv12 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaPixelFormat with java.lang.String
  ] = js.native
}

