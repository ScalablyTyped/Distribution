package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EXT_sRGB extends js.Object {
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: GLenum
  val SRGB8_ALPHA8_EXT: GLenum
  val SRGB_ALPHA_EXT: GLenum
  val SRGB_EXT: GLenum
}

object EXT_sRGB {
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: GLenum,
    SRGB8_ALPHA8_EXT: GLenum,
    SRGB_ALPHA_EXT: GLenum,
    SRGB_EXT: GLenum
  ): EXT_sRGB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT")(FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT)
    __obj.updateDynamic("SRGB8_ALPHA8_EXT")(SRGB8_ALPHA8_EXT)
    __obj.updateDynamic("SRGB_ALPHA_EXT")(SRGB_ALPHA_EXT)
    __obj.updateDynamic("SRGB_EXT")(SRGB_EXT)
    __obj.asInstanceOf[EXT_sRGB]
  }
}

