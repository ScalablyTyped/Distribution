package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGL_debug_shaders extends js.Object {
  def getTranslatedShaderSource(shader: WebGLShader): java.lang.String
}

object WEBGL_debug_shaders {
  @scala.inline
  def apply(getTranslatedShaderSource: js.Function1[WebGLShader, java.lang.String]): WEBGL_debug_shaders = {
    val __obj = js.Dynamic.literal(getTranslatedShaderSource = getTranslatedShaderSource)
  
    __obj.asInstanceOf[WEBGL_debug_shaders]
  }
}

