package typings.three

import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/DepthTexture", JSImport.Namespace)
@js.native
object srcTexturesDepthTextureMod extends js.Object {
  @js.native
  class DepthTexture protected () extends Texture {
    def this(
      width: Double,
      heighht: Double,
      `type`: js.UndefOr[TextureDataType],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      anisotropy: js.UndefOr[Double]
    ) = this()
    @JSName("image")
    var image_DepthTexture: Anon_HeightWidth = js.native
  }
  
}

