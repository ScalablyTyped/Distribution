package typings.three

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesTextureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesCanvasTextureMod {
  
  @JSImport("three/src/textures/CanvasTexture", "CanvasTexture")
  @js.native
  open class CanvasTexture protected () extends Texture {
    /**
      * @param canvas
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
      canvas: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap,
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double]
    ) = this()
    
    val isCanvasTexture: `true` = js.native
  }
}
