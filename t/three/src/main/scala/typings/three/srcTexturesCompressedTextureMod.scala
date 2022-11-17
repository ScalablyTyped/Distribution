package typings.three

import typings.std.ImageData
import typings.three.anon.Width
import typings.three.srcConstantsMod.CompressedPixelFormat
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesCompressedTextureMod {
  
  @JSImport("three/src/textures/CompressedTexture", "CompressedTexture")
  @js.native
  open class CompressedTexture protected () extends Texture {
    /**
      * @param mipmaps
      * @param width
      * @param height
      * @param [format=THREE.RGBAFormat]
      * @param [type=THREE.UnsignedByteType]
      * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
      * @param [wrapS=THREE.ClampToEdgeWrapping]
      * @param [wrapT=THREE.ClampToEdgeWrapping]
      * @param [magFilter=THREE.LinearFilter]
      * @param [minFilter=THREE.LinearMipmapLinearFilter]
      * @param [anisotropy=1]
      * @param [encoding=THREE.LinearEncoding]
      */
    def this(
      mipmaps: js.Array[ImageData],
      width: Double,
      height: Double,
      format: js.UndefOr[CompressedPixelFormat],
      `type`: js.UndefOr[TextureDataType],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
    
    def image_=(value: Width): Unit = js.native
    
    val isCompressedTexture: true = js.native
    
    @JSName("mipmaps")
    var mipmaps_CompressedTexture: js.Array[ImageData] = js.native
  }
}
