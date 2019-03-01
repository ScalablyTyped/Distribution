package typings
package webglDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBKIT_WEBGL_compressed_texture_pvrtc extends js.Object {
  val COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: scala.Double
  val COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: scala.Double
  val COMPRESSED_RGB_PVRTC_2BPPV1_IMG: scala.Double
  val COMPRESSED_RGB_PVRTC_4BPPV1_IMG: scala.Double
}

object WEBKIT_WEBGL_compressed_texture_pvrtc {
  @scala.inline
  def apply(
    COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: scala.Double,
    COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: scala.Double,
    COMPRESSED_RGB_PVRTC_2BPPV1_IMG: scala.Double,
    COMPRESSED_RGB_PVRTC_4BPPV1_IMG: scala.Double
  ): WEBKIT_WEBGL_compressed_texture_pvrtc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("COMPRESSED_RGBA_PVRTC_2BPPV1_IMG")(COMPRESSED_RGBA_PVRTC_2BPPV1_IMG)
    __obj.updateDynamic("COMPRESSED_RGBA_PVRTC_4BPPV1_IMG")(COMPRESSED_RGBA_PVRTC_4BPPV1_IMG)
    __obj.updateDynamic("COMPRESSED_RGB_PVRTC_2BPPV1_IMG")(COMPRESSED_RGB_PVRTC_2BPPV1_IMG)
    __obj.updateDynamic("COMPRESSED_RGB_PVRTC_4BPPV1_IMG")(COMPRESSED_RGB_PVRTC_4BPPV1_IMG)
    __obj.asInstanceOf[WEBKIT_WEBGL_compressed_texture_pvrtc]
  }
}

