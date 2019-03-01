package typings
package webglDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebGL 1 Extensions
trait EXT_color_buffer_half_float extends js.Object {
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: scala.Double
  val RGB16F_EXT: scala.Double
  val RGBA16F_EXT: scala.Double
  val UNSIGNED_NORMALIZED_EXT: scala.Double
}

object EXT_color_buffer_half_float {
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: scala.Double,
    RGB16F_EXT: scala.Double,
    RGBA16F_EXT: scala.Double,
    UNSIGNED_NORMALIZED_EXT: scala.Double
  ): EXT_color_buffer_half_float = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT")(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT)
    __obj.updateDynamic("RGB16F_EXT")(RGB16F_EXT)
    __obj.updateDynamic("RGBA16F_EXT")(RGBA16F_EXT)
    __obj.updateDynamic("UNSIGNED_NORMALIZED_EXT")(UNSIGNED_NORMALIZED_EXT)
    __obj.asInstanceOf[EXT_color_buffer_half_float]
  }
}

