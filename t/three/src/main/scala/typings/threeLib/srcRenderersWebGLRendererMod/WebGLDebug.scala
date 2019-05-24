package typings
package threeLib.srcRenderersWebGLRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLDebug extends js.Object {
  /**
    * Enables error checking and reporting when shader programs are being compiled.
    */
  var checkShaderErrors: scala.Boolean
}

object WebGLDebug {
  @scala.inline
  def apply(checkShaderErrors: scala.Boolean): WebGLDebug = {
    val __obj = js.Dynamic.literal(checkShaderErrors = checkShaderErrors)
  
    __obj.asInstanceOf[WebGLDebug]
  }
}

