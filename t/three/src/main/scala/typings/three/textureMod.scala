package typings.three

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.three.constantsMod.Mapping
import typings.three.constantsMod.PixelFormat
import typings.three.constantsMod.PixelFormatGPU
import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureEncoding
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.Wrapping
import typings.three.eventDispatcherMod.EventDispatcher
import typings.three.matrix3Mod.Matrix3
import typings.three.threeBooleans.`true`
import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textureMod {
  
  @JSImport("three/src/textures/Texture", "Texture")
  @js.native
  class Texture protected () extends EventDispatcher {
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
    	 * @default THREE.Texture.DEFAULT_IMAGE
    	 */
    var image: js.Any = js.native
    
    var internalFormat: PixelFormatGPU | Null = js.native
    
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
    
    // HTMLImageElement or ImageData or { width: number, height: number } in some children;
    /**
    	 * @default []
    	 */
    var mipmaps: js.Array[js.Any] = js.native
    
    /**
    	 * @default ''
    	 */
    var name: String = js.native
    
    var needsUpdate: Boolean = js.native
    
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
    
    var sourceFile: String = js.native
    
    def toJSON(meta: js.Any): js.Any = js.native
    
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
    def DEFAULT_IMAGE: js.Any = js.native
    @scala.inline
    def DEFAULT_IMAGE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_IMAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/textures/Texture", "Texture.DEFAULT_MAPPING")
    @js.native
    def DEFAULT_MAPPING: js.Any = js.native
    @scala.inline
    def DEFAULT_MAPPING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAPPING")(x.asInstanceOf[js.Any])
  }
}
