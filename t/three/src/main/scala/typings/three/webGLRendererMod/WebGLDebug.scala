package typings.three.webGLRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLDebug extends js.Object {
  /**
  	 * Enables error checking and reporting when shader programs are being compiled.
  	 */
  var checkShaderErrors: Boolean
}

object WebGLDebug {
  @scala.inline
  def apply(checkShaderErrors: Boolean): WebGLDebug = {
    val __obj = js.Dynamic.literal(checkShaderErrors = checkShaderErrors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebGLDebug]
  }
}

