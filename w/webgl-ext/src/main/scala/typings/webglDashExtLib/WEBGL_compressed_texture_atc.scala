package typings
package webglDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGL_compressed_texture_atc extends js.Object {
  val COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL: scala.Double
  val COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL: scala.Double
  val COMPRESSED_RGB_ATC_WEBGL: scala.Double
}

object WEBGL_compressed_texture_atc {
  @scala.inline
  def apply(
    COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL: scala.Double,
    COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL: scala.Double,
    COMPRESSED_RGB_ATC_WEBGL: scala.Double
  ): WEBGL_compressed_texture_atc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL")(COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL)
    __obj.updateDynamic("COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL")(COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL)
    __obj.updateDynamic("COMPRESSED_RGB_ATC_WEBGL")(COMPRESSED_RGB_ATC_WEBGL)
    __obj.asInstanceOf[WEBGL_compressed_texture_atc]
  }
}

