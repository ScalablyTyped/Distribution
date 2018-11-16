package typings
package wiiuLib.wiiuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageViewErrorCode extends js.Object

@JSGlobal("wiiu.ImageViewErrorCode")
@js.native
object ImageViewErrorCode extends js.Object {
  @js.native
  sealed trait DIMENSIONS_TOO_LARGE
    extends wiiuLib.wiiuNs.ImageViewErrorCode
  
  @js.native
  sealed trait FILE_SIZE_TOO_LARGE
    extends wiiuLib.wiiuNs.ImageViewErrorCode
  
  @js.native
  sealed trait TOO_MANY_PIXELS_PROGRESSIVE_JPEG
    extends wiiuLib.wiiuNs.ImageViewErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_FORMAT
    extends wiiuLib.wiiuNs.ImageViewErrorCode
  
  /* 203 */ val DIMENSIONS_TOO_LARGE: DIMENSIONS_TOO_LARGE with scala.Double = js.native
  /* 204 */ val FILE_SIZE_TOO_LARGE: FILE_SIZE_TOO_LARGE with scala.Double = js.native
  /* 205 */ val TOO_MANY_PIXELS_PROGRESSIVE_JPEG: TOO_MANY_PIXELS_PROGRESSIVE_JPEG with scala.Double = js.native
  /* 202 */ val UNSUPPORTED_FORMAT: UNSUPPORTED_FORMAT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wiiuLib.wiiuNs.ImageViewErrorCode with scala.Double] = js.native
}

