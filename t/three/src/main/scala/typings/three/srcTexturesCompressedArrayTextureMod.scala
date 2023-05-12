package typings.three

import typings.std.ImageData
import typings.three.anon.DepthHeight
import typings.three.srcConstantsMod.CompressedPixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesCompressedTextureMod.CompressedTexture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesCompressedArrayTextureMod {
  
  @JSImport("three/src/textures/CompressedArrayTexture", "CompressedArrayTexture")
  @js.native
  open class CompressedArrayTexture protected () extends CompressedTexture {
    /**
      * Create a new instance of {@link CompressedArrayTexture}
      * @param mipmaps The mipmaps array should contain objects with data, width and height.
      * The mipmaps should be of the correct {@link format} and {@link type}. See {@link THREE.mipmaps}.
      * @param width The width of the biggest mipmap.
      * @param height The height of the biggest mipmap.
      * @param depth The number of layers of the 2D array texture
      * @param format The format used in the mipmaps. See {@link THREE.CompressedPixelFormat}.
      * @param type See {@link Texture.type | .type}. Default {@link THREE.UnsignedByteType}
      */
    def this(
      mipmaps: js.Array[ImageData],
      width: Double,
      height: Double,
      depth: Double,
      format: CompressedPixelFormat
    ) = this()
    def this(
      mipmaps: js.Array[ImageData],
      width: Double,
      height: Double,
      depth: Double,
      format: CompressedPixelFormat,
      `type`: TextureDataType
    ) = this()
    
    def image_=(value: DepthHeight): Unit = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link CompressedArrayTexture}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isCompressedArrayTexture: `true` = js.native
    
    /**
      * This defines how the texture is wrapped in the depth direction.
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/Textures | Texture Constants}
      * @defaultValue {@link THREE.ClampToEdgeWrapping}
      */
    var wrapR: Wrapping = js.native
  }
}
