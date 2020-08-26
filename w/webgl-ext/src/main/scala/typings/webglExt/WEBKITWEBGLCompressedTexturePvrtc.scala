package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WEBKITWEBGLCompressedTexturePvrtc extends js.Object {
  val COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: Double = js.native
  val COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: Double = js.native
  val COMPRESSED_RGB_PVRTC_2BPPV1_IMG: Double = js.native
  val COMPRESSED_RGB_PVRTC_4BPPV1_IMG: Double = js.native
}

object WEBKITWEBGLCompressedTexturePvrtc {
  @scala.inline
  def apply(
    COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: Double,
    COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: Double,
    COMPRESSED_RGB_PVRTC_2BPPV1_IMG: Double,
    COMPRESSED_RGB_PVRTC_4BPPV1_IMG: Double
  ): WEBKITWEBGLCompressedTexturePvrtc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = COMPRESSED_RGBA_PVRTC_2BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = COMPRESSED_RGBA_PVRTC_4BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGB_PVRTC_2BPPV1_IMG = COMPRESSED_RGB_PVRTC_2BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGB_PVRTC_4BPPV1_IMG = COMPRESSED_RGB_PVRTC_4BPPV1_IMG.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBKITWEBGLCompressedTexturePvrtc]
  }
  @scala.inline
  implicit class WEBKITWEBGLCompressedTexturePvrtcOps[Self <: WEBKITWEBGLCompressedTexturePvrtc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCOMPRESSED_RGBA_PVRTC_2BPPV1_IMG(value: Double): Self = this.set("COMPRESSED_RGBA_PVRTC_2BPPV1_IMG", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMPRESSED_RGBA_PVRTC_4BPPV1_IMG(value: Double): Self = this.set("COMPRESSED_RGBA_PVRTC_4BPPV1_IMG", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMPRESSED_RGB_PVRTC_2BPPV1_IMG(value: Double): Self = this.set("COMPRESSED_RGB_PVRTC_2BPPV1_IMG", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMPRESSED_RGB_PVRTC_4BPPV1_IMG(value: Double): Self = this.set("COMPRESSED_RGB_PVRTC_4BPPV1_IMG", value.asInstanceOf[js.Any])
  }
  
}

