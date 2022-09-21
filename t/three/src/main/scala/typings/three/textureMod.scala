package typings.three

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.three.eventDispatcherMod.Event
import typings.three.eventDispatcherMod.EventDispatcher
import typings.three.matrix3Mod.Matrix3
import typings.three.sourceMod.Source
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.PixelFormatGPU
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import typings.three.threeBooleans.`true`
import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textureMod {
  
  @JSImport("three/src/textures/Texture", "Texture")
  @js.native
  open class Texture protected () extends EventDispatcher[Event] {
    /**
      * @param [image]
      * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
      * @param [wrapS=THREE.ClampToEdgeWrapping]
      * @param [wrapT=THREE.ClampToEdgeWrapping]
      * @param [magFilter=THREE.LinearFilter]
      * @param [minFilter=THREE.LinearMipmapLinearFilter]
      * @param [format=THREE.RGBAFormat]
      * @param [type=THREE.UnsignedByteType]
      * @param [anisotropy=1]
      * @param [encoding=THREE.LinearEncoding]
      */
    def this(
      image: js.UndefOr[HTMLImageElement | HTMLCanvasElement | HTMLVideoElement],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
    
    /**
      * @default 1
      */
    var anisotropy: Double = js.native
    
    /**
      * @default new THREE.Vector2( 0, 0 )
      */
    var center: Vector2 = js.native
    
    def copy(source: Texture): this.type = js.native
    
    def dispose(): Unit = js.native
    
    /**
      * @default THREE.LinearEncoding
      */
    var encoding: TextureEncoding = js.native
    
    /**
      * @default true
      */
    var flipY: Boolean = js.native
    
    /**
      * @default THREE.RGBAFormat
      */
    var format: PixelFormat = js.native
    
    /**
      * @default true
      */
    var generateMipmaps: Boolean = js.native
    
    var id: Double = js.native
    
    /**
      * An image object, typically created using the {@link TextureLoader.load} method.
      * This can be any image (e.g., PNG, JPG, GIF, DDS) or video (e.g., MP4, OGG/OGV) type supported by three.js.
      *
      * To use video as a texture you need to have a playing HTML5
      * video element as a source for your texture image and continuously update this texture
      * as long as video is playing - the {@link VideoTexture} class handles this automatically.
      */
    def image: Any = js.native
    /**
      * An image object, typically created using the {@link TextureLoader.load} method.
      * This can be any image (e.g., PNG, JPG, GIF, DDS) or video (e.g., MP4, OGG/OGV) type supported by three.js.
      *
      * To use video as a texture you need to have a playing HTML5
      * video element as a source for your texture image and continuously update this texture
      * as long as video is playing - the {@link VideoTexture} class handles this automatically.
      */
    def image_=(data: Any): Unit = js.native
    
    var internalFormat: PixelFormatGPU | Null = js.native
    
    /**
      * @default false
      */
    var isRenderTargetTexture: Boolean = js.native
    
    val isTexture: `true` = js.native
    
    /**
      * @default THREE.LinearFilter
      */
    var magFilter: TextureFilter = js.native
    
    // ImageData[] for 2D textures and CubeTexture[] for cube textures;
    /**
      * @default THREE.Texture.DEFAULT_MAPPING
      */
    var mapping: Mapping = js.native
    
    /**
      * @default new THREE.Matrix3()
      */
    var matrix: Matrix3 = js.native
    
    /**
      * @default true
      */
    var matrixAutoUpdate: Boolean = js.native
    
    /**
      * @default THREE.LinearMipmapLinearFilter
      */
    var minFilter: TextureFilter = js.native
    
    /**
      * @default []
      */
    var mipmaps: js.Array[Any] = js.native
    
    /**
      * @default ''
      */
    var name: String = js.native
    
    /**
      * @default false
      */
    var needsPMREMUpdate: Boolean = js.native
    
    def needsUpdate_=(value: Boolean): Unit = js.native
    
    /**
      * @default new THREE.Vector2( 0, 0 )
      */
    var offset: Vector2 = js.native
    
    def onUpdate(): Unit = js.native
    
    /**
      * @default false
      */
    var premultiplyAlpha: Boolean = js.native
    
    /**
      * @default new THREE.Vector2( 1, 1 )
      */
    var repeat: Vector2 = js.native
    
    /**
      * @default 0
      */
    var rotation: Double = js.native
    
    /**
      * The data definition of a texture. A reference to the data source can be shared across textures.
      * This is often useful in context of spritesheets where multiple textures render the same data but with different texture transformations.
      */
    var source: Source = js.native
    
    var sourceFile: String = js.native
    
    def toJSON(meta: Any): Any = js.native
    
    def transformUv(uv: Vector2): Vector2 = js.native
    
    /**
      * @default THREE.UnsignedByteType
      */
    var `type`: TextureDataType = js.native
    
    /**
      * @default 4
      */
    var unpackAlignment: Double = js.native
    
    def updateMatrix(): Unit = js.native
    
    /**
      * An object that can be used to store custom data about the Material. It should not hold references to functions as these will not be cloned.
      * @default {}
      */
    var userData: Any = js.native
    
    var uuid: String = js.native
    
    /**
      * @default 0
      */
    var version: Double = js.native
    
    /**
      * @default THREE.ClampToEdgeWrapping
      */
    var wrapS: Wrapping = js.native
    
    /**
      * @default THREE.ClampToEdgeWrapping
      */
    var wrapT: Wrapping = js.native
  }
  /* static members */
  object Texture {
    
    @JSImport("three/src/textures/Texture", "Texture")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/src/textures/Texture", "Texture.DEFAULT_IMAGE")
    @js.native
    def DEFAULT_IMAGE: Any = js.native
    inline def DEFAULT_IMAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_IMAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/textures/Texture", "Texture.DEFAULT_MAPPING")
    @js.native
    def DEFAULT_MAPPING: Any = js.native
    inline def DEFAULT_MAPPING_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAPPING")(x.asInstanceOf[js.Any])
  }
}
