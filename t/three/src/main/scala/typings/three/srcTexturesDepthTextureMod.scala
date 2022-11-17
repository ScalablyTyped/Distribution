package typings.three

import typings.three.anon.Width
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesDepthTextureMod {
  
  @JSImport("three/src/textures/DepthTexture", "DepthTexture")
  @js.native
  open class DepthTexture protected () extends Texture {
    /**
      * @param width
      * @param height
      * @param type
      * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
      * @param [wrapS=THREE.ClampToEdgeWrapping]
      * @param [wrapT=THREE.ClampToEdgeWrapping]
      * @param [magFilter=THREE.NearestFilter]
      * @param [minFilter=THREE.NearestFilter]
      * @param [anisotropy=1]
      */
    def this(
      width: Double,
      height: Double,
      `type`: js.UndefOr[TextureDataType],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      anisotropy: js.UndefOr[Double]
    ) = this()
    
    def image_=(value: Width): Unit = js.native
    
    val isDepthTexture: true = js.native
  }
}
