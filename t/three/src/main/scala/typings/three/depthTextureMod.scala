package typings.three

import typings.three.anon.HeightWidth
import typings.three.constantsMod.Mapping
import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.Wrapping
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/textures/DepthTexture", JSImport.Namespace)
@js.native
object depthTextureMod extends js.Object {
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
    var image_DepthTexture: HeightWidth = js.native
  }
  
}

