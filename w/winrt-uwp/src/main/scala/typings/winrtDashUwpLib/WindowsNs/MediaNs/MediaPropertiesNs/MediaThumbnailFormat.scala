package typings
package winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaThumbnailFormat extends js.Object

/** Defines values for media formats for thumbnails. */
@JSGlobal("Windows.Media.MediaProperties.MediaThumbnailFormat")
@js.native
object MediaThumbnailFormat extends js.Object {
  /** BGRA8 media format. */
  @js.native
  sealed trait bgra8
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaThumbnailFormat
  
  /** BMP media format. */
  @js.native
  sealed trait bmp
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaThumbnailFormat
  
  val bgra8: bgra8 with java.lang.String = js.native
  val bmp: bmp with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaThumbnailFormat with java.lang.String
  ] = js.native
}

