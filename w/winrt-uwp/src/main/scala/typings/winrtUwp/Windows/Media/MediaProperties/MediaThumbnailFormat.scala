package typings.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
