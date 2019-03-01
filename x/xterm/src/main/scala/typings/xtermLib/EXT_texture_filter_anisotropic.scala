package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EXT_texture_filter_anisotropic extends js.Object {
  val MAX_TEXTURE_MAX_ANISOTROPY_EXT: GLenum
  val TEXTURE_MAX_ANISOTROPY_EXT: GLenum
}

object EXT_texture_filter_anisotropic {
  @scala.inline
  def apply(MAX_TEXTURE_MAX_ANISOTROPY_EXT: GLenum, TEXTURE_MAX_ANISOTROPY_EXT: GLenum): EXT_texture_filter_anisotropic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MAX_TEXTURE_MAX_ANISOTROPY_EXT")(MAX_TEXTURE_MAX_ANISOTROPY_EXT)
    __obj.updateDynamic("TEXTURE_MAX_ANISOTROPY_EXT")(TEXTURE_MAX_ANISOTROPY_EXT)
    __obj.asInstanceOf[EXT_texture_filter_anisotropic]
  }
}

