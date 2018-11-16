package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageInfo extends js.Object

/* cl_image_info */
@JSGlobal("WEBCL.ImageInfo")
@js.native
object ImageInfo extends js.Object {
  @js.native
  sealed trait IMAGE_ELEMENT_SIZE
    extends webclLib.WEBCLNs.ImageInfo
  
  @js.native
  sealed trait IMAGE_FORMAT
    extends webclLib.WEBCLNs.ImageInfo
  
  @js.native
  sealed trait IMAGE_HEIGHT
    extends webclLib.WEBCLNs.ImageInfo
  
  @js.native
  sealed trait IMAGE_ROW_PITCH
    extends webclLib.WEBCLNs.ImageInfo
  
  @js.native
  sealed trait IMAGE_WIDTH
    extends webclLib.WEBCLNs.ImageInfo
  
  /* 0x1111 */ val IMAGE_ELEMENT_SIZE: IMAGE_ELEMENT_SIZE with scala.Double = js.native
  /* 0x1110 */ val IMAGE_FORMAT: IMAGE_FORMAT with scala.Double = js.native
  /* 0x1115 */ val IMAGE_HEIGHT: IMAGE_HEIGHT with scala.Double = js.native
  /* 0x1112 */ val IMAGE_ROW_PITCH: IMAGE_ROW_PITCH with scala.Double = js.native
  /* 0x1114 */ val IMAGE_WIDTH: IMAGE_WIDTH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.ImageInfo with scala.Double] = js.native
}

