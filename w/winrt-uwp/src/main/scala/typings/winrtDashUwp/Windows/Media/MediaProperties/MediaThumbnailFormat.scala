package typings.winrtDashUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaThumbnailFormat with Double] = js.native
  /* 1 */ @js.native
  object bgra8 extends TopLevel[bgra8 with Double]
  
  /* 0 */ @js.native
  object bmp extends TopLevel[bmp with Double]
  
}

