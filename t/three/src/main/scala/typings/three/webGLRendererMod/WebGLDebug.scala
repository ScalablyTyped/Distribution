package typings.three.webGLRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLDebug extends js.Object {
  
  /**
  	 * Enables error checking and reporting when shader programs are being compiled.
  	 */
  var checkShaderErrors: Boolean = js.native
}
object WebGLDebug {
  
  @scala.inline
  def apply(checkShaderErrors: Boolean): WebGLDebug = {
    val __obj = js.Dynamic.literal(checkShaderErrors = checkShaderErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLDebug]
  }
  
  @scala.inline
  implicit class WebGLDebugOps[Self <: WebGLDebug] (val x: Self) extends AnyVal {
    
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
    def setCheckShaderErrors(value: Boolean): Self = this.set("checkShaderErrors", value.asInstanceOf[js.Any])
  }
}
