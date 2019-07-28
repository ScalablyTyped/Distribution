package typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs

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
  sealed trait bgra8 extends MediaThumbnailFormat
  
  /** BMP media format. */
  @js.native
  sealed trait bmp extends MediaThumbnailFormat
  
  /* 1 */ val bgra8: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaThumbnailFormat.bgra8 with Double = js.native
  /* 0 */ val bmp: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaThumbnailFormat.bmp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaThumbnailFormat with Double] = js.native
}

