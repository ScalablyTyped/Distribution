package typings.three

import typings.std.ImageData
import typings.three.constantsMod.Mapping
import typings.three.constantsMod.PixelFormat
import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureEncoding
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.Wrapping
import typings.three.polyfillsMod.TypedArray
import typings.three.textureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTextureMod {
  
  @JSImport("three/src/textures/DataTexture", "DataTexture")
  @js.native
  class DataTexture protected () extends Texture {
    /**
    	 * @param data
    	 * @param width
    	 * @param height
    	 * @param [format=THREE.RGBAFormat]
    	 * @param [type=THREE.UnsignedByteType]
    	 * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
    	 * @param [wrapS=THREE.ClampToEdgeWrapping]
    	 * @param [wrapT=THREE.ClampToEdgeWrapping]
    	 * @param [magFilter=THREE.NearestFilter]
    	 * @param [minFilter=THREE.NearestFilter]
    	 * @param [anisotropy=1]
    	 * @param [encoding=THREE.LinearEncoding]
    	 */
    def this(
      data: TypedArray,
      width: Double,
      height: Double,
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
    
    @JSName("image")
    var image_DataTexture: ImageData = js.native
    
    val isDataTexture: `true` = js.native
  }
}
