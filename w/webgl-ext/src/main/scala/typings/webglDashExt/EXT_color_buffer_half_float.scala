package typings.webglDashExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebGL 1 Extensions
trait EXT_color_buffer_half_float extends js.Object {
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Double
  val RGB16F_EXT: Double
  val RGBA16F_EXT: Double
  val UNSIGNED_NORMALIZED_EXT: Double
}

object EXT_color_buffer_half_float {
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Double,
    RGB16F_EXT: Double,
    RGBA16F_EXT: Double,
    UNSIGNED_NORMALIZED_EXT: Double
  ): EXT_color_buffer_half_float = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT, RGB16F_EXT = RGB16F_EXT, RGBA16F_EXT = RGBA16F_EXT, UNSIGNED_NORMALIZED_EXT = UNSIGNED_NORMALIZED_EXT)
  
    __obj.asInstanceOf[EXT_color_buffer_half_float]
  }
}

