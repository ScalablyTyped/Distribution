package typings.three.webXRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRWebGLLayerInit extends js.Object {
  
  var alpha: js.UndefOr[Boolean] = js.native
  
  var antialias: js.UndefOr[Boolean] = js.native
  
  var depth: js.UndefOr[Boolean] = js.native
  
  var framebufferScaleFactor: js.UndefOr[Double] = js.native
  
  var ignoreDepthValues: js.UndefOr[Boolean] = js.native
  
  var stencil: js.UndefOr[Boolean] = js.native
}
object XRWebGLLayerInit {
  
  @scala.inline
  def apply(): XRWebGLLayerInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRWebGLLayerInit]
  }
  
  @scala.inline
  implicit class XRWebGLLayerInitOps[Self <: XRWebGLLayerInit] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setAntialias(value: Boolean): Self = this.set("antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntialias: Self = this.set("antialias", js.undefined)
    
    @scala.inline
    def setDepth(value: Boolean): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setFramebufferScaleFactor(value: Double): Self = this.set("framebufferScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramebufferScaleFactor: Self = this.set("framebufferScaleFactor", js.undefined)
    
    @scala.inline
    def setIgnoreDepthValues(value: Boolean): Self = this.set("ignoreDepthValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDepthValues: Self = this.set("ignoreDepthValues", js.undefined)
    
    @scala.inline
    def setStencil(value: Boolean): Self = this.set("stencil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStencil: Self = this.set("stencil", js.undefined)
  }
}
