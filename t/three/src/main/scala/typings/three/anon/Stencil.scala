package typings.three.anon

import typings.three.webGLStateMod.WebGLColorBuffer
import typings.three.webGLStateMod.WebGLDepthBuffer
import typings.three.webGLStateMod.WebGLStencilBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stencil extends js.Object {
  
  var color: WebGLColorBuffer = js.native
  
  var depth: WebGLDepthBuffer = js.native
  
  var stencil: WebGLStencilBuffer = js.native
}
object Stencil {
  
  @scala.inline
  def apply(color: WebGLColorBuffer, depth: WebGLDepthBuffer, stencil: WebGLStencilBuffer): Stencil = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stencil]
  }
  
  @scala.inline
  implicit class StencilOps[Self <: Stencil] (val x: Self) extends AnyVal {
    
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
    def setColor(value: WebGLColorBuffer): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: WebGLDepthBuffer): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStencil(value: WebGLStencilBuffer): Self = this.set("stencil", value.asInstanceOf[js.Any])
  }
}
