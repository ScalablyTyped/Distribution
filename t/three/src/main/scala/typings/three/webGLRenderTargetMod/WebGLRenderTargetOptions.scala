package typings.three.webGLRenderTargetMod

import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureEncoding
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.Wrapping
import typings.three.depthTextureMod.DepthTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLRenderTargetOptions extends js.Object {
  
   // UnsignedByteType;
  var anisotropy: js.UndefOr[Double] = js.native
  
   // 1;
  var depthBuffer: js.UndefOr[Boolean] = js.native
  
   // true;
  var depthTexture: js.UndefOr[DepthTexture] = js.native
  
  var encoding: js.UndefOr[TextureEncoding] = js.native
  
  var format: js.UndefOr[Double] = js.native
  
   // false;
  var generateMipmaps: js.UndefOr[Boolean] = js.native
  
  var magFilter: js.UndefOr[TextureFilter] = js.native
  
  var minFilter: js.UndefOr[TextureFilter] = js.native
  
   // true;
  var stencilBuffer: js.UndefOr[Boolean] = js.native
  
   // RGBAFormat;
  var `type`: js.UndefOr[TextureDataType] = js.native
  
  var wrapS: js.UndefOr[Wrapping] = js.native
  
  var wrapT: js.UndefOr[Wrapping] = js.native
}
object WebGLRenderTargetOptions {
  
  @scala.inline
  def apply(): WebGLRenderTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLRenderTargetOptions]
  }
  
  @scala.inline
  implicit class WebGLRenderTargetOptionsOps[Self <: WebGLRenderTargetOptions] (val x: Self) extends AnyVal {
    
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
    def setAnisotropy(value: Double): Self = this.set("anisotropy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnisotropy: Self = this.set("anisotropy", js.undefined)
    
    @scala.inline
    def setDepthBuffer(value: Boolean): Self = this.set("depthBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthBuffer: Self = this.set("depthBuffer", js.undefined)
    
    @scala.inline
    def setDepthTexture(value: DepthTexture): Self = this.set("depthTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthTexture: Self = this.set("depthTexture", js.undefined)
    
    @scala.inline
    def setEncoding(value: TextureEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFormat(value: Double): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGenerateMipmaps(value: Boolean): Self = this.set("generateMipmaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateMipmaps: Self = this.set("generateMipmaps", js.undefined)
    
    @scala.inline
    def setMagFilter(value: TextureFilter): Self = this.set("magFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagFilter: Self = this.set("magFilter", js.undefined)
    
    @scala.inline
    def setMinFilter(value: TextureFilter): Self = this.set("minFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFilter: Self = this.set("minFilter", js.undefined)
    
    @scala.inline
    def setStencilBuffer(value: Boolean): Self = this.set("stencilBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStencilBuffer: Self = this.set("stencilBuffer", js.undefined)
    
    @scala.inline
    def setType(value: TextureDataType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWrapS(value: Wrapping): Self = this.set("wrapS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapS: Self = this.set("wrapS", js.undefined)
    
    @scala.inline
    def setWrapT(value: Wrapping): Self = this.set("wrapT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapT: Self = this.set("wrapT", js.undefined)
  }
}
