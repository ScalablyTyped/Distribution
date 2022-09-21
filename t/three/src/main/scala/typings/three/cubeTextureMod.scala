package typings.three

import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import typings.three.textureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cubeTextureMod {
  
  @JSImport("three/src/textures/CubeTexture", "CubeTexture")
  @js.native
  open class CubeTexture protected () extends Texture {
    /**
      * @param [images=[]]
      * @param [mapping=THREE.CubeReflectionMapping]
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
      images: js.UndefOr[js.Array[Any]],
      // HTMLImageElement or HTMLCanvasElement
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
    
    var images: Any = js.native
    
    val isCubeTexture: `true` = js.native
  }
}
