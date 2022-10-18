package typings.three

import typings.std.BufferSource
import typings.std.ImageData
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesTextureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesDataTextureMod {
  
  @JSImport("three/src/textures/DataTexture", "DataTexture")
  @js.native
  open class DataTexture protected () extends Texture {
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
      data: js.UndefOr[BufferSource | Null],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
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
    
    def image_=(value: ImageData): Unit = js.native
    
    val isDataTexture: `true` = js.native
  }
}
