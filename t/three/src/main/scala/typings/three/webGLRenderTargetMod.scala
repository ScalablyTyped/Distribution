package typings.three

import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureEncoding
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.Wrapping
import typings.three.depthTextureMod.DepthTexture
import typings.three.eventDispatcherMod.EventDispatcher
import typings.three.textureMod.Texture
import typings.three.threeBooleans.`true`
import typings.three.vector4Mod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLRenderTargetMod {
  
  @JSImport("three/src/renderers/WebGLRenderTarget", "WebGLRenderTarget")
  @js.native
  class WebGLRenderTarget protected () extends EventDispatcher {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: WebGLRenderTargetOptions) = this()
    
    /**
    	 * @deprecated Use {@link Texture#anisotropy texture.anisotropy} instead.
    	 */
    var anisotropy: js.Any = js.native
    
    def copy(source: WebGLRenderTarget): this.type = js.native
    
    /**
    	 * @default true
    	 */
    var depthBuffer: Boolean = js.native
    
    /**
    	 * @default null
    	 */
    var depthTexture: DepthTexture = js.native
    
    def dispose(): Unit = js.native
    
    /**
    	 * @deprecated Use {@link Texture#format texture.format} instead.
    	 */
    var format: js.Any = js.native
    
    /**
    	 * @deprecated Use {@link Texture#generateMipmaps texture.generateMipmaps} instead.
    	 */
    var generateMipmaps: js.Any = js.native
    
    var height: Double = js.native
    
    val isWebGLRenderTarget: `true` = js.native
    
    /**
    	 * @deprecated Use {@link Texture#magFilter texture.magFilter} instead.
    	 */
    var magFilter: js.Any = js.native
    
    /**
    	 * @deprecated Use {@link Texture#minFilter texture.minFilter} instead.
    	 */
    var minFilter: js.Any = js.native
    
    /**
    	 * @deprecated Use {@link Texture#offset texture.offset} instead.
    	 */
    var offset: js.Any = js.native
    
    /**
    	 * @deprecated Use {@link Texture#repeat texture.repeat} instead.
    	 */
    var repeat: js.Any = js.native
    
    var scissor: Vector4 = js.native
    
    /**
    	 * @default false
    	 */
    var scissorTest: Boolean = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
    
    /**
    	 * @default true
    	 */
    var stencilBuffer: Boolean = js.native
    
    var texture: Texture = js.native
    
    /**
    	 * @deprecated Use {@link Texture#type texture.type} instead.
    	 */
    var `type`: js.Any = js.native
    
    var uuid: String = js.native
    
    var viewport: Vector4 = js.native
    
    var width: Double = js.native
    
    /**
    	 * @deprecated Use {@link Texture#wrapS texture.wrapS} instead.
    	 */
    var wrapS: js.Any = js.native
    
    /**
    	 * @deprecated Use {@link Texture#wrapT texture.wrapT} instead.
    	 */
    var wrapT: js.Any = js.native
  }
  
  @js.native
  trait WebGLRenderTargetOptions extends StObject {
    
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
    implicit class WebGLRenderTargetOptionsMutableBuilder[Self <: WebGLRenderTargetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnisotropy(value: Double): Self = StObject.set(x, "anisotropy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnisotropyUndefined: Self = StObject.set(x, "anisotropy", js.undefined)
      
      @scala.inline
      def setDepthBuffer(value: Boolean): Self = StObject.set(x, "depthBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthBufferUndefined: Self = StObject.set(x, "depthBuffer", js.undefined)
      
      @scala.inline
      def setDepthTexture(value: DepthTexture): Self = StObject.set(x, "depthTexture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthTextureUndefined: Self = StObject.set(x, "depthTexture", js.undefined)
      
      @scala.inline
      def setEncoding(value: TextureEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGenerateMipmaps(value: Boolean): Self = StObject.set(x, "generateMipmaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateMipmapsUndefined: Self = StObject.set(x, "generateMipmaps", js.undefined)
      
      @scala.inline
      def setMagFilter(value: TextureFilter): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagFilterUndefined: Self = StObject.set(x, "magFilter", js.undefined)
      
      @scala.inline
      def setMinFilter(value: TextureFilter): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinFilterUndefined: Self = StObject.set(x, "minFilter", js.undefined)
      
      @scala.inline
      def setStencilBuffer(value: Boolean): Self = StObject.set(x, "stencilBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStencilBufferUndefined: Self = StObject.set(x, "stencilBuffer", js.undefined)
      
      @scala.inline
      def setType(value: TextureDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWrapS(value: Wrapping): Self = StObject.set(x, "wrapS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapSUndefined: Self = StObject.set(x, "wrapS", js.undefined)
      
      @scala.inline
      def setWrapT(value: Wrapping): Self = StObject.set(x, "wrapT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapTUndefined: Self = StObject.set(x, "wrapT", js.undefined)
    }
  }
}
