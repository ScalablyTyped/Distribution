package typings.three

import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreEventDispatcherMod.EventDispatcher
import typings.three.srcMathVector4Mod.Vector4
import typings.three.srcTexturesDepthTextureMod.DepthTexture
import typings.three.srcTexturesTextureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebGLRenderTargetMod {
  
  @JSImport("three/src/renderers/WebGLRenderTarget", "WebGLRenderTarget")
  @js.native
  open class WebGLRenderTarget () extends EventDispatcher[Event] {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Unit, height: Double) = this()
    def this(width: Double, height: Double, options: WebGLRenderTargetOptions) = this()
    def this(width: Double, height: Unit, options: WebGLRenderTargetOptions) = this()
    def this(width: Unit, height: Double, options: WebGLRenderTargetOptions) = this()
    def this(width: Unit, height: Unit, options: WebGLRenderTargetOptions) = this()
    
    /**
      * @deprecated Use {@link Texture#anisotropy texture.anisotropy} instead.
      */
    var anisotropy: Any = js.native
    
    def copy(source: WebGLRenderTarget): this.type = js.native
    
    var depth: Double = js.native
    
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
    var format: Any = js.native
    
    /**
      * @deprecated Use {@link Texture#generateMipmaps texture.generateMipmaps} instead.
      */
    var generateMipmaps: Any = js.native
    
    var height: Double = js.native
    
    val isWebGLRenderTarget: `true` = js.native
    
    /**
      * @deprecated Use {@link Texture#magFilter texture.magFilter} instead.
      */
    var magFilter: Any = js.native
    
    /**
      * @deprecated Use {@link Texture#minFilter texture.minFilter} instead.
      */
    var minFilter: Any = js.native
    
    /**
      * @deprecated Use {@link Texture#offset texture.offset} instead.
      */
    var offset: Any = js.native
    
    /**
      * @deprecated Use {@link Texture#repeat texture.repeat} instead.
      */
    var repeat: Any = js.native
    
    /**
      * Defines the count of MSAA samples. Can only be used with WebGL 2. Default is **0**.
      * @default 0
      */
    var samples: Double = js.native
    
    var scissor: Vector4 = js.native
    
    /**
      * @default false
      */
    var scissorTest: Boolean = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
    def setSize(width: Double, height: Double, depth: Double): Unit = js.native
    
    /**
      * @default true
      */
    var stencilBuffer: Boolean = js.native
    
    var texture: Texture = js.native
    
    /**
      * @deprecated Use {@link Texture#type texture.type} instead.
      */
    var `type`: Any = js.native
    
    var viewport: Vector4 = js.native
    
    var width: Double = js.native
    
    /**
      * @deprecated Use {@link Texture#wrapS texture.wrapS} instead.
      */
    var wrapS: Any = js.native
    
    /**
      * @deprecated Use {@link Texture#wrapT texture.wrapT} instead.
      */
    var wrapT: Any = js.native
  }
  
  trait WebGLRenderTargetOptions extends StObject {
    
    // UnsignedByteType;
    var anisotropy: js.UndefOr[Double] = js.undefined
    
    // 1;
    var depthBuffer: js.UndefOr[Boolean] = js.undefined
    
    // true;
    var depthTexture: js.UndefOr[DepthTexture] = js.undefined
    
    var encoding: js.UndefOr[TextureEncoding] = js.undefined
    
    var format: js.UndefOr[Double] = js.undefined
    
    // false;
    var generateMipmaps: js.UndefOr[Boolean] = js.undefined
    
    var magFilter: js.UndefOr[TextureFilter] = js.undefined
    
    var minFilter: js.UndefOr[TextureFilter] = js.undefined
    
    /**
      * Defines the count of MSAA samples. Can only be used with WebGL 2. Default is **0**.
      * @default 0
      */
    var samples: js.UndefOr[Double] = js.undefined
    
    // true;
    var stencilBuffer: js.UndefOr[Boolean] = js.undefined
    
    // RGBAFormat;
    var `type`: js.UndefOr[TextureDataType] = js.undefined
    
    var wrapS: js.UndefOr[Wrapping] = js.undefined
    
    var wrapT: js.UndefOr[Wrapping] = js.undefined
  }
  object WebGLRenderTargetOptions {
    
    inline def apply(): WebGLRenderTargetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebGLRenderTargetOptions]
    }
    
    extension [Self <: WebGLRenderTargetOptions](x: Self) {
      
      inline def setAnisotropy(value: Double): Self = StObject.set(x, "anisotropy", value.asInstanceOf[js.Any])
      
      inline def setAnisotropyUndefined: Self = StObject.set(x, "anisotropy", js.undefined)
      
      inline def setDepthBuffer(value: Boolean): Self = StObject.set(x, "depthBuffer", value.asInstanceOf[js.Any])
      
      inline def setDepthBufferUndefined: Self = StObject.set(x, "depthBuffer", js.undefined)
      
      inline def setDepthTexture(value: DepthTexture): Self = StObject.set(x, "depthTexture", value.asInstanceOf[js.Any])
      
      inline def setDepthTextureUndefined: Self = StObject.set(x, "depthTexture", js.undefined)
      
      inline def setEncoding(value: TextureEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGenerateMipmaps(value: Boolean): Self = StObject.set(x, "generateMipmaps", value.asInstanceOf[js.Any])
      
      inline def setGenerateMipmapsUndefined: Self = StObject.set(x, "generateMipmaps", js.undefined)
      
      inline def setMagFilter(value: TextureFilter): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
      
      inline def setMagFilterUndefined: Self = StObject.set(x, "magFilter", js.undefined)
      
      inline def setMinFilter(value: TextureFilter): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
      
      inline def setMinFilterUndefined: Self = StObject.set(x, "minFilter", js.undefined)
      
      inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
      
      inline def setStencilBuffer(value: Boolean): Self = StObject.set(x, "stencilBuffer", value.asInstanceOf[js.Any])
      
      inline def setStencilBufferUndefined: Self = StObject.set(x, "stencilBuffer", js.undefined)
      
      inline def setType(value: TextureDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWrapS(value: Wrapping): Self = StObject.set(x, "wrapS", value.asInstanceOf[js.Any])
      
      inline def setWrapSUndefined: Self = StObject.set(x, "wrapS", js.undefined)
      
      inline def setWrapT(value: Wrapping): Self = StObject.set(x, "wrapT", value.asInstanceOf[js.Any])
      
      inline def setWrapTUndefined: Self = StObject.set(x, "wrapT", js.undefined)
    }
  }
}
